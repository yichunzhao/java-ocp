package regx;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchWithinString {

    public static void main(String[] args) {

        String string = "Nearly 160,000 candidates are vying for seats in local parliaments. " +
                "Governors are also being elected in many regions.";

        String[] words = string.split("[\\W]");
        System.out.println("words: "+ Arrays.asList(words));


        Matcher matcher = Pattern.compile("\\s\\w\\s").matcher(string);
        while (matcher.find()){
            System.out.printf("Found: %s: starts at %d, ends at %d", matcher.group(),matcher.start(),matcher.end());
        }



        System.out.println(Pattern.compile("\\w").matcher(string).find());



    }
}
