CFLAGS := -std=gnu11 -maes -Wall -O2

TARGET ?= $(shell uname -s 2>/dev/null || echo unknown)
override TARGET := $(shell echo $(TARGET) | tr A-Z a-z)

JAVA_HOME ?= $(realpath $(dir $(realpath $(shell which java)))../../)

ifeq ($(TARGET), darwin)
	DYLIB     := dylib
	LDFLAGS	  := -dynamiclib -Wl,-undefined -Wl,dynamic_lookup -Wl,-single_module
	CFLAGS    += -I $(JAVA_HOME)/Headers/
else
	DYLIB     := so
	LDFLAGS   := -shared
	CFLAGS    += -fPIC -I $(JAVA_HOME)/include -I $(JAVA_HOME)/include/$(TARGET)
endif

SRC := $(wildcard src/main/c/*.c)
OBJ  = $(patsubst src/main/c/%.c,$(OBJ_DIR)/%.o,$(SRC))

OBJ_DIR := target/obj
LIB     := target/libcryptonight.$(DYLIB)

all: $(LIB)

clean:
	$(RM) $(LIB) $(OBJ)
	
$(LIB): $(OBJ)
	$(CC) $(LDFLAGS) -o $@ $^

$(OBJ): $(OBJ_DIR)

$(OBJ_DIR):
	mkdir -p $@
	
$(OBJ_DIR)/%.o : src/main/c/%.c
	echo $(JAVA_HOME)
	$(CC) $(CFLAGS) -c -o $@ $<
	
.PHONY: all clean