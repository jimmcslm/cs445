package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharConverterTest {
  private final CharConverter converter = new CharConverter();

  @Test
  void convertIntToLetterSucceeds() {
    assertEquals("A", converter.convertIntToLetter(65));
  }
}
