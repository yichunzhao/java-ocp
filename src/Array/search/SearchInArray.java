package Array.search;

import java.util.Arrays;

/**
 * array must be sorted first, otherwise the search result is undefined. and therefore, elements in
 * the array must be Comparable.
 *
 * <p>In java String, Wrapper, Dates and Times classes are natural ordered, meaning that they have
 * implemented Comparable interfaces.
 *
 * <p>In order to become natural ordered, any other classes mush implement Comparable interface or
 * provide external Comparators.
 *
 * <p>Binary search is only applied on the Array and List
 *
 * <p>Binary search: O(log(n))
 */
public class SearchInArray {
  private static int[] numbers = {12, 34, 56, 13, 14, 22, 77, 20};

  public static void main(String[] args) {
    System.out.println("numbers : " + Arrays.toString(numbers));

    Arrays.sort(numbers);
    System.out.println("sorted : " + Arrays.toString(numbers));
    System.out.println("index of the num: " + Arrays.binarySearch(numbers, 20));

    System.out.println("if a num is not found: " + Arrays.binarySearch(numbers, 100));
  }
}
