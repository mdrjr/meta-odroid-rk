FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRCREV = "fa5bf8dce12ca3e383800afe32cfe165788a6cca"
SRC_URI:remove = "git://github.com/JeffyCN/mirrors.git;protocol=https;nobranch=1;branch=kernel-6.1-2024_04_14;"
SRC_URI += "git://github.com/mdrjr/linux.git;protocol=https;nobranch=1;branch=linux-6.1-stan-rkr4; \
            file://rtl.cfg \
            file://0001-rtl8821au-shut-up-gcc-15-header-guard-whining.patch \
            file://0011-drm-bridge-dw-hdmi-quit-trusting-U-Boot-s-HDMI-state-redo-the-setup.patch"
