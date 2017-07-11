# cryptonight

> Java bindings for cryptonight hashing

## Support

Requires a 64-bit CPU/OS/JVM with AES-NI support. Tested on Linux but should
work on Windows too. Other operating systems are not supported at this time.

## Usage

Add jar to classpath and call `Cryptonight.fastHash`

	import net.rapidhashing.cryptonight.Cryptonight;

	[...]

	byte[] outputBuffer = new byte[32];
	Cryptonight.fastHash("test".getBytes(), outputBuffer);

## License

Licensed under the Apache License Version 2.0
