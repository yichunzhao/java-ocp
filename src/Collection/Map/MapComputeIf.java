package Collection.Map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * If a key is present or absent, re-compute
 * map.computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
 * Type Parameters:
 * T - the type of the input to the function. input key
 * R - the type of the result of the function. return newValue
 * <p>
 * or computeIfPresent(K key,  BiFunction<? super K,? super V,? extends V> remappingFunction).
 * Type Parameters:
 * T - the type of the first argument to the function. input key
 * U - the type of the second argument to the function. input value
 * R - the type of the result of the function. return newValue
 */
public class MapComputeIf {
    static Map<LocalDate, Integer> dateIntegerMap = new HashMap<>();
    static LocalDate key = LocalDate.of(2019, 10, 10);

    public static void main(String[] args) {
        //if a key absent, re-compute the value, and set it to 1
        dateIntegerMap.computeIfAbsent(key,
                date -> 1);
        //key1->1
        System.out.println("absent key: " + dateIntegerMap);

        //if a key present, re-compute the value, value++
        dateIntegerMap.computeIfPresent(key, (date, val) -> ++val);

        //key1->2
        System.out.println("present key: " + dateIntegerMap);
    }

}
