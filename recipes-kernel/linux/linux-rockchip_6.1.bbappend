FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-HACK-remove-hardcoded-rootfs.patch \
	file://0002-Add-ODROID-M2-Support.patch \
	file://0003-Add-ODROID-M1-support.patch \
	file://0004-Add-ODROID-M1S-support.patch \
	file://0005-rockchip-hdmi-silence-output.patch \
"
