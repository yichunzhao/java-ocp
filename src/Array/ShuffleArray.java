package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
  public static void main(String[] args) {
    // assume we have an array of int in a sequence, and shuffle it, and see what happened.
    Integer[] ints = {1, 2, 3, 4, 5, 6, 7};

    List<Integer> shuffled = Arrays.asList(ints);

    Collections.shuffle(shuffled);

    System.out.println(shuffled);
  }
}
