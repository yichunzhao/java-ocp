package Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/** Get a subMap from a Map */
public class GetSubMap {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Beijing");
    map.put(2, "Shanghai");
    map.put(3, "HongKong");
    map.put(4, "Pairs");
    map.put(5, "Berlin");
    System.out.println("full map" + map);

    System.out.println("get subMap......");
    Set<Integer> subKeyValues = Set.of(4, 5);
    Map<Integer, String> copyOfMap = new HashMap<>(map);

    copyOfMap.keySet().retainAll(subKeyValues);
    System.out.println("rest map" + copyOfMap);
  }
}
