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

	/**
	 * 
	 * @param input
	 * @param output
	 */
	public static native void fastHash(byte[] input, byte[] output);
}
