/*
 * Collecting to a map with a merge function
 * Collectors.collect(keyMapper, valueMapper, binaryOperator)
 *
 */
package functionalProgramming.StreamCollectingResult;

import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** @author YNZ */
public class CollectingToMapWithMergingFun {

  public static void main(String[] args) {
    Map<String, String> languages =
        Stream.of(Locale.getAvailableLocales())
            .collect(
                Collectors.toMap(
                    Locale::getDisplayCountry, Locale::getDisplayLanguage, (x, y) -> y));
    System.out.println("" + languages);
  }
}
