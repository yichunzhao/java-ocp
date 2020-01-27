/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.Map;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/** @author YNZ */
public class CollectionMatch {

  public static void main(String[] args) {
    Stream<Integer> numbers = Stream.of(1, 22, 33, 64);
    System.out.println("the rest: " + numbers.filter(n -> !n.equals(22)).collect(toList()));

    Stream<Integer> nums = Stream.of(1, 22, 33, 64);
    Boolean matchedAll = nums.allMatch(x -> x > 0);
    System.out.println("matched all : " + matchedAll);

    List<Integer> numList = Stream.of(1, 22, 33, 64).collect(toList());
    matchedAll = numList.stream().allMatch(x -> x < 0);
    System.out.println("matched all less than zero: " + matchedAll);

    if (numList.removeIf(x -> x == 22)) {
      System.out.println("" + numList);
    }
  }
}
