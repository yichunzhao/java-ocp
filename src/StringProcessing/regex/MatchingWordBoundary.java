package StringProcessing.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * matching word boundaries; a word boundary
 * \b: a word boundary
 * \B: a non-word boundary
 * ^: beginning of a line
 * $: end of a line
 */
public class MatchingWordBoundary {
    private static String target = "the leather in their code made her seethe";

    public static void main(String[] args) {
        //word boundary
        Matcher matcher = Pattern.compile("\\b").matcher(target);

        while (matcher.find()) {
            System.out.printf("group: %s, start: %s, end: %s \n", matcher.group(), matcher.start(), matcher.end());
        }

        System.out.println("........................");

        //non-word boundary
        Matcher matcher1 = Pattern.compile("\\B").matcher(target);
        while (matcher1.find()) {
            System.out.printf("group: %s, start: %s, end: %s \n", matcher1.group(), matcher1.start(), matcher1.end());
        }

        System.out.println("............a word boundary followed by 'the'......................................... ");
        Matcher matcher2 = Pattern.compile("\\bthe").matcher(target);
        while (matcher2.find()) {
            System.out.printf("group: %s, start: %s, end: %s \n", matcher2.group(), matcher2.start(), matcher2.end());
        }

        System.out.println("............a non-word boundary followed by 'the'................................... ");
        Matcher matcher3 = Pattern.compile("\\Bthe").matcher(target);
        while (matcher3.find()) {
            System.out.printf("group: %s, start: %s, end: %s \n", matcher3.group(), matcher3.start(), matcher3.end());
        }

        boolean matchedLine = target.matches("^the.+$");
        System.out.println("line pattern matched? " + matchedLine);


        boolean matchedLine1 = target.matches("the.+");
        System.out.println("line pattern matched? " + matchedLine1);

        System.out.println("matching line start");
        Matcher matcher4 = Pattern.compile("^").matcher(target);
        while (matcher4.find()) {
            System.out.printf("group: %s, start: %s, end: %s \n", matcher4.group(), matcher4.start(), matcher4.end());
        }

        System.out.println("matching line end");
        Matcher matcher5 = Pattern.compile("$").matcher(target);
        while (matcher5.find()) {
            System.out.printf("group: %s, start: %s, end: %s \n", matcher5.group(), matcher5.start(), matcher5.end());
        }
    }
}
