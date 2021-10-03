package Collection.Map.TreeMap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/** Sorting map by an external comparator without key merging. */
public class SortingMapByComparator {
  private static String target = "If another class wants to create an instance of class Inner";

  public static void main(String[] args) {
    // splitting a string into words
    List<String> strings = Arrays.stream(target.split("\\s")).collect(toList());
    System.out.println(strings);

    // collecting strings into a map
    Map<String, Integer> map =
        strings.stream().collect(Collectors.toMap(s -> s, s -> s.length(), (o, n) -> n));
    System.out.println("string-length-map: " + map);

    // sorting by word length without overlapping
    Comparator<Map.Entry<String, Integer>> comparator = Comparator.comparing(Map.Entry::getValue);
    List<Map.Entry<String, Integer>> sortedMap =
        map.entrySet().stream().sorted(comparator.reversed()).collect(Collectors.toList());
    System.out.println("sorted string-length-map by length" + sortedMap);
  }
}
