FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://init_new"

do_install () {
	install -d ${D}${sysconfdir}/init.d

	install -m 0755 ${WORKDIR}/init_new ${D}${sysconfdir}/init.d/networking
}
