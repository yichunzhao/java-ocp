package Collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * converting List to array
 */
public class ListToArray {

    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> ints = new ArrayList<>();
        IntStream.range(0, 20).forEach(i -> ints.add(r.nextInt(100)));
        System.out.println(ints);

        //convert to Object[]
        Object[] converted = ints.toArray();

        //via List generic method; parameterised type array T[].
        Integer[] integerArray = new Integer[ints.size()];
        ints.toArray(integerArray);

        //via an accumulation type
        //<A> A[] toArray(IntFunction<A[]> var1);
        //the concrete type inferred from method return type
        printInts(ints.stream().toArray(Integer[]::new));
    }

    private static void printInts(Integer[] integers) {
        System.out.println("integer array to string" + Arrays.toString(integers));
    }
}
