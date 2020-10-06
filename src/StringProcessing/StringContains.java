package StringProcessing;

/**
 * target.Contains(CharSequence c); so contains is able to accept both String and StringBuilder
 */
public class StringContains {
    private static String target = "paint the cup and the plate";

    public static void main(String[] args) {

        //String IS-A CharSequence
        System.out.println("target contains 'the'? " + target.contains("the"));

        //StringBuilder IS-A CharSequence
        System.out.println("target contains 'the'? " + target.contains(new StringBuilder("the")));
    }
}
