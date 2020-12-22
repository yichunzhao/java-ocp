package coreUtil.Math;

import java.util.HashMap;
import java.util.Map;

/**
 * Java has one arithmetical operator, %, also known as the remainder or modulus
 * <p>
 * given int x and y, finding out times x over y and reminder x over y
 * <p>
 * if x<y remainder = x
 */
public class UsingModulus {

    public static void main(String[] args) {
        System.out.println(findTimesAndReminder(11, 7));
        System.out.println(findTimesAndReminder(1, 7));
        System.out.println(findTimesAndReminder(1120, 7));
        System.out.println(findTimesAndReminder(5, 3));
        System.out.println(findTimesAndReminder(7, 4));
        System.out.println(findTimesAndReminder(8, 3));
    }

    public static Map<String, Integer> findTimesAndReminder(Integer x, Integer y) {
        Map<String, Integer> result = new HashMap<>();
        result.put("reminder", x % y);
        result.put("times", x / y);
        return result;
    }
}
