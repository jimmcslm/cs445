package com.example.project;

/** Contains methods to perform different calculations. */
public class Calculator {
  /**
   * Divides two numbers, returning zero if the denominator is zero.
   *
   * @param numerator Numerator of numbers to be divided
   * @param denominator Denominator of numbers to be divided
   * @return Divided number.
   */
  public int safeDivide(int numerator, int denominator) {
    if (denominator == 0) {
      return 0;
    } else {
      return numerator / denominator;
    }
  }
}
