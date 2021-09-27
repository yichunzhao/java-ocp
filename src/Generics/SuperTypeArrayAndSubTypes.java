package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * array polymorphism; and List polymorphism. Generic reference type, and Generic instance types
 * must be identical.
 */
public class SuperTypeArrayAndSubTypes {

  public static void main(String[] args) {

    Integer[] numbers = {10, 2, 3};
    System.out.println(Arrays.toString(inputNumbers(numbers)));
    Double[] doubles = {10.1, 11.2, 13.5};
    System.out.println(Arrays.toString(doubles));

    // reference generic type must identical to its object generic type;
    List<Integer> numbs = new ArrayList<>(); // a list of Integers objects
    // the following doesn't work! compiling error.
    // inputNumbers(numbs);//method argument:  List<Number> numbers
    System.out.println(inputNumbers(Arrays.asList(1, 2, 3)));
    // this is a generic method; the type is inferred from
    // the return type, namely Number; that is why it works.
  }

  private static Number[] inputNumbers(Number[] numbers) {
    return numbers;
  }

  private static List<Number> inputNumbers(List<Number> numbers) {
    return numbers;
  }
}
