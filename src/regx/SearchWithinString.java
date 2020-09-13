package regx;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SearchWithinString {

    public static void main(String[] args) {

        String string = "Nearly 160,000 candidates are vying for seats in local parliaments. " +
                "Governors are also being elected in many regions.";

        String[] words = string.split("\\W");
        System.out.println("words: "+ Arrays.asList(words));


    }
}
