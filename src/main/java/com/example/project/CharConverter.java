package com.example.project;

/** Contains methods for different character conversions */
public class CharConverter {
  /**
   * Converts integers to characters according to their ASCII code value. If the integer does not
   * correspond to an uppercase or lowercase letter, an empty String is returned.
   *
   * @param x Integer to convert
   * @return Converted character or empty string
   */
  public String convertIntToLetter(int x) {
    // If integer value corresponds to a lowercase or uppercase character
    if ((x >= 65 && x <= 90) || (x >= 97 && x <= 123)) {
      return String.valueOf(Character.toChars(x));
    } else {
      return "";
    }
  }
}
