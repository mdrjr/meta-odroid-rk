inherit image
inherit deploy
inherit core-image

DEPENDS += "u-boot-odroid-rk odroid-autostart-cfg"

IMAGE_FEATURES += "package-management serial-autologin-root ssh-server-dropbear weston"

IMAGE_INSTALL += "chromium-ozone-wayland drm-cursor weston"
IMAGE_INSTALL += " \
	odroid-autostart-script \
	rockchip-librga \
	v4l-rkmpp \
	glmark2 \
	v4l-utils \
	rockchip-mpp \
	rockchip-alsa-config \
	alsa-lib \
	alsa-plugins \
	alsa-tools \
	alsa-utils \
	initscripts \
	packagegroup-core-boot \
	udev-conf-rockchip \
	openssl \
	net-tools \
	ntp-utils \
	${ROOTFS_PKGMANAGE} \
	avahi-daemon \
	ca-certificates \
	dropbear \
	e2fsprogs-e2fsck \
	e2fsprogs-mke2fs \
	e2fsprogs-tune2fs \
	glibc-binary-localedata-en-gb \
	nfs-utils-client \
	openssh-sftp \
	openssh-sftp-server \
	opkg \
	packagegroup-base \
	packagegroup-core-boot \
	packagegroup-core-weston \
	parted \
	nfs-utils \
	sdparm \
	tzdata \
"

python() { 
    if d.getVar('DEPENDS').find('u-boot-odroid-rk') != -1:
        d.appendVar('BOOT_FILES', ' boot.scr ')
        d.appendVar('IMAGE_BOOT_FILES', ' boot.scr ')

    if d.getVar('DEPENDS').find('odroid-autostart') != -1:
        d.appendVar('BOOT_FILES', ' autostart.cfg ')
        d.appendVar('IMAGE_BOOT_FILES', ' autostart.cfg ')

}


VIRTUAL-RUNTIME_init_manager = "systemd"
VIRTUAL-RUNTIME_initscripts = "systemd-compat-units"

