HOMEPAGE = "http://www.denx.de/wiki/U-Boot/WebHome"
SECTION = "bootloaders"
DEPENDS += "flex-native bison-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"
PE = "1"
PR = "r0"

# We use the revision in order to avoid having to fetch it from the
# repo during parse
SRCREV = "61ba1244b548463dbfb3c5285b6b22e7c772c5bd"

SRC_URI = " \
    git://git.denx.de/u-boot.git \
"

S = "${WORKDIR}/git"
