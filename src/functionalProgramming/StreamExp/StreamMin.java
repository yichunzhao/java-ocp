package functionalProgramming.StreamExp;

import java.util.Arrays;

public class StreamMin {

  public static void main(String[] args) {
    var numbers = Arrays.asList(12, 34, 56, 78);
    var minOpt = numbers.stream().min(Integer::compareTo);
    if (minOpt.isPresent()) {
      System.out.printf("min: %s \n", minOpt.get());
    } else {
      System.out.printf("min: %d \n", -1);
    }
  }
}
