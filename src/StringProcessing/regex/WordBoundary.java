package StringProcessing.regex;

import java.util.Arrays;

/**
 * what is word boundary?  regEx:  "\\b"; each word, space, and comma starting with a word boundary.
 */
public class WordBoundary {

    public static void main(String[] args) {
        String target = "amita, matinda,shreya,mike, and anthony are arrogant";
        Arrays.stream(target.split("\\b")).forEach(s -> System.out.println(s));

        System.out.println("size: " + target.split("\\b").length);

        //replace the first letter of all words with A.

        //replaceAll("regEx",replacement)
        System.out.printf("replace the first letter with A: %s \n", target.replaceAll("\\b\\w", "A"));
        //replace(charSequence literal, CharSequence literal)
        System.out.printf("replace the first letter with A: %s \n", target.replace("\\b\\w", "A"));

        System.out.format("%s %b %d", ("Hello"), "FALSE", new Integer(123456));
        System.out.println("(\"Hello\") is Object? " + (("Hello") instanceof Object));
        System.out.println("(\"Hello\") is String? " + (("Hello") instanceof String));

        System.out.printf(" %b \n  ", "e Java Guru".matches("[\\w\\s]+"));
    }
}
