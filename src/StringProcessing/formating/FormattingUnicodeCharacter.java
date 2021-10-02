package StringProcessing.formating;

/**
 * Formatting parameter %c, output a unicode character.
 *
 * <p>You can pass only literals and variables that can be converted to a Unicode character (char,
 * byte, short, int, Character, Byte, Short, and Integer) to the %c specifier. Passing variables of
 * type boolean, long, float, Boolean, Long, Float, or any other class will throw
 * IllegalFormatConversionException.
 */
public class FormattingUnicodeCharacter {

  public static void main(String[] args) {
    System.out.printf("\nChar %c", new Character('\u009b'));
    System.out.printf("\nChar %c", new Character('\u008b'));

    System.out.printf("\nChar %c", '\u6124');
    // cannot be converted to Unicode character
    // throw java.util.IllegalFormatConversionException: c != java.lang.Boolean
    try {
      System.out.printf("\nChar %c", new Boolean(true));

    } catch (Exception e) {
      System.out.println(e);
    }

    // values with invalid Unicode won't compile
    // System.out.printf("\nChar %c", '\affff');
  }
}
