package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculatorTest {
  private final Calculator calculator = new Calculator();

  @Test
  void safeDivideSucceeds() {
    assertEquals(2, calculator.safeDivide(2, 1));
  }

  @Test
  void safeDivideHandlesZero() {
    assertEquals(0, calculator.safeDivide(2, 0));
  }

  private static Stream<Arguments> provideDivisionPairsForSafeDivide() {
    return Stream.of(Arguments.of(1, 1, 1), Arguments.of(1, 0, 0), Arguments.of(-1, 1, -1));
  }

  @ParameterizedTest
  @MethodSource("provideDivisionPairsForSafeDivide")
  void safeDivideParamatrized(int numerator, int denominator, int expected) {
    assertEquals(expected, calculator.safeDivide(numerator, denominator));
  }
}
