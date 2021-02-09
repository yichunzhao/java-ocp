package Collection.Map.TreeMap;

import java.time.LocalDate;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * what type set returned from map.keySet();
 * <p>
 * treeMap key is a NavigableSet and SortedSet, but not a TreeSet.
 */
public class TreeMapKeyValueIsSorted {

    public static void main(String[] args) {
        TreeMap<LocalDate, Double> treeMap = new TreeMap<>();
        treeMap.put(LocalDate.of(2020, 10, 11), 32.33);
        treeMap.put(LocalDate.of(2020, 8, 8), 55.99);
        treeMap.put(LocalDate.of(2020, 6, 6), 32.00);
        System.out.println("treeMap: ");
        System.out.println(treeMap);

        Set<LocalDate> keys = treeMap.keySet();
        System.out.println("is key set navigableSet? " + (keys instanceof NavigableSet));
        System.out.println("is key set sortedSet? " + (keys instanceof SortedSet));
        System.out.println("is key set treeSet? " + (keys instanceof TreeSet));
    }
}
