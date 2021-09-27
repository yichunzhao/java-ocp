package Collection.Map.LinkedMap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap distinguishes accessOrder – the ordering mode - true for access-order, false for
 * insertion-order
 *
 * <p>in the access-order mode: the accessed k-v, will be re-arranged at the bottom of the Map. In
 * the insertion-order mode: no matter which k-v is accessed, the order is always constant.
 */
public class UsingLinkedHashMap {

  public static void main(String[] args) {
    Map<String, Integer> map = new LinkedHashMap<>(4, 0.75f, false);
    map.put("what", 10);
    map.put("you", 20);
    map.put("are", 30);
    map.put("doing", 40);
    map.put("now", 50);
    map.forEach((k, v) -> System.out.printf(" %s -> %d \n", k, v));

    Map<String, Integer> anotherMap = new LinkedHashMap<>(4, 0.75f, true);
    anotherMap.put("what", 10);
    anotherMap.put("you", 20);
    anotherMap.put("are", 30);
    anotherMap.put("doing", 40);
    anotherMap.put("now", 50);
    anotherMap.forEach((k, v) -> System.out.printf(" %s -> %d \n", k, v));

    System.out.printf("accessing the  key 'what' %d \n", anotherMap.get("what"));
    System.out.printf("accessing the  key 'you' %d \n", anotherMap.get("you"));

    System.out.println("the order of k-v is modified: ");
    anotherMap.forEach((k, v) -> System.out.printf(" %s -> %d \n", k, v));
  }
}
