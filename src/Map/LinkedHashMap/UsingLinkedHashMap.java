package Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHasMap keeps the insertion order.
 *
 * the 3rd argument: boolean ordering mode.
 * false: using insertion order
 * true: using access order instead: if one key has been accessed, then it will be put at the bottom.
 */
public class UsingLinkedHashMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>(4, 0.75f, false);
        map.put("what", 10);
        map.put("you", 20);
        map.put("are", 30);
        map.put("doing", 40);
        map.put("now", 50);
        System.out.println("linked map insertion order:  " + map);

        Map<String, Integer> anotherMap = new LinkedHashMap<>(4, 0.75f, true);
        anotherMap.put("what", 10);
        anotherMap.put("you", 20);
        anotherMap.put("are", 30);
        anotherMap.put("doing", 40);
        anotherMap.put("now", 50);

        System.out.println(anotherMap.get("what"));
        System.out.println("linked map access order:  " + anotherMap);

    }
}
