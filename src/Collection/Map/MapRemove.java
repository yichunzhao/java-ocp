package Collection.Map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * map.remove(object key, object value): removing a specific key-value pair
 * map.remove(object key): removing a key, and its associated value.
 */
public class MapRemove {
    static Map<LocalDate, Integer> dateNumMap = new HashMap<>();
    static LocalDate date = (LocalDate.of(2020, 10, 12));
    static Integer value = 23;

    static {
        dateNumMap.put(date, value);
    }

    public static void main(String[] args) {
        System.out.println("origin : " + dateNumMap);
        //removing a data-value pair.
        dateNumMap.remove(date, 12);
        System.out.println("remove a k-v pair : " + dateNumMap);

        //removing a key
        dateNumMap.remove(date);
        System.out.println("remove a k :" + dateNumMap);
    }
}
