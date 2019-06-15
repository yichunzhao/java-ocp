/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamCollectingResult;

import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** @author YNZ */
public class CollectingToMap {

  public static void main(String[] args) {
    Stream<String> words = Pattern.compile("[\\s]").splitAsStream("Java persistence with jpa");
    Map<String, Integer> wordMap = words.collect(Collectors.toMap(w -> w, String::length));

    System.out.println("" + wordMap.get("Java"));
  }
}
