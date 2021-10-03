package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Generic type argument, Compiling failure case.
 *
 * <p>Reference variable generic type and instance generic type must be identical.
 *
 * <p>so we define a generic collection as a method argument, and assign it with a collection of
 * subtypes
 *
 * <p>this generates a compiling error
 */
public class GenericTypeCollectionAsArgumentWrongCase {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 6, 9));
    // this gives a compiling error
    // System.out.println(inputNumbers(numbers));
  }

  public static List<Number> inputNumbers(List<Number> numbers) {
    numbers.add(1L);
    return numbers;
  }
}
