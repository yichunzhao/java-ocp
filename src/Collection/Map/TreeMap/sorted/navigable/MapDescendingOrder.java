package Collection.Map.TreeMap.sorted.navigable;

import java.util.Arrays;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

/** tree implements NavigableMap interface, which offer descendingOrder api. */
public class MapDescendingOrder {

  public static void main(String[] args) {

    // Map<String, Integer> stringLengthMap =
    NavigableMap<String, Integer> stringLengthMap =
        Arrays.stream("we like java programming".split("\\s"))
            .collect(Collectors.toMap(s -> s, s -> s.length(), (s1, s2) -> s2, TreeMap::new));
    System.out.println("original order:" + stringLengthMap);
    System.out.println("descending order:" + stringLengthMap.descendingMap());
  }
}
