DESCRIPTION = "LED indicator"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PV = "1.0"

PR = "r0"

SRC_URI = "\
    file://internet-ledd.sh \
    file://led-indicator.c \
    file://led-indicatorc.sh \
    file://internet-led.service \
    file://stop-power-led.service \
"

S = "${WORKDIR}/"

do_compile() {
    ${CC} ${WORKDIR}/led-indicator.c -o led-indicator
}

do_install() {
    install -d ${D}${bindir}
    install -m 755 ${S}led-indicatorc.sh ${D}${bindir}/led-indicatorc

    install -m 755 ${S}internet-ledd.sh ${D}${bindir}/internet-ledd

    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/stop-power-led.service ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/internet-led.service ${D}${systemd_unitdir}/system
}

inherit systemd
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "stop-power-led.service internet-led.service"
