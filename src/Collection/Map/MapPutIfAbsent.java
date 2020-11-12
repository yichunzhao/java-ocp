package Collection.Map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * What the exact meaning of putIfAbsent
 * <p>
 * The java doc says that if the specified key is not already associated with a value(or is mapped to null) associates
 * it with the given value and returns null, else returns the current value;
 * <p>
 * Confused.
 * <p>
 * The putIfAbsent works with two conditions  1) if key-value is not existed;2) if key->null
 */
public class MapPutIfAbsent {
    static LocalDate key = LocalDate.of(2010, 10, 10);
    static LocalDate key1 = LocalDate.of(2011, 11, 11);
    static LocalDate key2 = LocalDate.of(2012, 12, 12);

    static Map<LocalDate, Integer> dateNumberMap = new HashMap<>();

    static {
        dateNumberMap.put(key, 100);
        dateNumberMap.put(key1, null);
    }

    public static void main(String[] args) {
        //if key is existed, and associated with a value; no action applied.
        Integer r = dateNumberMap.putIfAbsent(key, 200);
        System.out.printf("%s \n", dateNumberMap.toString());
        //it doesn't apply 'put', and return the current value.
        System.out.println("return: " + r);

        //if key is existed, and associated with a null value
        Integer r1 = dateNumberMap.putIfAbsent(key1, 300);
        //the key-value is updated
        System.out.printf("%s \n", dateNumberMap.toString());
        //the pre-value is returned
        System.out.println("return: " + r1);

        //if key is not existed, put the key-value
        dateNumberMap.putIfAbsent(key2, 800);
        System.out.printf("%s \n", dateNumberMap.toString());

    }
}
