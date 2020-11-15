package StringProcessing;

import java.util.Arrays;

/**
 * String static join method
 * <p>
 * public static String join(CharSequence var0, CharSequence... var1)
 * public static String join(CharSequence var0, Iterable<? extends CharSequence> var1)
 */
public class StringJoin {

    public static void main(String[] args) {
        //join strings with a conjunction.
        String joinedString = String.join("--", "java", "world");
        System.out.println("joined String : " + joinedString);

        //join an iterable in to string with a conjunction String
        System.out.println(String.join("+", Arrays.asList("what", "are", "you", "doing")));
    }
}
