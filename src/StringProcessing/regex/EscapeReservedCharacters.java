package StringProcessing.regex;

import java.util.regex.Pattern;

/**
 * Escape reserved characters, given a string.
 * Pattern.quote(input) wraps the string with \Q and \E,
 * which tells the regex engine to treat everything in between as literals.
 */
public class EscapeReservedCharacters {

    public static void main(String[] args) {
        // escape reserved characters, given a string
        String target = "a*b, {4*5}";

        // escape reserved characters, . ^ $ * + ? { } [ ] \ | ( )
        String escaped = Pattern.quote(target);

        // printout the escaped string, with description.
        System.out.printf("escaped: %s \n", escaped);
    }
}
