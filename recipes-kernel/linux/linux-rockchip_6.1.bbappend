FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://rtl.cfg \
            file://0002-arm64-dts-rockchip-Add-ODROID-M2.patch \
            file://0005-drivers-net-wireless-Add-Realtek-vendor-driver.patch \
            file://0003-arm64-dts-rockchip-Add-ODROID-M1.patch \
            file://0010-drivers-wireless-rtl8821au-vendor-c-20-standard-fix.patch \
            file://0004-arm64-dts-rockchip-Add-ODROID-M1S.patch \
            file://0011-drm-bridge-dw-hdmi-quit-trusting-U-Boot-s-HDMI-state-redo-the-setup.patch \
            file://0012-arm64-dts-odroid-m1-m1s-vp0-gets-a-real-cursor-plane-finally.patch"
