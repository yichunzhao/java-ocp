package Collection.Map;

import java.util.*;

public class UsingTreeMapDemo {
  public static void main(String[] args) {
    //
    Map<String, Integer> myMap = new HashMap<>();
    myMap.put("my", null);
    myMap.put("his", Integer.valueOf(100));

    myMap.putIfAbsent("my", Integer.valueOf(30));
    System.out.println(myMap);

    //
    Map<String, Integer> myTreeMap = new TreeMap<>();
    myTreeMap.put("we", Integer.valueOf(100));
    myTreeMap.put("are", Integer.valueOf(200));
    myTreeMap.put("humans", Integer.valueOf(540));
    myTreeMap.put("TreeMap", Integer.valueOf(340));

    System.out.println(myTreeMap.keySet());

    Collection<Integer> values = myTreeMap.values();
    System.out.println(values);
    System.out.println(myTreeMap.containsKey("we"));

    //
  }
}
