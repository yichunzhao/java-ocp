package Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class CharOccurrence {
  public static final String str = "microservice";

  public static void main(String[] args) {
    char[] chars = str.toCharArray();
    System.out.printf("occurrence map: %s \n ", charOccurrence(chars));
  }

  public static Map<Character, Integer> charOccurrence(char[] chars) {
    Map<Character, Integer> charCountMap = new HashMap<>();

    for (Character c : chars) {
      if (charCountMap.containsKey(c)) {
        charCountMap.computeIfPresent(c, (k, v) -> v += 1);
      } else {
        charCountMap.put(c, 1);
      }
    }

    return charCountMap;
  }
}
