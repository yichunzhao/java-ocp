package StringProcessing.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Quantifiers:
 * <p>
 * standing for how many times a pattern(a single character or a group) repeating itself.
 * <p>
 * X? optional 0-1
 * X+ 1 or many
 * X* 0 or many
 */
public class UsingQuantifiers {
    private static String target = "b234a A6Z abc ab";

    public static void main(String[] args) {
        Matcher matcher = Pattern.compile("[a-zA-Z]\\d+[a-zA-Z]").matcher(target);

        while (matcher.find()) {
            System.out.println("matcher group: " + matcher.group() + " start: " + matcher.start() + " end: " + matcher.end()
                    + " " + target.substring(matcher.start(), matcher.end()));
        }

        Matcher matcher1 = Pattern.compile("[a-zA-Z]\\d*[a-zA-Z]").matcher(target);
        while (matcher1.find()) {
            System.out.println("matcher1 group: " + matcher1.group() + " start: " + matcher1.start() + " end: " + matcher1.end()
                    + " " + target.substring(matcher1.start(), matcher1.end()));
        }

    }
}
