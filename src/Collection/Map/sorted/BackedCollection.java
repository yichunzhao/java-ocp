package Collection.Map.sorted;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * some of classes in java.util support the concept of "backed collections"
 * This demo shows this concept. The subMap and Map are correlated.
 * When we add key-value to either the original or the partial-copy subMap, the new entry show automatically to both.
 */
public class BackedCollection {

    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("a", "ant");
        map.put("d", "dog");
        map.put("h", "horse");

        //subMap: copying a portion of a Map.
        SortedMap<String, String> subMap = map.subMap("b", "g");
        System.out.println(map + " " + subMap);

        //add to original
        map.put("b", "bat");
        //add to subMap
        subMap.put("f", "fish");
        System.out.println(map + " " + subMap);

        //add one out of the range
        map.put("r", "raccoon");
        System.out.println(map + " " + subMap);

        //add one out of the range in the subMap
        //it won't be added for it is out of range of the subMap
        try {
            subMap.put("p", "pig");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        //key2 is exclusive
        SortedMap<String, String> subMap1 = map.subMap("d", "h");
        System.out.println(subMap1);

        //headMap(key, boolean) returns NavigableMap
        NavigableMap<String, String> headMap = map.headMap("b", true);
        System.out.println("headMap: " + headMap);

        //without boolean option, it is overloaded and return sortedMap; excluding the key
        SortedMap<String, String> sortedMap = map.headMap("b");
        System.out.println("sortedMap" + sortedMap);

    }
}
