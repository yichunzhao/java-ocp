package StringProcessing.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * searching the literal string 'the' for the at either the beginning or end of a word, but not in its middle
 */
public class FindThe {
    private static String target = "The leather in their coat made her seethe";

    public static void main(String[] args) {

        Matcher matcher = Pattern.compile("\\bthe|the\\b").matcher(target);
        while (matcher.find()) {
            System.out.printf("group: %s start: %s end: %s \n ", matcher.group(), matcher.start(), matcher.end());
        }

    }
}
