FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-backend-drm-AFBC-only-cursor-planes-go-through-the-legacy-cursor-API-period.patch \
            file://0002-backend-drm-stop-claiming-LINEAR-on-planes-that-reject-it.patch \
            file://0003-surface-state-Fix-assert-firing-when-subsurfaces-have-no-views.patch \
            file://0004-libweston-the-resize-freeze-does-NOT-get-to-hang-the-output-forever.patch \
            file://0005-backend-drm-stop-clipping-the-cursor-at-the-screen-edges.patch"
