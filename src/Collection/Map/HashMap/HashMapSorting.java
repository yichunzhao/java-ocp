package Collection.Map.HashMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * HashMap is sorted by either key or value.
 * A simple way to sort HashMap is via a TreeMap.
 */
public class HashMapSorting {

    public static void main(String[] args) {
        // Create an empty hash map
        HashMap<String, Integer> map = new HashMap<>();

        // Add elements to the map
        map.put("mike", 10);
        map.put("jack", 30);
        map.put("frank", 20);
        map.put("smith", 28);

        //sorted by the value
        Map<String, Integer> sortedByValue = map.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o, n) -> n, LinkedHashMap::new));
        System.out.println("sorted by value: " + sortedByValue);

        //sorted by the key
        List<Map.Entry<String, Integer>> sortedByKeyList = map.entrySet()
                .stream()
                //.sorted((e1,e2)->e1.getKey().compareTo(e2.getKey()))
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .collect(Collectors.toList());
        System.out.println("sorted by key in a List: " + sortedByKeyList);

        //sorted by the key, but reversed
        Comparator<Map.Entry<String, Integer>> reverseComp = Comparator.comparing(Map.Entry::getKey);

        List<Map.Entry<String, Integer>> sortedByKeyReversedList = map.entrySet()
                .stream()
                .sorted(reverseComp.reversed())
                .collect(Collectors.toList());
        System.out.println("sorted by key reversed in a List: " + sortedByKeyReversedList);

        //sorting by key using treeMap in its natural ordering
        Map<String, Integer> sortedByTree = new TreeMap<>(map);
        System.out.println("sorted by key via Tree: " + sortedByTree);

        //sorting by key using treeMap in a reverse direction.
        Map<String, Integer> sortedByTreeReversed = new TreeMap<>(Comparator.reverseOrder());
        sortedByTreeReversed.putAll(map);
        System.out.println("sorted by key via Tree in a reversed direction: " + sortedByTreeReversed);
    }

}
