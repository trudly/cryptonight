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
	
## Maven Dependency

	<repositories>
	    <repository>
	        <snapshots>
	            <enabled>false</enabled>
	        </snapshots>
	        <id>bintray-rapidhashing-cryptonight</id>
	        <name>bintray</name>
	        <url>http://dl.bintray.com/rapidhashing/cryptonight</url>
	    </repository>
	</repositories>
	
	<dependencies>
		<dependency>
		  <groupId>net.rapidhashing</groupId>
		  <artifactId>cryptonight</artifactId>
		  <version>1.0.0</version>
		  <type>pom</type>
		</dependency>
	</dependencies>

## License

Licensed under the Apache License Version 2.0
