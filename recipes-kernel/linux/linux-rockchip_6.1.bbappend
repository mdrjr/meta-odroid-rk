FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://rtl.cfg \
            file://0002-arm64-dts-rockchip-Add-ODROID-M2.patch \
            file://0005-drivers-net-wireless-Add-Realtek-vendor-driver.patch \
            file://0003-arm64-dts-rockchip-Add-ODROID-M1.patch \
            file://0010-drivers-wireless-rtl8821au-vendor-c-20-standard-fix.patch \
            file://0004-arm64-dts-rockchip-Add-ODROID-M1S.patch"

