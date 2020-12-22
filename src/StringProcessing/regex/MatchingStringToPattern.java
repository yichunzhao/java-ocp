package StringProcessing.regex;

/**
 * for answering a query from the facebook.
 */
public class MatchingStringToPattern {
    private static String pattern = "d[*]{8}4@g[*]{2}.com";

    public static void main(String[] args) {
        String text = "d********4@g**.com";

        System.out.println("match? " + text.matches(pattern));
    }
}
