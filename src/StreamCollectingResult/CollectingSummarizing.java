/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamCollectingResult;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/** @author YNZ */
public class CollectingSummarizing {

  public static void main(String[] args) {

    int totalLength =
        Pattern.compile("[\\s]")
            .splitAsStream("introduction to java programming")
            .mapToInt(String::length)
            .sum();
    System.out.println("total : " + totalLength);

    OptionalDouble averageLength =
        Pattern.compile("[\\s]")
            .splitAsStream("Nonlinear optimization")
            .mapToInt(String::length)
            .average();
    averageLength.ifPresent(System.out::println);

    IntSummaryStatistics summary =
        Pattern.compile("[\\s]")
            .splitAsStream("Sun certified programmer for java 6")
            .collect(Collectors.summarizingInt(String::length));
    System.out.println("max     : " + summary.getMax());
    System.out.println("min     : " + summary.getMin());
    System.out.println("average : " + summary.getAverage());
  }
}
