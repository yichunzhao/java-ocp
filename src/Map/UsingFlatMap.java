/*
 * FlatMap pipeline multiple dimensions into a single dimension. 
 * 
 * 
 */
package Map;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author YNZ
 */
public class UsingFlatMap {

    public static void main(String[] args) {
        String[][] data = {{"a", "b"}, {"c", "d"}, {"e", "f"}};
        System.out.println("" + data.length);

        //how to stream array
        System.out.println("Elements number? " + Arrays.stream(data).count());

        //it contains 3 elements.
        System.out.println("Elements number? " + Arrays.stream(data).flatMap(Arrays::stream).count());
        //now it contains 6 elments 

        //how about primitive types
        int[] intAry = {1, 4, 6, 89};
        Stream<int[]> streamArray = Stream.of(intAry);

        //
        IntStream intStream = streamArray.flatMapToInt(x -> Arrays.stream(x));
        System.out.println("" + intStream.count());

    }

}
