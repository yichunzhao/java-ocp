/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/** @author YNZ */
public class StreamTransform {

  public static void main(String[] args) {

    Stream<String> nums = Stream.of("13", "2", "26", "9", "0").limit(3).distinct().sorted();

    List<String> strs =
        Stream.of("Introduction", "to", "Java", "Programming").sorted().collect(toList());
    System.out.println("" + strs);

    List<Character> firstChars = strs.stream().map(s -> s.charAt(0)).collect(toList());
    System.out.println("first chars : " + firstChars);

    List<Double> results =
        Stream.generate(Math::random)
            .peek(r -> System.out.println("Fetching " + r))
            .limit(10)
            .collect(toList());
    System.out.println("10 random num: " + results);

    Stream<Double> randoms = Stream.generate(Math::random).limit(100);
    List<Double> rs = randoms.map(x -> x * 100).collect(toList());
    System.out.println("rs : " + rs);

  }
}
