# Auto-Generated by cargo-bitbake 0.3.12
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get gateway-config-backend could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/gateway-config-backend/0.2.0"
SRC_URI += "git://stash.dss.husqvarnagroup.com:7999/sg/gateway-config-backend.git;protocol=ssh"
SRCREV = "6bde3ebfbf14d385b3da59d875d77eb267ef23e8"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""


# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/actix-net/0.2.5 \
    crate://crates.io/actix-web/0.7.16 \
    crate://crates.io/actix/0.7.9 \
    crate://crates.io/actix_derive/0.3.2 \
    crate://crates.io/aho-corasick/0.6.10 \
    crate://crates.io/arc-swap/0.3.7 \
    crate://crates.io/arrayvec/0.4.10 \
    crate://crates.io/askama_escape/0.1.0 \
    crate://crates.io/atty/0.2.11 \
    crate://crates.io/autocfg/0.1.2 \
    crate://crates.io/backtrace-sys/0.1.28 \
    crate://crates.io/backtrace/0.3.14 \
    crate://crates.io/base64/0.10.1 \
    crate://crates.io/bitflags/1.0.4 \
    crate://crates.io/byteorder/1.3.1 \
    crate://crates.io/bytes/0.4.11 \
    crate://crates.io/cc/1.0.29 \
    crate://crates.io/cfg-if/0.1.6 \
    crate://crates.io/cloudabi/0.0.3 \
    crate://crates.io/cookie/0.11.0 \
    crate://crates.io/crossbeam-channel/0.3.8 \
    crate://crates.io/crossbeam-deque/0.6.3 \
    crate://crates.io/crossbeam-epoch/0.7.1 \
    crate://crates.io/crossbeam-utils/0.6.5 \
    crate://crates.io/crossbeam/0.6.0 \
    crate://crates.io/dtoa/0.4.3 \
    crate://crates.io/encoding-index-japanese/1.20141219.5 \
    crate://crates.io/encoding-index-korean/1.20141219.5 \
    crate://crates.io/encoding-index-simpchinese/1.20141219.5 \
    crate://crates.io/encoding-index-singlebyte/1.20141219.5 \
    crate://crates.io/encoding-index-tradchinese/1.20141219.5 \
    crate://crates.io/encoding/0.2.33 \
    crate://crates.io/encoding_index_tests/0.1.4 \
    crate://crates.io/env_logger/0.6.0 \
    crate://crates.io/error-chain/0.8.1 \
    crate://crates.io/failure/0.1.5 \
    crate://crates.io/failure_derive/0.1.5 \
    crate://crates.io/fnv/1.0.6 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/fuchsia-cprng/0.1.1 \
    crate://crates.io/fuchsia-zircon-sys/0.3.3 \
    crate://crates.io/fuchsia-zircon/0.3.3 \
    crate://crates.io/futures-cpupool/0.1.8 \
    crate://crates.io/futures/0.1.25 \
    crate://crates.io/h2/0.1.16 \
    crate://crates.io/hostname/0.1.5 \
    crate://crates.io/http/0.1.16 \
    crate://crates.io/httparse/1.3.3 \
    crate://crates.io/humantime/1.2.0 \
    crate://crates.io/idna/0.1.5 \
    crate://crates.io/indexmap/1.0.2 \
    crate://crates.io/iovec/0.1.2 \
    crate://crates.io/ipconfig/0.1.9 \
    crate://crates.io/itoa/0.4.3 \
    crate://crates.io/kernel32-sys/0.2.2 \
    crate://crates.io/language-tags/0.2.2 \
    crate://crates.io/lazy_static/1.2.0 \
    crate://crates.io/lazycell/1.2.1 \
    crate://crates.io/libc/0.2.49 \
    crate://crates.io/linked-hash-map/0.4.2 \
    crate://crates.io/listenfd/0.3.3 \
    crate://crates.io/lock_api/0.1.5 \
    crate://crates.io/log/0.4.6 \
    crate://crates.io/lru-cache/0.1.1 \
    crate://crates.io/matches/0.1.8 \
    crate://crates.io/memchr/2.2.0 \
    crate://crates.io/memoffset/0.2.1 \
    crate://crates.io/mime/0.3.13 \
    crate://crates.io/mime_guess/2.0.0-alpha.6 \
    crate://crates.io/mio-named-pipes/0.1.6 \
    crate://crates.io/mio-uds/0.6.7 \
    crate://crates.io/mio/0.6.16 \
    crate://crates.io/miow/0.2.1 \
    crate://crates.io/miow/0.3.3 \
    crate://crates.io/net2/0.2.33 \
    crate://crates.io/nodrop/0.1.13 \
    crate://crates.io/num_cpus/1.10.0 \
    crate://crates.io/openssl-sys/0.9.41 \
    crate://crates.io/openssl/0.10.18 \
    crate://crates.io/owning_ref/0.4.0 \
    crate://crates.io/parking_lot/0.7.1 \
    crate://crates.io/parking_lot_core/0.4.0 \
    crate://crates.io/percent-encoding/1.0.1 \
    crate://crates.io/phf/0.7.24 \
    crate://crates.io/phf_codegen/0.7.24 \
    crate://crates.io/phf_generator/0.7.24 \
    crate://crates.io/phf_shared/0.7.24 \
    crate://crates.io/pkg-config/0.3.14 \
    crate://crates.io/proc-macro2/0.4.27 \
    crate://crates.io/quick-error/1.2.2 \
    crate://crates.io/quote/0.6.11 \
    crate://crates.io/rand/0.5.6 \
    crate://crates.io/rand/0.6.5 \
    crate://crates.io/rand_chacha/0.1.1 \
    crate://crates.io/rand_core/0.3.1 \
    crate://crates.io/rand_core/0.4.0 \
    crate://crates.io/rand_hc/0.1.0 \
    crate://crates.io/rand_isaac/0.1.1 \
    crate://crates.io/rand_jitter/0.1.3 \
    crate://crates.io/rand_os/0.1.2 \
    crate://crates.io/rand_pcg/0.1.2 \
    crate://crates.io/rand_xorshift/0.1.1 \
    crate://crates.io/rdrand/0.4.0 \
    crate://crates.io/redox_syscall/0.1.51 \
    crate://crates.io/redox_termios/0.1.1 \
    crate://crates.io/regex-syntax/0.6.5 \
    crate://crates.io/regex/1.1.0 \
    crate://crates.io/resolv-conf/0.6.2 \
    crate://crates.io/rustc-demangle/0.1.13 \
    crate://crates.io/rustc_version/0.2.3 \
    crate://crates.io/ryu/0.2.7 \
    crate://crates.io/scopeguard/0.3.3 \
    crate://crates.io/semver-parser/0.7.0 \
    crate://crates.io/semver/0.9.0 \
    crate://crates.io/serde/1.0.88 \
    crate://crates.io/serde_derive/1.0.88 \
    crate://crates.io/serde_json/1.0.38 \
    crate://crates.io/serde_urlencoded/0.5.4 \
    crate://crates.io/sha1/0.6.0 \
    crate://crates.io/signal-hook/0.1.7 \
    crate://crates.io/siphasher/0.2.3 \
    crate://crates.io/slab/0.4.2 \
    crate://crates.io/smallvec/0.6.9 \
    crate://crates.io/socket2/0.3.8 \
    crate://crates.io/stable_deref_trait/1.1.1 \
    crate://crates.io/string/0.1.3 \
    crate://crates.io/syn/0.15.26 \
    crate://crates.io/synstructure/0.10.1 \
    crate://crates.io/termcolor/1.0.4 \
    crate://crates.io/termion/1.5.1 \
    crate://crates.io/thread_local/0.3.6 \
    crate://crates.io/time/0.1.42 \
    crate://crates.io/tokio-codec/0.1.1 \
    crate://crates.io/tokio-current-thread/0.1.4 \
    crate://crates.io/tokio-executor/0.1.6 \
    crate://crates.io/tokio-fs/0.1.5 \
    crate://crates.io/tokio-io/0.1.11 \
    crate://crates.io/tokio-openssl/0.2.1 \
    crate://crates.io/tokio-process/0.2.3 \
    crate://crates.io/tokio-reactor/0.1.8 \
    crate://crates.io/tokio-signal/0.2.7 \
    crate://crates.io/tokio-sync/0.1.2 \
    crate://crates.io/tokio-tcp/0.1.3 \
    crate://crates.io/tokio-threadpool/0.1.11 \
    crate://crates.io/tokio-timer/0.2.10 \
    crate://crates.io/tokio-udp/0.1.3 \
    crate://crates.io/tokio-uds/0.2.5 \
    crate://crates.io/tokio/0.1.15 \
    crate://crates.io/tower-service/0.1.0 \
    crate://crates.io/trust-dns-proto/0.5.0 \
    crate://crates.io/trust-dns-resolver/0.10.0 \
    crate://crates.io/ucd-util/0.1.3 \
    crate://crates.io/unicase/1.4.2 \
    crate://crates.io/unicase/2.2.0 \
    crate://crates.io/unicode-bidi/0.3.4 \
    crate://crates.io/unicode-normalization/0.1.8 \
    crate://crates.io/unicode-xid/0.1.0 \
    crate://crates.io/url/1.7.2 \
    crate://crates.io/utf8-ranges/1.0.2 \
    crate://crates.io/uuid/0.6.5 \
    crate://crates.io/uuid/0.7.2 \
    crate://crates.io/vcpkg/0.2.6 \
    crate://crates.io/version_check/0.1.5 \
    crate://crates.io/widestring/0.2.2 \
    crate://crates.io/winapi-build/0.1.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.2 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.2.8 \
    crate://crates.io/winapi/0.3.6 \
    crate://crates.io/wincolor/1.0.1 \
    crate://crates.io/winreg/0.5.1 \
    crate://crates.io/winutil/0.1.1 \
    crate://crates.io/ws2_32-sys/0.2.1 \
"



LIC_FILES_CHKSUM = " \
    file://Proprietary;md5=0557f9d92cf58f2ccdd50f62f8ac0b28 \
    file://third_party_licenses;md5=689f1d69feea5a7208671b609ceb77e7 \
"

SUMMARY = "Backend component for the GARDENA smart Gateway config interface"
HOMEPAGE = "https://www.gardena.com/"
LICENSE = "Proprietary"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include gateway-config-backend-${PV}.inc
include gateway-config-backend.inc
