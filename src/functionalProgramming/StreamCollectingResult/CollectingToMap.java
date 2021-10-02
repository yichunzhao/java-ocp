/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalProgramming.StreamCollectingResult;

import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/** @author YNZ */
public class CollectingToMap {

  public static void main(String[] args) {

    Map<String, Integer> wordMap =
        Pattern.compile("[\\s]")
            .splitAsStream("Java persistence with jpa")
            .collect(Collectors.toMap(w -> w, String::length, (o1, o2) -> o2));

    Map<String, Integer> wordMap1 =
        Pattern.compile("[\\s]")
            .splitAsStream("Java persistence with jpa")
            .collect(Collectors.toMap(w -> w, String::length, (o1, o2) -> o2, TreeMap::new));

    System.out.println("in a HashMap: " + wordMap);
    System.out.println("in a TreeMap: " + wordMap1);
  }
}
