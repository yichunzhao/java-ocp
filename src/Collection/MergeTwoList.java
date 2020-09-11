
package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * How to merge two Lists.
 * <p>
 * The List used as a container should be mutable.
 * <p>
 * List addAll() method, which appending a Collection to the end of current Collection.
 * <p>
 * How to clear a List
 * <p>
 * List clear(): removing all of the elements from this list.
 * <p>
 * How to return an array of elements in this list.
 * List toArray() which return Object[]
 *
 * List toArray(T[] a) return a concrete type array
 *
 * @author YNZ
 */
public class MergeTwoList {

    public static void main(String[] args) {

        List<Integer> list1 = Stream.of(1, 2, 3).collect(Collectors.toList());
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        System.out.println("before merge: " + list1);

        list1.addAll(list2);
        System.out.println("after merge: " + list1);

        Object[] ints = list1.toArray();
        System.out.println("from array to String: " + Arrays.toString(ints));
        System.out.println("instance of Integer? " + (ints[0] instanceof Integer));

        Integer[] integers = new Integer[list1.size()];
        list1.toArray(integers);
        System.out.println("Specific Integer type array: " + Arrays.toString(integers));

    }
}
