/*
 * stream: pipeline elements in a collection.
 * map: applying a function on each of elemnts.
 * reduce:
 * filter:
contains : messuring content equality
 */
package Collection;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** @author YNZ */
public class UsingContains {

  public static void main(String[] args) {
    List<BigDecimal> list =
        Arrays.asList(BigDecimal.valueOf(10), BigDecimal.valueOf(20), BigDecimal.valueOf(30));

    List<BigDecimal> prices =
        Arrays.asList(
            new BigDecimal("10"),
            new BigDecimal("30"),
            new BigDecimal("17"),
            new BigDecimal("20"),
            new BigDecimal("15"),
            new BigDecimal("18"),
            new BigDecimal("45"),
            new BigDecimal("12"));

    List<BigDecimal> question = new ArrayList<>();
    question.add(new BigDecimal("20"));

    System.out.println("contains ? " + question.containsAll(prices));
    System.out.println("contains ? " + question.contains(new BigDecimal("20"))); // content equal

    boolean contains = list.contains(BigDecimal.valueOf(20));
    System.out.println("it contains big decimal 20 :  " + contains);

    BigDecimal sum =
        prices.stream()
            .filter(
                p -> {
                  return p.compareTo(BigDecimal.valueOf(20)) == 1;
                })
            .map(
                pb2 -> {
                  return pb2.multiply(BigDecimal.valueOf(0.9));
                })
            .reduce(BigDecimal.ZERO, BigDecimal::add);

    System.out.println("sum = " + sum);
  }
}
