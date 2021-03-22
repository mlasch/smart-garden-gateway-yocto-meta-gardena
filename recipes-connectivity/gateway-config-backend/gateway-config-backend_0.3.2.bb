# Auto-Generated by cargo-bitbake 0.3.15-alpha.0
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get gateway-config-backend could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/gateway-config-backend/0.3.0"
SRC_URI += "git://stash.dss.husqvarnagroup.com:7999/sg/gateway-config-backend.git;protocol=ssh"
SRCREV = "4630a1450ae83ec435e99cf6a46a978d2d99958e"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""


# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/actix-net/0.2.5 \
    crate://crates.io/actix-web/0.7.16 \
    crate://crates.io/actix/0.7.9 \
    crate://crates.io/actix_derive/0.3.2 \
    crate://crates.io/addr2line/0.14.1 \
    crate://crates.io/adler/0.2.3 \
    crate://crates.io/aho-corasick/0.7.15 \
    crate://crates.io/ansi_term/0.11.0 \
    crate://crates.io/askama_escape/0.1.0 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/0.1.7 \
    crate://crates.io/autocfg/1.0.1 \
    crate://crates.io/backtrace/0.3.56 \
    crate://crates.io/base64/0.10.1 \
    crate://crates.io/bindgen/0.57.0 \
    crate://crates.io/bitflags/1.2.1 \
    crate://crates.io/byteorder/1.4.2 \
    crate://crates.io/bytes/0.4.12 \
    crate://crates.io/cc/1.0.66 \
    crate://crates.io/cexpr/0.4.0 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/clang-sys/1.1.0 \
    crate://crates.io/clap/2.33.3 \
    crate://crates.io/cloudabi/0.0.3 \
    crate://crates.io/cookie/0.11.3 \
    crate://crates.io/crossbeam-channel/0.3.9 \
    crate://crates.io/crossbeam-deque/0.7.3 \
    crate://crates.io/crossbeam-epoch/0.8.2 \
    crate://crates.io/crossbeam-queue/0.1.2 \
    crate://crates.io/crossbeam-queue/0.2.3 \
    crate://crates.io/crossbeam-utils/0.6.6 \
    crate://crates.io/crossbeam-utils/0.7.2 \
    crate://crates.io/dtoa/0.4.7 \
    crate://crates.io/encoding-index-japanese/1.20141219.5 \
    crate://crates.io/encoding-index-korean/1.20141219.5 \
    crate://crates.io/encoding-index-simpchinese/1.20141219.5 \
    crate://crates.io/encoding-index-singlebyte/1.20141219.5 \
    crate://crates.io/encoding-index-tradchinese/1.20141219.5 \
    crate://crates.io/encoding/0.2.33 \
    crate://crates.io/encoding_index_tests/0.1.4 \
    crate://crates.io/env_logger/0.6.2 \
    crate://crates.io/env_logger/0.8.3 \
    crate://crates.io/error-chain/0.8.1 \
    crate://crates.io/failure/0.1.8 \
    crate://crates.io/failure_derive/0.1.8 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/fuchsia-cprng/0.1.1 \
    crate://crates.io/fuchsia-zircon-sys/0.3.3 \
    crate://crates.io/fuchsia-zircon/0.3.3 \
    crate://crates.io/futures-channel/0.3.12 \
    crate://crates.io/futures-core/0.3.12 \
    crate://crates.io/futures-cpupool/0.1.8 \
    crate://crates.io/futures-executor/0.3.12 \
    crate://crates.io/futures-io/0.3.12 \
    crate://crates.io/futures-macro/0.3.12 \
    crate://crates.io/futures-sink/0.3.12 \
    crate://crates.io/futures-task/0.3.12 \
    crate://crates.io/futures-util/0.3.12 \
    crate://crates.io/futures/0.1.30 \
    crate://crates.io/futures/0.3.12 \
    crate://crates.io/gimli/0.23.0 \
    crate://crates.io/glob/0.3.0 \
    crate://crates.io/h2/0.1.26 \
    crate://crates.io/hashbrown/0.9.1 \
    crate://crates.io/hermit-abi/0.1.18 \
    crate://crates.io/hostname/0.3.1 \
    crate://crates.io/http/0.1.21 \
    crate://crates.io/httparse/1.3.5 \
    crate://crates.io/humantime/1.3.0 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/idna/0.1.5 \
    crate://crates.io/indexmap/1.6.1 \
    crate://crates.io/iovec/0.1.4 \
    crate://crates.io/ipconfig/0.1.9 \
    crate://crates.io/itoa/0.4.7 \
    crate://crates.io/kernel32-sys/0.2.2 \
    crate://crates.io/language-tags/0.2.2 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lazycell/1.3.0 \
    crate://crates.io/libc/0.2.86 \
    crate://crates.io/libloading/0.6.7 \
    crate://crates.io/linked-hash-map/0.5.4 \
    crate://crates.io/listenfd/0.3.3 \
    crate://crates.io/lock_api/0.1.5 \
    crate://crates.io/lock_api/0.3.4 \
    crate://crates.io/log/0.4.14 \
    crate://crates.io/lru-cache/0.1.2 \
    crate://crates.io/match_cfg/0.1.0 \
    crate://crates.io/matches/0.1.8 \
    crate://crates.io/maybe-uninit/2.0.0 \
    crate://crates.io/memchr/2.3.4 \
    crate://crates.io/memoffset/0.5.6 \
    crate://crates.io/mime/0.3.16 \
    crate://crates.io/mime_guess/2.0.3 \
    crate://crates.io/miniz_oxide/0.4.3 \
    crate://crates.io/mio-named-pipes/0.1.7 \
    crate://crates.io/mio-uds/0.6.8 \
    crate://crates.io/mio/0.6.23 \
    crate://crates.io/miow/0.2.2 \
    crate://crates.io/miow/0.3.6 \
    crate://crates.io/net2/0.2.37 \
    crate://crates.io/nom/5.1.2 \
    crate://crates.io/num_cpus/1.13.0 \
    crate://crates.io/object/0.23.0 \
    crate://crates.io/once_cell/1.5.2 \
    crate://crates.io/openssl-sys/0.9.60 \
    crate://crates.io/openssl/0.10.32 \
    crate://crates.io/owning_ref/0.4.1 \
    crate://crates.io/parking_lot/0.7.1 \
    crate://crates.io/parking_lot/0.9.0 \
    crate://crates.io/parking_lot_core/0.4.0 \
    crate://crates.io/parking_lot_core/0.6.2 \
    crate://crates.io/peeking_take_while/0.1.2 \
    crate://crates.io/percent-encoding/1.0.1 \
    crate://crates.io/percent-encoding/2.1.0 \
    crate://crates.io/pin-project-lite/0.2.4 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.19 \
    crate://crates.io/proc-macro-hack/0.5.19 \
    crate://crates.io/proc-macro-nested/0.1.7 \
    crate://crates.io/proc-macro2/0.4.30 \
    crate://crates.io/proc-macro2/1.0.24 \
    crate://crates.io/quick-error/1.2.3 \
    crate://crates.io/quote/0.6.13 \
    crate://crates.io/quote/1.0.9 \
    crate://crates.io/rand/0.5.6 \
    crate://crates.io/rand/0.6.5 \
    crate://crates.io/rand_chacha/0.1.1 \
    crate://crates.io/rand_core/0.3.1 \
    crate://crates.io/rand_core/0.4.2 \
    crate://crates.io/rand_hc/0.1.0 \
    crate://crates.io/rand_isaac/0.1.1 \
    crate://crates.io/rand_jitter/0.1.4 \
    crate://crates.io/rand_os/0.1.3 \
    crate://crates.io/rand_pcg/0.1.2 \
    crate://crates.io/rand_xorshift/0.1.1 \
    crate://crates.io/rdrand/0.4.0 \
    crate://crates.io/redox_syscall/0.1.57 \
    crate://crates.io/regex-syntax/0.6.22 \
    crate://crates.io/regex/1.4.3 \
    crate://crates.io/resolv-conf/0.6.3 \
    crate://crates.io/rustc-demangle/0.1.18 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/rustc_version/0.2.3 \
    crate://crates.io/ryu/1.0.5 \
    crate://crates.io/scopeguard/0.3.3 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/semver-parser/0.7.0 \
    crate://crates.io/semver/0.9.0 \
    crate://crates.io/serde/1.0.123 \
    crate://crates.io/serde_derive/1.0.123 \
    crate://crates.io/serde_json/1.0.62 \
    crate://crates.io/serde_urlencoded/0.5.5 \
    crate://crates.io/sha1/0.6.0 \
    crate://crates.io/shlex/0.1.1 \
    crate://crates.io/signal-hook-registry/1.3.0 \
    crate://crates.io/slab/0.4.2 \
    crate://crates.io/smallvec/0.6.14 \
    crate://crates.io/socket2/0.3.19 \
    crate://crates.io/stable_deref_trait/1.2.0 \
    crate://crates.io/string/0.2.1 \
    crate://crates.io/strsim/0.8.0 \
    crate://crates.io/syn/0.15.44 \
    crate://crates.io/syn/1.0.60 \
    crate://crates.io/synstructure/0.12.4 \
    crate://crates.io/termcolor/1.1.2 \
    crate://crates.io/textwrap/0.11.0 \
    crate://crates.io/thiserror-impl/1.0.23 \
    crate://crates.io/thiserror/1.0.23 \
    crate://crates.io/thread_local/1.1.3 \
    crate://crates.io/time/0.1.44 \
    crate://crates.io/tinyvec/1.1.1 \
    crate://crates.io/tinyvec_macros/0.1.0 \
    crate://crates.io/tokio-codec/0.1.2 \
    crate://crates.io/tokio-current-thread/0.1.7 \
    crate://crates.io/tokio-executor/0.1.10 \
    crate://crates.io/tokio-fs/0.1.7 \
    crate://crates.io/tokio-io/0.1.13 \
    crate://crates.io/tokio-openssl/0.2.1 \
    crate://crates.io/tokio-process/0.2.5 \
    crate://crates.io/tokio-reactor/0.1.12 \
    crate://crates.io/tokio-signal/0.2.9 \
    crate://crates.io/tokio-sync/0.1.8 \
    crate://crates.io/tokio-tcp/0.1.4 \
    crate://crates.io/tokio-threadpool/0.1.18 \
    crate://crates.io/tokio-timer/0.2.13 \
    crate://crates.io/tokio-udp/0.1.6 \
    crate://crates.io/tokio-uds/0.2.7 \
    crate://crates.io/tokio/0.1.22 \
    crate://crates.io/tower-service/0.1.0 \
    crate://crates.io/trust-dns-proto/0.5.0 \
    crate://crates.io/trust-dns-resolver/0.10.0 \
    crate://crates.io/unicase/2.6.0 \
    crate://crates.io/unicode-bidi/0.3.4 \
    crate://crates.io/unicode-normalization/0.1.17 \
    crate://crates.io/unicode-width/0.1.8 \
    crate://crates.io/unicode-xid/0.1.0 \
    crate://crates.io/unicode-xid/0.2.1 \
    crate://crates.io/url/1.7.2 \
    crate://crates.io/uuid/0.6.5 \
    crate://crates.io/uuid/0.7.4 \
    crate://crates.io/vcpkg/0.2.11 \
    crate://crates.io/vec_map/0.8.2 \
    crate://crates.io/version_check/0.1.5 \
    crate://crates.io/version_check/0.9.2 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/which/3.1.1 \
    crate://crates.io/widestring/0.2.2 \
    crate://crates.io/winapi-build/0.1.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.2.8 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/winreg/0.5.1 \
    crate://crates.io/ws2_32-sys/0.2.1 \
"



LIC_FILES_CHKSUM = " \
    file://Proprietary;md5=0557f9d92cf58f2ccdd50f62f8ac0b28 \
    file://third_party_licenses;md5=72ed30bbb7673eb3d80ef5962a39f5ff \
"

SUMMARY = "Backend component for the GARDENA smart Gateway config interface"
HOMEPAGE = "https://www.gardena.com/"
LICENSE = "Proprietary"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include gateway-config-backend-${PV}.inc
include gateway-config-backend.inc
