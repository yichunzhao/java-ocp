package StringProcessing.formating;

/**
 * Conversion character d(digits) and f(floating:float and double), i.e. %d and %f
 *
 * <p>Bank statements are formatted in a particular manner, fx: a max width 20 digits, with exactly
 * 2 digits after the decimal point, and grouped according to the locale-specific information.
 *
 * <p>the formatting of the numbers is specific to the default locale.
 *
 * <p>You need to remember the following flags: - Left-justify this argument; must specify width as
 * well. + Include a sign (+ or -) with this argument. Applicable only if conversion character is d
 * or f (for numbers). 0 Pad this argument with zeros. Applicable only if conversion character is d
 * or f (for numbers). Must specify width as well. , Use locale-specific grouping separators (for
 * example, the comma in 123,456). Applicable only if conversion character is d or f (for numbers).
 * ( Enclose negative numbers in parentheses. Applicable only if conversion character is d or f (for
 * numbers).
 *
 * <p>You can pass literal values or variables of type byte, short, int, long, Byte, Short, Integer,
 * or Long to the %d format specifier. The code throws runtime exceptions for all other types of
 * values.
 *
 * <p>Also, the flags +, 0, (, and ,(comma) can be specified only with the numeric specifiers %d and
 * %f. If you try to use them with any other format specifier (%b, %s, or %c), you’ll get a runtime
 * exception.
 */
public class DefineFormattingFloatDouble {

  public static void main(String[] args) {
    System.out.printf("[%f]\n", 12.12345);
    System.out.printf("[%10f]\n", 12.12345); // width 10 character length; default right justified
    System.out.println("pad with zeros");
    System.out.printf("[%010f]\n", 12.12345);
    System.out.println("//lef justified");
    System.out.printf("[%-10f]\n", 12.12345);
    System.out.printf("[%10.2f]\n", 12.12345); // two digits after decimal point
    System.out.println(", Use locale-specific grouping separators");
    System.out.printf("[%,f]\n", 123456789.12345);

    // Though you can assign an int literal to a float or double variable (float f = 10 or
    // long d = 10), you can’t use int variables or literal values with %f.

    try {
      System.out.printf("[%f]", 12345);
    } catch (Exception e) {
      System.out.println(e);
    }

    System.out.printf("[%,+010.2f]", 12345f);
  }
}
