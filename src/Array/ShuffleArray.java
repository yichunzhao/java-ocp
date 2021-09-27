package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ShuffleArray {
  public static void main(String[] args) {
    int[] ints = {1, 2, 3, 4, 5, 6, 7};
    System.out.println(Arrays.toString(ints));

    // boxing an array of primitives
    List<Integer> integerList = Arrays.stream(ints).boxed().collect(toList());
    System.out.println(integerList);

    // shuffle only a List of Instances
    Collections.shuffle(integerList);
    System.out.println("shuffled ints: " + integerList);
  }
}
