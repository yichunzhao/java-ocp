package StringProcessing.regex;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * regex pattern string includes seq. position info.
 * <p>
 * character class: a set of characters. [] match one of characters inside the square braces.
 */
public class ParsingCharacterSeqOccurrence {

    public static void main(String[] args) {
        //matching _ followed by one or more a to z.
        String patternStr = "[_][a-z]+";
        Pattern pattern = Pattern.compile(patternStr);

        Arrays.asList("_", "a_", "_a", "abc_", "_abc", "abc").forEach(s -> {
            boolean match = pattern.matcher(s).find();
            System.out.println("Does " + s + " match pattern? " + match);
        });

        String patternStr1 = "s.n";
        Pattern pattern1 = Pattern.compile(patternStr1);
        Arrays.asList("sun", "soon", "son").forEach(s -> {
            System.out.println("Does " + s + " match pattern1? " + pattern1.matcher(s).find());
        });

        //A string starts with Sh end with y or a
        String patternStr2 = "Sh.+[ya]";
        Pattern pattern2 = Pattern.compile(patternStr2);
        Arrays.asList("Sh er y", "Shy", "sh er y", "Sh er a").forEach(s -> {
            System.out.println("Does " + s + " match pattern2? " + pattern2.matcher(s).find());
        });

        //Searching usernames in a text file - find the ones that are exactly 10 characters long, starting with a letter
        //A and followed by 4 digits and 5 letters. A(\\d{5}\\w{5})

    }
}
