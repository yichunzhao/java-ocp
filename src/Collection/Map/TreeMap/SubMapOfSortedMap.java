package Collection.Map.TreeMap;

import java.time.LocalDate;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Is a SubMap of a SortedMap a backedMap?
 * <p>
 * Yes, it is.
 * <p>
 * When you modifying a subMap of a Map, the subMap and original Map both are modified.
 */
public class SubMapOfSortedMap {

    public static void main(String[] args) {
        SortedMap<LocalDate, Double> map = new TreeMap<>();
        map.put(LocalDate.of(2019, 12, 23), 15.09);
        map.put(LocalDate.of(2019, 7, 1), 35.69);
        map.put(LocalDate.of(2020, 8, 8), 55.99);
        map.put(LocalDate.of(2020, 6, 6), 32.00);
        map.put(LocalDate.of(2020, 10, 11), 32.33);

        System.out.println("sortedMap: " + map);

        SortedMap<LocalDate, Double> headMap = map.headMap(LocalDate.of(2020, 1, 1));
        System.out.println("headMap: " + headMap);

        System.out.println("modify the headMap");
        headMap.put(LocalDate.of(2018, 1, 1), 0.09);

        System.out.println("let's see the map: " + map);
    }
}
