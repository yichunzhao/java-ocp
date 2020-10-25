/*
 * FlatMap pipeline multiple dimensions into a single dimension.
 *
 *
 */
package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author YNZ
 */
public class UsingFlatMap {
    private final static Integer[][] matrix = {
            {1, 0, 0, 0, 0},
            {0, 0, 1, 1, 0},
            {0, 1, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {1, 1, 0, 0, 1},
            {1, 1, 0, 0, 1}
    };

    public static void main(String[] args) {
        String[][] data = {{"a", "b"}, {"c", "d"}, {"e", "f"}};
        System.out.println("" + data.length);

        System.out.println("count of data : " + Stream.of(data).count());

        System.out.println("count of flatmap" + Stream.of(data).flatMap(Stream::of).count());

        // it contains 3 elements.
        System.out.println("Elements number? " + Arrays.stream(data).flatMap(Arrays::stream).count());
        // now it contains 6 elements

        List<Integer> integerList = Stream.of(matrix).flatMap(integers -> Arrays.stream(integers)).collect(Collectors.toList());
        System.out.println("integer list: " + integerList);
    }
}
