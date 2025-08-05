SUMMARY = "Set default audio card to card 1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://asound.conf"


S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

do_install:append() {
    install -Dm644 ${WORKDIR}/asound.conf ${D}${sysconfdir}/asound.conf
}

FILES:${PN} += " ${sysconfdir}/asound.conf "