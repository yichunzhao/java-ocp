package StringProcessing.regex;

import java.util.Arrays;

/**
 * using Regular expression to parse a String
 */
public class SearchWithinString {

    public static void main(String[] args) {
        String string = "Nearly 160,000 candidates are vying for seats in local parliaments. " +
                "Governors are also being elected in many regions.";
        System.out.println("original: " + string);

        String withoutDigits = string.replaceAll("[\\d,.]", "");
        System.out.println("removing digits: " + withoutDigits);

        String[] words = withoutDigits.split("[\\s]+");
        System.out.println("words: " + Arrays.asList(words));
    }
}
