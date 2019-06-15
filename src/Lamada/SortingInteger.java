/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamada;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

/** @author YNZ */
public class SortingInteger {

  public static void main(String[] args) {

    List<Integer> nums = Arrays.asList(1, 99, 1234, 34, 56, 89);
    System.out.println("before sorting: " + nums);
    nums.sort(Integer::compareTo);
    System.out.println("after sorting: " + nums);

    Comparable c =
        (o) -> {
          return 0;
        };

    Comparator<String> comparator = String::compareTo;

    List<String> strs = Arrays.asList("Kd", "Whatever", "Goodbye");
    strs.sort(comparator);
    System.out.println("sorted : " + strs);

    BiFunction<String, String, Boolean> bf =
        (o1, o2) -> {
          Boolean r = false;
          if (o1.equals(o2)) {
            r = true;
          }
          return r;
        };

    String testStr = "see you later on. ";
    testStr.compareToIgnoreCase(testStr);

    List<String> strings = Arrays.asList("Kd", "Whatever", "Goodbye");
    strings.sort(String::compareToIgnoreCase);
    System.out.println("after sorting:  " + strings);
  }
}
