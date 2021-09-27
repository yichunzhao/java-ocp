package Collection.list;

import java.util.Arrays;
import java.util.List;

/**
 * Converting a List of Integer to an array, fx: Integer[] or int[]
 *
 * <p><T> T[] List.toArray(T[] array)
 */
public class ListToArray {

  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(1, 3, 5, 7, 9);

    // to Object[]
    Integer[] objectArray = (Integer[]) integerList.toArray();
    System.out.println("objectArray: " + Arrays.toString(objectArray));

    // generic method to instance type array
    Integer[] integerArray = integerList.toArray(new Integer[0]);
    System.out.println("integerArray: " + Arrays.toString(integerArray));

    // converting Integer list to Integer[]
    // java 8, streaming <A> A[] toArray(IntFunction<A[]> var1)
    Integer[] another = integerList.stream().toArray((Integer[]::new));
    System.out.println("anotherArray: " + Arrays.toString(another));

    // Arrays.asList(T... e) watch out here type param. T
    List<Integer> listsIntegers = Arrays.asList(another);
    System.out.println("integer list: " + listsIntegers);

    // map each Integer to int
    // Integer stream to int[];   ToIntFunction<? super T> var1
    int[] intNumbs = integerList.stream().mapToInt(x -> x).toArray();
    System.out.println("converting Integer list to int[] : " + Arrays.toString(intNumbs));
  }
}
