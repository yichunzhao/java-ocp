/*
 * Using collection addAll method to merge two list
 * Arrays.asList return an immubtable list.
 *
 */
package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

/** @author YNZ */
public class MergeTwoList {

  public static void main(String[] args) {

    List<Integer> list1 = Arrays.asList(1, 2, 3);
    List<Integer> list2 = Arrays.asList(4, 5, 6);

    List<Integer> mergerd = new ArrayList<>(list1);
    mergerd.addAll(list2);
    System.out.println("Mergerd List1: " + mergerd);

    Set<String> set1 = Stream.of("a", "c", "e").collect(toSet());
    Set<String> set2 = Stream.of("f", "p", "g").collect(toSet());
    set1.addAll(set2);
    System.out.println("Mergered Set1: " + set1);
  }
}
