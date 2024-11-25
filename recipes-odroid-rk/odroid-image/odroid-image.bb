inherit image
inherit deploy
inherit core-image

IMAGE_FEATURES += "package-management serial-autologin-root ssh-server-dropbear weston"


IMAGE_INSTALL += "chromium-ozone-wayland drm-cursor weston"
IMAGE_INSTALL += "rockchip-librga v4l-rkmpp glmark2 "
IMAGE_INSTALL += "v4l-utils rockchip-mpp rockchip-alsa-config "
IMAGE_INSTALL += "alsa-lib alsa-plugins alsa-tools alsa-utils "
IMAGE_INSTALL += "initscripts packagegroup-core-boot udev-conf-rockchip"
IMAGE_INSTALL += "openssl net-tools ntp-utils"

IMAGE_INSTALL += "\
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

VIRTUAL-RUNTIME_init_manager = "systemd"
VIRTUAL-RUNTIME_initscripts = "systemd-compat-units"

