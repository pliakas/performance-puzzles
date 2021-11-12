package org.roukou.puzzles.performance.puzzle1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.roukou.puzzles.performance.extensions.TestExecutionDurationException;

@ExtendWith(TestExecutionDurationException.class)
class SumOperationPuzzleTest {

  @Test
  void sum0To1395() {

    // act
    var result = SumOperationPuzzle.sum0To1395();

    // assert
    assertEquals(973710, result);
  }

  @Test
  void sum0To1396() {

    // act
    var result = SumOperationPuzzle.sum0To1396();

    // assert
    assertEquals(975106, result);
  }

  @Test
  void sum0To1397() {

    // act
    var result = SumOperationPuzzle.sum0To1397();

    // assert
    assertEquals(976503, result);
  }
}