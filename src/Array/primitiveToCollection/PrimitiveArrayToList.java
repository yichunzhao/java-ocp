package Array.primitiveToCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/** converting a primitive array to a list */
public class PrimitiveArrayToList {
  private static final int[] numbs = {999, 333, 25, 3, 6, 9};

  public static List<Integer> byForEach(int[] ints) {
    List<Integer> numbs = new ArrayList<>();
    for (int i : ints) {
      numbs.add(i);
    }
    return numbs;
  }

  public static List<Integer> byStream(int[] ints) {
    return Arrays.stream(ints).boxed().collect(toList());
  }

  public static List<Integer> byIntStream(int[] ints) {
    return IntStream.of(ints).boxed().collect(toList());
  }

  public static void main(String[] args) {

    System.out.printf("by for each loop: %s \n ", byForEach(numbs));
    System.out.printf("by java 8 stream: %s \n ", byStream(numbs));
    System.out.printf("by java 8 IntStream: %s \n ", byIntStream(numbs));
  }
}
