SUMMARY = "Xtables-addons is a set of additional extensions for the Xtables packet filter"
DESCRIPTION = "Xtables-addons is a set of additional extensions for the Xtables packet filter that is present in the Linux kernel"
HOMEPAGE = "http://xtables-addons.sourceforge.net/"
LICENSE = "GPLv2+"

LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "http://downloads.sourceforge.net/project/xtables-addons/Xtables-addons/xtables-addons-${PV}.tar.xz \
           file://mconfig.patch"

FILES_${PN} =+ "${libdir}/xtables \
				/lib/modules/ "
FILES_${PN}-dbg =+ "${libdir}/xtables/.debug"

SRC_URI[md5sum] = "246ec2f1f75c32c6e04ae9ae75b578c9"
SRC_URI[sha256sum] = "08af8c85ff00ee76469741bb9eb97454903680213dc3e0602266bcbb08788490"

inherit module-base autotools pkgconfig

EXTRA_OECONF = "--with-kbuild=${STAGING_KERNEL_DIR} \
               "
