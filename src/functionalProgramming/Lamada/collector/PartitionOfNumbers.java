package functionalProgramming.Lamada.collector;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PartitionOfNumbers {

  public static void main(String[] args) {
    // Generating a list of random integer between 0, 100
    var rand = new Random();

    List<Integer> numbers = new ArrayList<>();
    IntStream.rangeClosed(0, 20).forEach(i -> numbers.add(rand.nextInt(30)));

    System.out.printf("numbers %s \n", numbers);

    System.out.println("partition: >12");

    Map<Boolean, List<Integer>> parts =
        numbers.stream().collect(Collectors.partitioningBy(n -> n > 12));
    System.out.printf("number >12: %s \n", parts.get(true));
    System.out.printf("number <=12: %s \n", parts.get(false));
  }
}
