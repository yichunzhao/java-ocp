package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * array must be sorted first, otherwise the search result is undefined. and therefore, elements in the array must be
 * Comparable.
 * <p>
 * In java String, Wrapper, Dates and Times classes are natural ordered, meaning that they have implemented Comparable
 * interfaces.
 * <p>
 * In order to become natural ordered, any other classes mush implement Comparable interface or provide external
 * Comparators.
 *
 * Binary search is only applied on the Array and List
 *
 * Binary search: O(log(n))
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
