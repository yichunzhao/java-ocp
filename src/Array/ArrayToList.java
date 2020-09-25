package Array;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Array.asList(T... t) ; when using asList(), the array and the list become joined at the hip.
 * When you updating one of them, another one is updated too.
 */
public class ArrayToList {

    public static void main(String[] args) {
        BigDecimal[] a = {BigDecimal.ONE, BigDecimal.TEN, BigDecimal.valueOf(9L)};
        System.out.println("a :" + Arrays.toString(a));
        List<BigDecimal> b = Arrays.asList(a);
        System.out.println("a to List: " + b);

        //After changing one element of the array, List will change too
        a[1] = BigDecimal.valueOf(8);
        System.out.println("List after updating array element:" + b);

        //After changing one element of Array,
        b.set(1, BigDecimal.valueOf(3));
        System.out.println("Array after updating List element:" + Arrays.toString(a));

    }
}
