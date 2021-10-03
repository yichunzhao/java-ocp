/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** @author YNZ */
public class StringToWords {

  public static void main(String[] args) {

    long current = System.currentTimeMillis();

    String str =
        "The wreckage of the turboprop plane, which was carrying 10 people, was swept toward a beach where rescuers treated surviving crewmen on the sand.";
    String[] words = text2words(str.toLowerCase());

    List<String> wordsList = new ArrayList(Arrays.asList(words));

    List<String> wordsSet = wordsList.parallelStream().distinct().collect(Collectors.toList());
    System.out.println("words set: " + wordsSet);

    Map<String, Long> wordNumber = new HashMap<>();

    for (String word : wordsSet) {
      wordNumber.put(word, countWordParallel(word, wordsList));
    }

    Map<String, Long> result =
        wordNumber.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(
                Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (oldValue, newValue) -> oldValue,
                    LinkedHashMap::new));

    System.out.println("map : " + result.toString());
    long end = System.currentTimeMillis();

    System.out.println("cost: " + (end - current));
  }

  private static String[] text2words(String text) {
    String pattern = "[!?'.,\\s\\n\\t]+";
    return text.split(pattern);
  }

  private static long countWord(String word, String[] words) {
    return Arrays.stream(words).filter(s -> s.equals(word)).count();
  }

  private static long countWordParallel(String word, String[] words) {
    return Arrays.asList(words).parallelStream().filter(w -> w.equals(word)).count();
  }

  private static long countWordParallel(String word, List<String> words) {
    return words.parallelStream().filter(w -> w.equals(word)).count();
  }
}
