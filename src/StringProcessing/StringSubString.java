package StringProcessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * subString(startIndex, endIndex); startIndex(inclusive) and endIndex(exclusive)
 * subString(startIndex) from startIndex until the end of this String
 * subString return String
 * subSequence return CharSequence
 * <p>
 * Throw runtime exception when index beyond the scope.
 */
public class StringSubString {
    private static String target = "Method subSequence() simply calls method substring()";
    private static String eJava = "e Java Guru";

    public static void main(String[] args) {

        Matcher matcher = Pattern.compile("d").matcher(target);
        int start = 0;
        if (matcher.find()) start = matcher.start();
        System.out.println("first d start : " + start);

        //
        System.out.printf("subString from index 0,start+1: %s \n", target.substring(0, start + 1));
        System.out.printf("subSequence from index 0,start+1: %s \n", target.subSequence(0, start + 1));

        //forward direction
        System.out.printf("subString from index start+1: %s \n", target.substring(start + 1));

        System.out.println("eJava.subSequence(3, 4) is " + eJava.subSequence(3, 4));
        System.out.println("eJava.subString(3, 4) is " + eJava.substring(3, 4));
        System.out.println("eJava length is " + eJava.length());

        //subString(int start, int end); subString(int start) returns subString until end
        System.out.printf("eJava.subSequence(11) is empty ? %b \n ", eJava.substring(11).isEmpty());
        System.out.println();

        System.out.println(eJava);
        System.out.println(eJava.replace(
                eJava.subSequence(3, 4), eJava.substring(11)));

    }

}
