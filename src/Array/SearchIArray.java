package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * array must be sorted first, otherwise the search result is undefined. and therefor, elements in the array must be
 * Comparable.
 */

public class SearchIArray {
    private static int[] numbers = new int[100];
    private static Random random;

    static {
        random = new Random();
        IntStream.range(0, 100).forEach(i -> numbers[i] = random.nextInt(100));
        Arrays.sort(numbers);
    }

    public static void main(String[] args) {
        System.out.println("numbers : " + Arrays.toString(numbers));
        System.out.println("index of the num: " + Arrays.binarySearch(numbers, 20));
    }

}
