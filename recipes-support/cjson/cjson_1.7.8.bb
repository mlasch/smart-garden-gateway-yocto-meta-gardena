DESCRIPTION = "Ultralightweight JSON parser in ANSI C"
HOMEPAGE = "https://github.com/DaveGamble/cJSON"
AUTHOR = "Dave Gamble"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=218947f77e8cb8e2fa02918dc41c50d0"

SRC_URI = "git://github.com/DaveGamble/cJSON.git;protocol=http"

SRCREV = "08103f048e5f54c8f60aaefda16761faf37114f2"

inherit cmake

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DENABLE_CJSON_UTILS=On \
				  -DENABLE_CJSON_TEST=Off \
				  -DENABLE_CUSTOM_COMPILER_FLAGS=OFF \
				  -DBUILD_SHARED_AND_STATIC_LIBS=On \
				  -DCMAKE_INSTALL_PREFIX=/usr "

FILES_${PN} += "/usr/lib/* \
		/usr/include/cjson/* "
