package net.rapidhashing.cryptonight;

import org.junit.Test;

import com.carrotsearch.junitbenchmarks.AbstractBenchmark;
import com.carrotsearch.junitbenchmarks.BenchmarkOptions;

public class CryptonightFastHashBenchmark extends AbstractBenchmark {
	public static final String BENCHMARK = "benchmark";

	private byte[] outputBuffer = new byte[32];

	@BenchmarkOptions(benchmarkRounds = 500000, warmupRounds = 10000)
	@Test
	public void benchmarkFastHash() throws InterruptedException {
		Cryptonight.fastHash(BENCHMARK.getBytes(), outputBuffer);
	}
}
