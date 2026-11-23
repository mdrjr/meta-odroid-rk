FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRCREV = "b71dba0db2ee737d998740823571af6a6221e17f"
SRC_URI:remove = "git://github.com/rockchip-linux/kernel.git;protocol=https;nobranch=1;branch=develop-6.12;"
SRC_URI += "git://github.com/mdrjr/linux.git;protocol=https;nobranch=1;branch=rk-6.12; \
            file://rtl.cfg \
            file://0011-drm-bridge-dw-hdmi-quit-trusting-U-Boot-s-HDMI-state-redo-the-setup.patch"

KBUILD_DEFCONFIG = "odroid_linux_defconfig"
ODROID_KERNEL_CONFIGS = "rockchip_linux_defconfig rk3568.config"
ODROID_KERNEL_CONFIGS:odroid-m1s = "rockchip_linux_defconfig rk3566.config"
ODROID_KERNEL_CONFIGS:odroid-m2 = "rockchip_linux_defconfig rk3588.config rk3588_linux.config"

do_kernel_metadata:prepend() {
	(cd ${S}/arch/${ARCH}/configs && cat ${ODROID_KERNEL_CONFIGS} > ${KBUILD_DEFCONFIG})
}
