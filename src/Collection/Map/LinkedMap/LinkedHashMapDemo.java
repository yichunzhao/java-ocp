package Collection.Map.LinkedMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap extends HashMap, which implements Map
 *
 * <p>linkedHashMap maintains a double-linked list that runs through all its entries. Keeping the
 * insertion order; not sorted;
 */
public class LinkedHashMapDemo {

  public static void main(String[] args) {
    Map<String, Integer> linkedMap = new LinkedHashMap<>();
    linkedMap.put("methods", 1);
    linkedMap.put("to", 2);
    linkedMap.put("add", 3);
    linkedMap.put("retrieve", 4);
    linkedMap.put("remove", 5);

    linkedMap.values().forEach(System.out::print);
    System.out.println("");

    Map<String, Integer> map = new HashMap<>();
    map.putAll(linkedMap);
    map.values().forEach(System.out::print);
    System.out.println("");

    linkedMap.keySet().forEach(word -> System.out.print(word + " "));
    System.out.println("");
    map.keySet().forEach(word -> System.out.print(word + " "));
    System.out.println("");
  }
}
