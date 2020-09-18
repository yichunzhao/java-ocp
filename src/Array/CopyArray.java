package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * given a array, making a copy of it using the helper Arrays class static methods.
 */
public class CopyArray {
    private static Random r = new Random();
    private static int[] array = new int[20];

    static {
        IntStream.range(0, array.length).forEach(i -> array[i] = r.nextInt(100));
    }

    public static void main(String[] args) {
        //input the array to be copied and its length. Internally a new int[] is created according to this length.
        int[] copy = Arrays.copyOf(array, array.length);
        System.out.println("copy and original equal? " + (Arrays.equals(copy, array)));
    }


}
