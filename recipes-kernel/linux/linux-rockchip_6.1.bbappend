FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-HACK-remove-hardcoded-rootfs.patch \
	file://0002-Add-ODROID-M2-Support.patch \
	file://0003-Add-ODROID-M1-support.patch"
