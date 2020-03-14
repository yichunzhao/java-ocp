package StreamExp;

import java.util.Arrays;
import java.util.stream.StreamSupport;

/** Converting Iterable into Stream */
public class IterableToSteam {

  public static void main(String[] args) {

    Iterable<String> iterable =
        Arrays.asList("whatever", "virus", "what is a rest API?", "the six constrains of REST");

    StreamSupport.stream(iterable.spliterator(), false)
        .mapToInt(i -> i.length())
        .forEach(System.out::println);
  }
}
