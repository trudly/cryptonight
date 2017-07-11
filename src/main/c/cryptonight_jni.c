#include <jni.h>

#include "cryptonight.h"

JNICALL void fastHash(JNIEnv *env, jclass clazz, jbyteArray input, jbyteArray output) {
	unsigned char* inputBuffer = (*env)->GetByteArrayElements(env, input, NULL);
	unsigned char* outputBuffer = (*env)->GetByteArrayElements(env, output, NULL);

	jsize inputSize = (*env)->GetArrayLength(env, input);
//	jsize outputSize = (*env)->GetArrayLength(env, output);

//	TODO: check outputSize is 32 (or greater than?)

	cryptonight_fast_hash(inputBuffer, outputBuffer, inputSize);

	(*env)->ReleaseByteArrayElements(env, input, inputBuffer, JNI_ABORT);
	(*env)->ReleaseByteArrayElements(env, output, outputBuffer, JNI_COMMIT);
}

static const JNINativeMethod methods[] = {
	{ "fastHash", "([B[B)V", (void *) fastHash },
};

jint JNI_OnLoad(JavaVM *vm, void *reserved) {
	JNIEnv *env;

	if ((*vm)->GetEnv(vm, (void **) &env, JNI_VERSION_1_8) != JNI_OK) {
		return -1;
	}

	jclass clazz = (*env)->FindClass(env, "net/rapidhashing/cryptonight/Cryptonight");
	int r = (*env)->RegisterNatives(env, clazz, methods, 1);

	return (r == JNI_OK) ? JNI_VERSION_1_8 : -1;
}
