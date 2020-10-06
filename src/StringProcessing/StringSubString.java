package StringProcessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * subString(startIndex, endIndex); startIndex(inclusive) and endIndex(exclusive)
 * subString return String
 * subSequence return CharSequence
 *
 * Throw runtime exception when index beyond the scope.  
 */
public class StringSubString {
    private static String target = "Method subSequence() simply calls method substring()";

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


    }

}
