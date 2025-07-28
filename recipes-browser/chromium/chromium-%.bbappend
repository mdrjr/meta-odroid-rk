GN_ARGS:append = " use_custom_libcxx=false is_debug=false symbol_level=0 use_thin_lto=false concurrent_links=1 "

CHROMIUM_EXTRA_ARGS:append = " --disable-gpu-memory-buffer-video-frames"

# HACK: chromium 136 still doesn't build clear on walnascar
SRCREV = "${AUTOREV}"
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:remove = "file://0009-Adjust-the-Rust-build-to-our-needs.patch"
SRC_URI:append = "\
	file://09.patch \
	file://19.patch \
	file://20.patch \
"
