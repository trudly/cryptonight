cmake_minimum_required(VERSION 3.0)
project(cryptonight)

set(CMAKE_C_STANDARD 99)

set(LIB_SOURCE_FILES cryptonight.c
cryptonight.h
cryptonight_jni.c
c_blake256.c
c_blake256.h
c_groestl.c
c_groestl.h
c_jh.c
c_jh.h
c_keccak.c
c_keccak.h
c_skein.c
c_skein.h
groestl_tables.h
hash-ops.h
hash.c
hash.h
int-util.h
oaes_config.h
oaes_lib.c
oaes_lib.h
skein_port.h)

add_library(cryptonight SHARED ${LIB_SOURCE_FILES})
