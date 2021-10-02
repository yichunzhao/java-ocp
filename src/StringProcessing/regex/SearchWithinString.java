package StringProcessing.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * using Regular expression to parse a String;
 *
 * <p>Pattern doesn't have a public constructor, but it offers a static factory method to create a
 * Pattern instance from a RegEx string; Pattern instance to create a Matcher from a static instance
 * factory method.
 */
public class SearchWithinString {

  public static void main(String[] args) {
    String string =
        "Nearly 160,000 candidates are vying for seats in local parliaments. "
            + "Governors are also being elected in many regions.";
    System.out.println("original: " + string);

    String withoutDigits = string.replaceAll("[\\d,.]", "");
    System.out.println("removing digits: " + withoutDigits);

    String[] words = withoutDigits.split("[\\s]+");
    System.out.println("words: " + Arrays.asList(words));

    String another = "I am fine to dine at nine";
    Matcher matcher = Pattern.compile("[fdn]ine").matcher(another);
    while (matcher.find()) {
      System.out.println(
          "group: "
              + matcher.group()
              + " start: "
              + matcher.start()
              + " end: "
              + matcher.end()
              + "substring matched pattern: "
              + another.substring(matcher.start(), matcher.end()));
    }

    // invalid pattern; throw PatternSyntaxException
    try {
      Matcher matcherInValid = Pattern.compile("{}").matcher(another);
      matcherInValid.find();
    } catch (PatternSyntaxException e) {
      System.out.println(e);
    }
  }
}
