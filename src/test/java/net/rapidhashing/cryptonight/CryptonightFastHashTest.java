package net.rapidhashing.cryptonight;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CryptonightFastHashTest {
	public static final String WOWZA = "wowza";
	public static final byte[] WOWZA_HASH = { (byte) 0x2F, (byte) 0x45, (byte) 0x84, (byte) 0xAC, (byte) 0x63,
			(byte) 0x10, (byte) 0x36, (byte) 0xBD, (byte) 0xDC, (byte) 0x48, (byte) 0x2A, (byte) 0xAF, (byte) 0xFD,
			(byte) 0x27, (byte) 0xB6, (byte) 0x7D, (byte) 0xBF, (byte) 0x94, (byte) 0x7E, (byte) 0x04, (byte) 0xC3,
			(byte) 0xBA, (byte) 0x67, (byte) 0x54, (byte) 0x3B, (byte) 0x85, (byte) 0x39, (byte) 0xA8, (byte) 0xA4,
			(byte) 0x3F, (byte) 0x0D, (byte) 0xC5 };

	public static final String SPICY = "spicy";
	public static final byte[] SPICY_HASH = { (byte) 0x80, (byte) 0x59, (byte) 0xFA, (byte) 0xCA, (byte) 0x72,
			(byte) 0xD9, (byte) 0x96, (byte) 0x94, (byte) 0x2B, (byte) 0xBB, (byte) 0x0E, (byte) 0x22, (byte) 0xE9,
			(byte) 0xCA, (byte) 0x42, (byte) 0xF2, (byte) 0x46, (byte) 0x69, (byte) 0x6E, (byte) 0x0E, (byte) 0x22,
			(byte) 0xAE, (byte) 0xBC, (byte) 0x50, (byte) 0xD3, (byte) 0x85, (byte) 0x09, (byte) 0x35, (byte) 0x15,
			(byte) 0x68, (byte) 0xCF, (byte) 0x59 };

	@Test
	public void testWowza() {
		byte[] outputBuffer = new byte[32];

		Cryptonight.fastHash(WOWZA.getBytes(), outputBuffer);
		assertArrayEquals(WOWZA_HASH, outputBuffer);
	}

	@Test
	public void testSpicy() {
		byte[] outputBuffer = new byte[32];

		Cryptonight.fastHash(SPICY.getBytes(), outputBuffer);
		assertArrayEquals(SPICY_HASH, outputBuffer);
	}
}
