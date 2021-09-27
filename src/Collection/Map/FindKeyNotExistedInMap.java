package Collection.Map;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * As finding a key-value that is not existed in a map, it returns a null; however, in some cases it
 * may cause NullPointException when assigning it to a primitive variable.
 *
 * <p>Being safe: using map method: computeIfPresent(key, (key, value)-> value);
 */
public class FindKeyNotExistedInMap {

  public static void main(String[] args) {

    Map<String, Integer> wordLengthMap =
        Arrays.stream("Java is a popular programing language".split("\\s"))
            .collect(Collectors.toMap(s -> s, String::length, (s1, s2) -> s2, TreeMap::new));

    System.out.printf("Creating a tree-map from a String %s \n", wordLengthMap);

    // As finding a key that is not existing, it may lead to an NullPointerException.
    // assigning a null to a primitive var, leading to a NullPointException
    try {
      int x = wordLengthMap.get("xxx");
    } catch (Exception e) {
      System.out.println(e);
    }

    System.out.printf(
        "compute k: xxx if it is present: %s \n",
        wordLengthMap.computeIfPresent("xxx", (k, v) -> v));
    System.out.printf(
        "compute k: Java if it is present: %s \n",
        wordLengthMap.computeIfPresent("Java", (k, v) -> v += 1));
  }
}
