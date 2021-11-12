package org.roukou.puzzles.performance.puzzle1;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class SumOperationPuzzleBenchmarks {

  @Benchmark
  public void sum0To1395() {
    int result = SumOperationPuzzle.sum0To1395();
  }

  @Benchmark
  public void sum0To1396() {
    int result = SumOperationPuzzle.sum0To1396();
  }

  @Benchmark
  public void sum0To1397() {
    int result = SumOperationPuzzle.sum0To1397();
  }

  public static void main(String[] args) throws RunnerException {
    Options opt = new OptionsBuilder()
        .include(SumOperationPuzzleBenchmarks.class.getSimpleName())
        .forks(1)
        .build();

    new Runner(opt).run();
  }
}
