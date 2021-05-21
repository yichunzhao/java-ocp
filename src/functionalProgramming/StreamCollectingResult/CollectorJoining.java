/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalProgramming.StreamCollectingResult;

import java.time.LocalDate;
import java.time.Month;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

/**
 * Collector.joining joining elements and return a string
 *
 * @author YNZ
 */
public class CollectorJoining {
    public static String[] strings = {"Introduction", "to", "Java", "Programming"};

    public static void main(String[] args) {

        //limiting the elements in a stream and find out different ones
        Stream<String> nums = Stream.of("13", "2", "26", "9", "0").limit(3).distinct().sorted();

        //join elements in a stream
        System.out.println(Stream.of(strings).sorted().collect(joining(" ", "+", "-")));

        Stream.of(
                LocalDate.of(2020, Month.AUGUST, 10).toString(),
                LocalDate.of(2020, Month.APRIL, 19).toString(),
                LocalDate.of(2020, Month.SEPTEMBER, 9).toString()
        ).collect(Collectors.joining(" +++ "));

    }
}
