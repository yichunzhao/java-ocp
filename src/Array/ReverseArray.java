package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * how to reverse an array of instances?
 */
public class ReverseArray {

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        System.out.println("original: " + Arrays.toString(integers));

        List<Integer> integerList = arrayToList(integers);
        Collections.reverse(integerList);
        Integer[] reversed = integerList.stream().toArray(Integer[]::new);

        System.out.println("reversed:" + Arrays.toString(reversed));
    }

    private static <T> List<T> arrayToList(T[] ts) {
        return Arrays.stream(ts).collect(toList());
    }

}
