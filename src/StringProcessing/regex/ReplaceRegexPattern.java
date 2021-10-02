package StringProcessing.regex;

/**
 * String replaceAll(regex,replacement)
 *
 * <p>return Pattern.compile(regex).matcher(this).replaceAll(replacement);
 */
public class ReplaceRegexPattern {
  private static String str = "cat cup copp";

  public static void main(String[] args) {
    String result = str.replaceAll("c.p\\b", "()");
    System.out.println(result);
  }
}
