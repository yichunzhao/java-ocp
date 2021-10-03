/*
 * Generate a stream by static method generate.
 *
 *
 */
package functionalProgramming.StreamExp;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/** @author YNZ */
public class StreamGenerateMethod {

  public static void main(String[] args) {

    List<String> echos = Stream.generate(() -> "echo").limit(10).collect(toList());
    System.out.println("results: " + echos);

    List<Double> doubleNumbers =
        Stream.generate(() -> Math.random()).limit(10).sorted().collect(toList());
    System.out.println("doubleNumbers: " + doubleNumbers);

    Optional<Double> maxValuedoubleNumbers =
        doubleNumbers.stream().max((d1, d2) -> d1.compareTo(d2));
    System.out.println("max value among 10: " + maxValuedoubleNumbers.orElse(Double.NaN));

    Optional<Double> minValueDoubleNumbers =
        doubleNumbers.stream().min((d1, d2) -> d1.compareTo(d2));
    System.out.println("min value among 10: " + minValueDoubleNumbers.orElse(Double.NaN));
  }
}
