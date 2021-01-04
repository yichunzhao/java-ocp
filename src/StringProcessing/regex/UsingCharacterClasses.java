package StringProcessing.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Using Character classes to match word boundary or non-word boundary; in order to limit the search.
 * <p>
 * They are predefined patterns for your convenience.
 * <p>
 * <p>
 * \b a word boundary
 * \B a non-word boundary
 * <p>
 * ^ beginning of a line
 * $ end of a line
 */
public class UsingCharacterClasses {
    public static String target = "the leather in their code made her seethe";

    public static void main(String[] args) {

        //matching word boundary followed by 'the'
        Pattern pattern = Pattern.compile("\\bthe");
        Matcher matcher = pattern.matcher(target);
        while (matcher.find()) {
            System.out.println("pattern: Group " + matcher.group() + " start: " + matcher.start() + " emd: " + matcher.end());
        }

        //matching Non-word boundary followed by 'the'
        Pattern pattern1 = Pattern.compile("\\Bthe");
        Matcher matcher1 = pattern1.matcher(target);
        while (matcher1.find()) {
            System.out.println("pattern1 Group " + matcher1.group() + " start: " + matcher1.start() + " emd: " + matcher1.end());
        }

        //\b stands for both starting boundary and ending boundary
        //match words that starting with 'the', or ending with 'the'
        Pattern pattern2 = Pattern.compile("\\bthe|the\\b");
        Matcher matcher2 = pattern2.matcher(target);
        while (matcher2.find()) {
            System.out.println("pattern2 Group " + matcher2.group() + " start: " + matcher2.start() + " emd: " + matcher2.end());
        }

        System.out.println("matching Buy: " + "Buy".matches("Buy|Sell"));
        System.out.println("matching Buy: " + "Sell".matches("Buy|Sell"));
    }
}
