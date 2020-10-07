package StringProcessing;

/**
 * indexOf and lastIndexOf;
 * <p>
 * indexOf searching in an forward direction; lastIndexOf searching in a backward direction.
 * <p>
 * indexOf('t', index) searching substring from index(initial point) to the end forward direction
 * lastIndexOf('t',index) searching substring from 0 to the index(ending point) in a backward direction.
 */
public class IndexOfAndLastIndexOf {
    private static String target = "paint the cup and the plate";

    public static void main(String[] args) {
        //4
        System.out.println("index of 't': " + target.indexOf("t"));

        //6
        System.out.println("index of 'the': " + target.indexOf("the"));

        //25
        System.out.println("last index of 't': " + target.lastIndexOf("t"));

        //18
        System.out.println("last index of 'the': " + target.lastIndexOf("the"));

        //substring from index 15 to the end. 18
        System.out.println("index of 'the': " + target.indexOf("the", 15));

        //substring from index 0 to 15. 6
        System.out.println("index of 'the': " + target.lastIndexOf("the", 15));

        //index starting -100; subString from -100 to the end; meaning that the entire String.
        System.out.println("index of 'a': " + target.indexOf("a", 0));
        System.out.println("index of 'a': " + target.indexOf("a", -100));

        //lastIndex -100; from 0 to -100; it should return -1; not found
        System.out.println("index of 'a': " + target.lastIndexOf("a", -100));

    }
}
