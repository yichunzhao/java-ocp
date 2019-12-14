package CodeCharllenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//HOW TO SOLVE 8-PUZZLE ISSUE?

public class ShufflePuzzle {

  public static void main(String[] args) {
    //
    String[] x ={"1","2","3","4","5","6","7","None"};
    List<String> shuffled = Arrays.asList(x);
    Collections.shuffle(shuffled);

    System.out.println(shuffled);


  }
}
