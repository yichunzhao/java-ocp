package functionalProgramming.StreamExp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamMaxMin {

  public static void main(String[] args) {

    Random random = new Random(10);
    //
    List<Integer> numberList = new ArrayList<>();
    IntStream.range(0, 10).forEach(i -> numberList.add(random.nextInt(10)));
    System.out.printf("numbers: %s \n ", numberList);

    var result = numberList.stream().max(Integer::compare);

    if (result.isPresent()) {
      System.out.printf("max: %s \n", result.get());

    } else {
      System.out.printf("max is not present");
    }
  }
}
