package Map.TreeMap;

import models.Meeting;

import java.time.LocalDate;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * TreeMap implements Navigable interface. Internally, TreeMap implements a red-black tree, which is self-balanced.
 * Navigable extends Sorted.
 * <p>
 * TreeMap time complexities:
 * <p>
 * Get, Put, and delete: O(long(n))
 */
public class NavigableTreeMap {

    public static void main(String[] args) {
        NavigableMap<LocalDate, Meeting> myNavigableMap = new TreeMap<>();

        myNavigableMap.put(LocalDate.of(2019, 10, 13), new Meeting("meeting1", "location1"));
        myNavigableMap.put(LocalDate.of(2017, 12, 21), new Meeting("meeting2", "location2"));
        myNavigableMap.put(LocalDate.of(2015, 11, 15), new Meeting("meeting3", "location3"));
        myNavigableMap.put(LocalDate.of(2015, 11, 10), new Meeting("meeting4", "location4"));
        myNavigableMap.put(LocalDate.of(2014, 11, 10), new Meeting("meeting5", "location5"));
        myNavigableMap.put(LocalDate.of(2013, 11, 10), new Meeting("meeting6", "location6"));

        myNavigableMap.entrySet().forEach(e -> System.out.println("date: " + e.getKey() + " meeting: " + e.getValue()));
        System.out.println("............................");

        //Showing head map, excluding the criteria entry.
        SortedMap<LocalDate, Meeting> myHeadDateMeetingMap = myNavigableMap.headMap(LocalDate.of(2014, 11, 10));
        myHeadDateMeetingMap.entrySet().forEach(e -> System.out.println("date: " + e.getKey() + " meeting: " + e.getValue()));

        //showing tail map, including the criteria entry.
        System.out.println("............................");
        SortedMap<LocalDate, Meeting> myTailDateMeetingMap = myNavigableMap.tailMap(LocalDate.of(2014, 11, 10));
        myTailDateMeetingMap.entrySet().forEach(e -> System.out.println("date: " + e.getKey() + " meeting: " + e.getValue()));

        //ceiling key; returns a least key-value entry; its key value is greater than or equal to the ceiling key.
        Map.Entry<LocalDate, Meeting> ceilingEntries = myNavigableMap.ceilingEntry(LocalDate.of(2015, 01, 01));
        System.out.println(ceilingEntries);

        System.out.println("comparing the ceiling key and the least key: " + LocalDate.of(2015, 01, 01).compareTo(LocalDate.of(2015, 11, 10)));

    }
}
