package Collection.Map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * map.replace(key, newValue);
 * map.replace(key, oldValue, newValue);
 */
public class MapReplace {
    static Map<LocalDate, Integer> dateIntegerMap = new HashMap<>();
    static LocalDate key = LocalDate.of(2020, 12, 10);
    static Integer value = 32;

    static {
        dateIntegerMap.put(key, value);
    }

    public static void main(String[] args) {
        System.out.println("origin: " + dateIntegerMap);
        //given a key, and replacing its value, returning its pre-value

        dateIntegerMap.replace(key, 33);
        System.out.println("updated: " + dateIntegerMap);

        Integer r = dateIntegerMap.replace(LocalDate.of(2000, 10, 10), 10);
        System.out.println("as key is not exist: " + r);
        System.out.println("updated: " + dateIntegerMap);
    }

}
