package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;


/**
 * how to find a max/min value in an array. it is easy to use java 8 stream.
 */
public class FindMaxMin {
    private static Random r = new Random();
    private static int[] ints = new int[20];

    static {
        IntStream.range(0, ints.length).forEach(i -> ints[i] = r.nextInt(100));
    }

    public static void main(String[] args) {
        System.out.println("original int array: " + Arrays.toString(ints));

        //using java 8 stream
        Arrays.stream(ints).max().ifPresent(max -> System.out.println("max: " + max));

        Arrays.stream(ints).min().ifPresent(min -> System.out.println("min: " + min));

        Arrays.stream(ints).average().ifPresent(v -> System.out.println("average: " + v));

        System.out.println("sum: " + Arrays.stream(ints).sum());
    }

}
