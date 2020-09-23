package Math;

import java.util.HashMap;
import java.util.Map;

/**
 * given int x and y, finding out times x over y and reminder x over y
 */
public class UsingModulus {

    public static void main(String[] args) {
        System.out.println(findTimesAndReminder(5, 3));
        System.out.println(findTimesAndReminder(7, 4));
        System.out.println(findTimesAndReminder(8, 3));
        try {
            System.out.println(findTimesAndReminder(2, 3));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Map<String, Integer> findTimesAndReminder(Integer x, Integer y) {
        if (x < y) throw new IllegalArgumentException("x must greater than y");
        Map<String, Integer> result = new HashMap<>();
        result.put("reminder", x % y);
        result.put("times", x / y);
        return result;
    }
}
