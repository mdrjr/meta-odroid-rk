inherit image
inherit deploy
inherit core-image

DEPENDS += "u-boot-odroid-rk"

IMAGE_FEATURES += "package-management serial-autologin-root ssh-server-dropbear weston"

IMAGE_INSTALL += "chromium-ozone-wayland drm-cursor weston"
IMAGE_INSTALL += " \
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

BOOT_FILES:append := " boot.scr autostart.cfg"
IMAGE_BOOT_FILES:append := " boot.scr autostart.cfg"


VIRTUAL-RUNTIME_init_manager = "systemd"
VIRTUAL-RUNTIME_initscripts = "systemd-compat-units"

