package StringProcessing.regex;

/**
 * Valid email address format A valid email address consists of an email prefix and an email domain,
 * both in acceptable formats.
 *
 * <p>The prefix appears to the left of the @ symbol.
 *
 * <p>The domain appears to the right of the @ symbol.
 *
 * <p>For example, in the address example@mail.com, "example" is the email prefix, and "mail.com" is
 * the email domain.
 *
 * <p>Acceptable email prefix formats Allowed characters: letters (a-z), numbers, underscores,
 * periods, and dashes. An underscore, period, or dash must be followed by one or more letter or
 * number.
 *
 * <p>Acceptable email domain formats Allowed characters: letters, numbers, dashes. The last portion
 * of the domain must be at least two characters, for example: .com, .org, .cc
 */
import java.util.Arrays;
import java.util.regex.Pattern;

public class ParsingEmailUsingRegularExpression {

  public static void main(String[] args) {
    String pattern = "[a-z0-9_.-]+@([a-z0-9-]+\\.)+[a-z]{2}";

    Pattern expectedEmailPattern = Pattern.compile(pattern);

    Arrays.asList(
            "yn.z@hotmail.com",
            "ynz@hotmail.",
            "@ynz",
            "mike.what@google.c",
            "mike_what@google.cc",
            "_mikewhat@google.cc",
            "yn.z@hotmail",
            "yn.z@hit.edu.cn")
        .forEach(
            s -> {
              System.out.println(
                  "is " + s + " a valid email? " + expectedEmailPattern.matcher(s).find());
            });
  }
}
