package Generics.BoundedWildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * upper bounded wildcard <? extends type>
 *     you can read but cannot add
 */
public class UpperBoundedWildCard {

    public static void main(String[] args) {
        List<? extends Number> numbers = new ArrayList<>();
        //cannot add new element; it cause a compilation error
        //numbers.add(new Integer(2));

        List<? extends Number> numbers1 = new ArrayList<Integer>();
        //numbers1.add(new Integer(1));

        List<? extends Number> numbers2 = new ArrayList<Number>();

        method(numbers);
        method(numbers1);

        List<Integer> ints = new ArrayList<>(Arrays.asList(3, 6, 9));
        method(ints);
    }

    static void method(List<? extends Number> arg) {
        arg.forEach(System.out::println);
    }
}
