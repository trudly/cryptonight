package net.rapidhashing.cryptonight;

import org.scijava.nativelib.NativeLibraryUtil;

/**
 * 
 * @author matt
 *
 */
public class Cryptonight {
	static {
		NativeLibraryUtil.loadNativeLibrary(Cryptonight.class, "cryptonight");
	}

	public static native void fastHash(byte[] input, byte[] output) throws InvalidOutputLengthException;
	
	public static native void hash(byte[] input, byte[] output) throws InvalidOutputLengthException;
}
