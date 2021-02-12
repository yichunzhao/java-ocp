package Generics.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * wildcard type ? means could be any type of data. However, the compiler setup a protection here; you cannot
 * aad an element inside the list instance, because it is not sure what you will put inside it.
 * <p>
 * if you try to modify a List<?>, you will get an error: "capture of ?"
 *
 * <p>
 * Then why designing this mechanism, I think it is only for transferring different
 * parameterised types into a method argument, meanwhile inside the method it cannot be modified.
 */
public class WildCardGenericType {

    public static void main(String[] args) {
        /**
         * you cannot modify the list content.
         */
        List<?> numbers = new ArrayList<>();
        /**
         * you cannot modify the list<?> content.
         */
        //numbers.add(Integer.valueOf(2));

        List<?> number1 = new ArrayList<Integer>();
        /**
         * you cannot modify the list<?> content.
         */
        //number1.add(Integer.valueOf(1));

        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        receiveDiverseItems(ints);

        List<String> strings = Arrays.asList("what", "the purpose", "of this design");
        receiveDiverseItems(strings);
    }

    public static List<?> receiveDiverseItems(List<?> items) {
        System.out.println(items);
        /**
         * List<?> cannot be modified inside the method, because the compiler don't exactly know what type inside
         * this collection.
         */
        //items.add(Integer.valueOf(230));

        return items;
    }
}
