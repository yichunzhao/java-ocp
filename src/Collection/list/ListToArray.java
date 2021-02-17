package Collection.list;

import java.util.Arrays;
import java.util.List;

/**
 * Converting a List to an array
 * *
 * <T> T[] List.toArray(T[] array)
 */
public class ListToArray {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 3, 5, 7, 9);

        //to Object[]
        Integer[] objectArray = (Integer[]) integerList.toArray();
        System.out.println("objectArray: " + Arrays.toString(objectArray));

        //generic method to instance type array
        Integer[] integerArray = integerList.toArray(new Integer[0]);
        System.out.println("integerArray: " + Arrays.toString(integerArray));

        //java 8, streaming to array
        Integer[] anotherArray = integerList.stream().toArray(Integer[]::new);
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));
    }

}
