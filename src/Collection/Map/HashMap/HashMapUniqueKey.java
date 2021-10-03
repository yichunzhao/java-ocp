/*
 *
 * hashmap
 *
 */
package Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap doesn't allow duplicated key-value; because the same key generates the same hashcode, and
 * it is mapped to the same bucket.
 */
public class HashMapUniqueKey {

  public static void main(String[] args) {

    // duplicate keys overlap each other.
    // in a map, key is unique.
    Map<String, Integer> myMap = new HashMap<>();
    myMap.put("first", 12);
    myMap.put("first", 120);

    long count = myMap.keySet().stream().filter(x -> x.equals("first")).count();
    System.out.println("number the same key-value: " + count);

    // the same key-value will overlap each other.

    // if I query a key it is not exited, what will happen.
    // it will return a null.
    System.out.println(myMap.get("some"));
  }
}
