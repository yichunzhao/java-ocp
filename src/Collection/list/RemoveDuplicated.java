package Collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * how to remove duplicated elements in a list.
 *
 * an easy way to put a list into a set via its constructor.
 */
public class RemoveDuplicated {

    public static final List<String> listOne = Arrays.asList("Jack", "Tom", "Sam", "John", "James", "Jack");

    public static void main(String[] args) {
        //using java 8 streaming
        List<String> listWithoutDuplicates = listOne.stream().distinct().collect(Collectors.toList());
        System.out.println("listOne without duplicates using Stream: " + listWithoutDuplicates);

        //using Set, but re-ordered
        List<String> listWithoutDuplicates1 = new ArrayList<>(new HashSet<>(listOne));
        System.out.println("listOne without duplicates using Set: " + listWithoutDuplicates1);
    }

}
