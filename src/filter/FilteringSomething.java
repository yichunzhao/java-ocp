/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/** @author YNZ */
public class FilteringSomething {

  public static void main(String[] args) {
    List<Integer> numbers = Stream.of(2, 3, 7).collect(toList());
    numbers.stream().filter(x -> x >= 3).forEach(System.out::println);
  }
}
