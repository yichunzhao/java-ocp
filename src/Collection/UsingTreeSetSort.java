/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** @author YNZ */
public class UsingTreeSetSort {

  public static void main(String[] args) {
    Set<String> set =
        Stream.of("Apple", "Cake", "Ball").collect(Collectors.toCollection(TreeSet::new));

    System.out.println("" + set);
  }
}
