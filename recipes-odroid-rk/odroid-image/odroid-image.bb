inherit image
inherit deploy
inherit core-image

DEPENDS:append = " u-boot-odroid-rk odroid-autostart-cfg"
IMAGE_INSTALL:append = " odroid-autostart-script "

IMAGE_FEATURES:append = " package-management serial-autologin-root ssh-server-dropbear weston"
DISPLAY_PLATFORM ?= "wayland"
DISTRO_FEATURES:append = " egl opengl wayland"

IMAGE_INSTALL:append = " ncurses-terminfo udev-conf-rockchip os-release ifupdown dhcpcd resolvconf dialog"

# Audio
IMAGE_INSTALL:append = " alsa-utils rockchip-alsa-config pulseaudio-server alsa-plugins-pulseaudio-conf "

# Chromium
IMAGE_INSTALL:append = " chromium-ozone-wayland drm-cursor weston v4l-rkmpp v4l-utils libv4l"

# WiFi
IMAGE_INSTALL:append = " iw wpa-supplicant bluez5"

# glmark2
IMAGE_INSTALL:append = " glmark2"
PACKAGECONFIG:pn-glmark2 = \
	"${@bb.utils.contains('DISTRO_FEATURES', 'x11 opengl', 'x11-gles2', '', d)} \
	${@bb.utils.contains('DISTRO_FEATURES', 'wayland opengl', 'wayland-gles2', '', d)} \
	drm-gles2"

# Misc
IMAGE_INSTALL:append = " \
	rockchip-librga \
	rockchip-mpp \
	initscripts \
	packagegroup-core-boot \
	udev-conf-rockchip \
	openssl \
	net-tools \
	ntp-utils \
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

