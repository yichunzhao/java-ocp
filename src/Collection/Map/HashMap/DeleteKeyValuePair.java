package Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

/** delete a key-value from a map, just by removing a key. */
public class DeleteKeyValuePair {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Beijing");
    map.put(2, "Shanghai");
    map.put(3, "HongKong");
    map.put(4, "Pairs");
    map.put(5, "Berlin");
    System.out.println("full map" + map);

    map.keySet().remove(1);
    System.out.println("after removal operation:" + map);

    map.keySet().removeIf(i -> i == 3);
    System.out.println("after removal operation: " + map);
  }
}
