package functionalProgramming.StreamExp;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMatch {

  public static void main(String[] args) {

    var list = Arrays.asList(1, 78);

    // any list member match stream.
    var isAnyMatched = Stream.of(23, 45, 56, 78).anyMatch(list::contains);
    System.out.printf("any match list? %b \n", isAnyMatched);

    // false
    var isAllMatched = Stream.of(23, 45, 56, 78).allMatch(list::contains);
    System.out.printf("all match list? %b \n", isAllMatched);
  }
}
