package Collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * if given two lists, how to find out the difference between them?
 */

public class FindDifferenceLists {

    private static final List<String> listOne = Arrays.asList("Jack", "Tom", "Sam", "John", "James", "Jack");
    private static final List<String> listTwo = Arrays.asList("Jack", "Daniel", "Sam", "Alan", "James", "George");

    public static void main(String[] args) {

        System.out.println("listOne equalTo listTwo? " + listOne.equals(listTwo));

        List<String> diff = differenceTwoLists(listOne, listTwo);
        System.out.println("difference between two list: " + diff);
    }

    //find out difference between source and target
    private static <T> List<T> differenceTwoLists(List<T> source, List<T> target) {
        List<T> diff = new ArrayList<>();
        source.forEach(t -> {
                    if (!target.contains(t)) diff.add(t);
                }
        );
        return diff;
    }
}
