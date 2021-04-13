package Collection.Map;

import java.time.LocalTime;
import java.util.TreeMap;

/**
 * clone offers a shallow copying. clone is not an API of Map interface.
 * <p>
 * shallow copy means only the references are copied, but not creation of new instance.
 * <p>
 * in this example the time instances are shared between the origin and its clone.
 */
public class MapClone {
    static TreeMap<LocalTime, Integer> timeIntegerMap = new TreeMap<>();

    static {
        timeIntegerMap.put(LocalTime.of(10, 10), 20);
        timeIntegerMap.put(LocalTime.of(20, 10), 20);
    }

    public static void main(String[] args) {
        System.out.printf("origin: %s \n ", timeIntegerMap.toString());

        TreeMap<LocalTime, Integer> copy = (TreeMap<LocalTime, Integer>) timeIntegerMap.clone();
        System.out.printf("clone: %s \n ", copy.toString());
    }

}
