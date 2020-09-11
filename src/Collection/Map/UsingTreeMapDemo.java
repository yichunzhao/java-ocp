package Collection.Map;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static java.util.stream.Collectors.toMap;


/**
 * tree map is un-ordered, but sorted. It is sorted by key instance that implements Comparable interface;
 * or by supplied Comparator.
 */
public class UsingTreeMapDemo {
    public static void main(String[] args) {

        //collecting a Stream into a tree map
        Map<String, Integer> myTreeMap = Arrays.asList("we", "are", "humans", "living", "on", "earth")
                .stream().collect(toMap(s -> s, s -> s.length(), (o1, o2) -> o1, TreeMap::new));
        System.out.println("my Tree map: " + myTreeMap);

        //injecting a map via tree map constructor
        Map<String, LocalDate> personTime = new HashMap<>();
        personTime.put("mike", LocalDate.of(1930, 12, 01));
        personTime.put("ella", LocalDate.of(1950, 10, 20));
        personTime.put("avery", LocalDate.of(1940, 9, 12));
        personTime.put("mason", LocalDate.of(1938, 2, 9));
        System.out.println("before : " + personTime);

        //converting a hash map into tree map via constructor; default comparator is null.
        //So, key instance must implement Comparable interface
        Map<String, LocalDate> personTime2 = new TreeMap<>(personTime);
        System.out.println("injecting into tree map: " + personTime2);


        //tree map with a specific comparator that is applied on the key set
        //guessing what is the output?
        Map<String, LocalDate> personTime3 = new TreeMap<>(Comparator.comparing(String::length).reversed());
        personTime3.putAll(personTime);

        System.out.println("injecting into tree map with Comparator: " + personTime3);
    }
}
