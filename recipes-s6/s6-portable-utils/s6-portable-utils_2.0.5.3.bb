DESCRIPTION = "Skarnet base libraries"
HOMEPAGE = "http://skarnet.org/software/${PN}/"
LICENSE = "ISC"
SECTION = "base"
DEPENDS = "skalibs"
#RDEPENDS = "skalibs"
LIC_FILES_CHKSUM = "file://COPYING;md5=1500f33d86c4956999052c0e137cd652"

SRC_URI = "http://skarnet.org/software/${PN}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "09612618faf23e9981597ce634742194"
SRC_URI[sha256sum] = "27be01b3d66df617ea7dbc21b55d253d5b9142463099f6944f90ef33587a2e09"

do_configure() {
	${S}/configure --enable-shared --enable-static --with-sysdeps=${STAGING_DIR_TARGET}/usr/lib/skalibs/sysdeps
    touch ${S}/-lskarnet
}

do_install () {
    oe_runmake install DESTDIR=${D}
}

ALTERNATIVE_${PN} = "basename cat chmod chown clock cut dirname dumpenv echo env expr false format-filter grep head hiercopy linkname ln ls maximumtime mkdir mkfifo nice nuke pause printenv quote quote-filter rename rmrf seq sleep sort sync tail test touch true uniquename unquote unquote-filter update-symlinks"
# Vim script to convert a list of utilities into the alternates stuffs below.
# Useful if the list ever needs updating.
# 'a,'bg/./exe "normal d$iALTERNATIVE_LINK_NAME["] = \"/usr/bin/"\" ALTERNATIVE_TARGET["] = \"/usr/bin/s6-"\""
#
ALTERNATIVE_LINK_NAME[basename] = "/usr/bin/basename"
ALTERNATIVE_TARGET[basename] = "/usr/bin/s6-basename"
ALTERNATIVE_LINK_NAME[cat] = "/usr/bin/cat"
ALTERNATIVE_TARGET[cat] = "/usr/bin/s6-cat"
ALTERNATIVE_LINK_NAME[chmod] = "/usr/bin/chmod"
ALTERNATIVE_TARGET[chmod] = "/usr/bin/s6-chmod"
ALTERNATIVE_LINK_NAME[chown] = "/usr/bin/chown"
ALTERNATIVE_TARGET[chown] = "/usr/bin/s6-chown"
ALTERNATIVE_LINK_NAME[clock] = "/usr/bin/clock"
ALTERNATIVE_TARGET[clock] = "/usr/bin/s6-clock"
ALTERNATIVE_LINK_NAME[cut] = "/usr/bin/cut"
ALTERNATIVE_TARGET[cut] = "/usr/bin/s6-cut"
ALTERNATIVE_LINK_NAME[dirname] = "/usr/bin/dirname"
ALTERNATIVE_TARGET[dirname] = "/usr/bin/s6-dirname"
ALTERNATIVE_LINK_NAME[dumpenv] = "/usr/bin/dumpenv"
ALTERNATIVE_TARGET[dumpenv] = "/usr/bin/s6-dumpenv"
ALTERNATIVE_LINK_NAME[echo] = "/usr/bin/echo"
ALTERNATIVE_TARGET[echo] = "/usr/bin/s6-echo"
ALTERNATIVE_LINK_NAME[env] = "/usr/bin/env"
ALTERNATIVE_TARGET[env] = "/usr/bin/s6-env"
ALTERNATIVE_LINK_NAME[expr] = "/usr/bin/expr"
ALTERNATIVE_TARGET[expr] = "/usr/bin/s6-expr"
ALTERNATIVE_LINK_NAME[false] = "/usr/bin/false"
ALTERNATIVE_TARGET[false] = "/usr/bin/s6-false"
ALTERNATIVE_LINK_NAME[format-filter] = "/usr/bin/format-filter"
ALTERNATIVE_TARGET[format-filter] = "/usr/bin/s6-format-filter"
ALTERNATIVE_LINK_NAME[grep] = "/usr/bin/grep"
ALTERNATIVE_TARGET[grep] = "/usr/bin/s6-grep"
ALTERNATIVE_LINK_NAME[head] = "/usr/bin/head"
ALTERNATIVE_TARGET[head] = "/usr/bin/s6-head"
ALTERNATIVE_LINK_NAME[hiercopy] = "/usr/bin/hiercopy"
ALTERNATIVE_TARGET[hiercopy] = "/usr/bin/s6-hiercopy"
ALTERNATIVE_LINK_NAME[linkname] = "/usr/bin/linkname"
ALTERNATIVE_TARGET[linkname] = "/usr/bin/s6-linkname"
ALTERNATIVE_LINK_NAME[ln] = "/usr/bin/ln"
ALTERNATIVE_TARGET[ln] = "/usr/bin/s6-ln"
ALTERNATIVE_LINK_NAME[ls] = "/usr/bin/ls"
ALTERNATIVE_TARGET[ls] = "/usr/bin/s6-ls"
ALTERNATIVE_LINK_NAME[maximumtime] = "/usr/bin/maximumtime"
ALTERNATIVE_TARGET[maximumtime] = "/usr/bin/s6-maximumtime"
ALTERNATIVE_LINK_NAME[mkdir] = "/usr/bin/mkdir"
ALTERNATIVE_TARGET[mkdir] = "/usr/bin/s6-mkdir"
ALTERNATIVE_LINK_NAME[mkfifo] = "/usr/bin/mkfifo"
ALTERNATIVE_TARGET[mkfifo] = "/usr/bin/s6-mkfifo"
ALTERNATIVE_LINK_NAME[nice] = "/usr/bin/nice"
ALTERNATIVE_TARGET[nice] = "/usr/bin/s6-nice"
ALTERNATIVE_LINK_NAME[nuke] = "/usr/bin/nuke"
ALTERNATIVE_TARGET[nuke] = "/usr/bin/s6-nuke"
ALTERNATIVE_LINK_NAME[pause] = "/usr/bin/pause"
ALTERNATIVE_TARGET[pause] = "/usr/bin/s6-pause"
ALTERNATIVE_LINK_NAME[printenv] = "/usr/bin/printenv"
ALTERNATIVE_TARGET[printenv] = "/usr/bin/s6-printenv"
ALTERNATIVE_LINK_NAME[quote] = "/usr/bin/quote"
ALTERNATIVE_TARGET[quote] = "/usr/bin/s6-quote"
ALTERNATIVE_LINK_NAME[quote-filter] = "/usr/bin/quote-filter"
ALTERNATIVE_TARGET[quote-filter] = "/usr/bin/s6-quote-filter"
ALTERNATIVE_LINK_NAME[rename] = "/usr/bin/rename"
ALTERNATIVE_TARGET[rename] = "/usr/bin/s6-rename"
ALTERNATIVE_LINK_NAME[rmrf] = "/usr/bin/rmrf"
ALTERNATIVE_TARGET[rmrf] = "/usr/bin/s6-rmrf"
ALTERNATIVE_LINK_NAME[seq] = "/usr/bin/seq"
ALTERNATIVE_TARGET[seq] = "/usr/bin/s6-seq"
ALTERNATIVE_LINK_NAME[sleep] = "/usr/bin/sleep"
ALTERNATIVE_TARGET[sleep] = "/usr/bin/s6-sleep"
ALTERNATIVE_LINK_NAME[sort] = "/usr/bin/sort"
ALTERNATIVE_TARGET[sort] = "/usr/bin/s6-sort"
ALTERNATIVE_LINK_NAME[sync] = "/usr/bin/sync"
ALTERNATIVE_TARGET[sync] = "/usr/bin/s6-sync"
ALTERNATIVE_LINK_NAME[tail] = "/usr/bin/tail"
ALTERNATIVE_TARGET[tail] = "/usr/bin/s6-tail"
ALTERNATIVE_LINK_NAME[test] = "/usr/bin/test"
ALTERNATIVE_TARGET[test] = "/usr/bin/s6-test"
ALTERNATIVE_LINK_NAME[touch] = "/usr/bin/touch"
ALTERNATIVE_TARGET[touch] = "/usr/bin/s6-touch"
ALTERNATIVE_LINK_NAME[true] = "/usr/bin/true"
ALTERNATIVE_TARGET[true] = "/usr/bin/s6-true"
ALTERNATIVE_LINK_NAME[uniquename] = "/usr/bin/uniquename"
ALTERNATIVE_TARGET[uniquename] = "/usr/bin/s6-uniquename"
ALTERNATIVE_LINK_NAME[unquote] = "/usr/bin/unquote"
ALTERNATIVE_TARGET[unquote] = "/usr/bin/s6-unquote"
ALTERNATIVE_LINK_NAME[unquote-filter] = "/usr/bin/unquote-filter"
ALTERNATIVE_TARGET[unquote-filter] = "/usr/bin/s6-unquote-filter"
ALTERNATIVE_LINK_NAME[update-symlinks] = "/usr/bin/update-symlinks"
ALTERNATIVE_TARGET[update-symlinks] = "/usr/bin/s6-update-symlinks"

ALTERNATIVE_PRIORITY = "5"

inherit update-alternatives
