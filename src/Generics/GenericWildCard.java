package Generics;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * List<?> anyStuffs, wild card generic type means you can put any type in the collection.
 * Any type can be assigned to this List, but the List cannot be modified.
 * anyStuffs.add(new Integer(4));
 * this will generate an compiling error
 */
public class GenericWildCard {

    public static void main(String[] args) {
        List<?> stuffs = Arrays.asList(1, LocalDate.now());
        System.out.println("stuffs:" + stuffs);
        //once the List is assigned elements, it cannot be modified later on. Somehow, like having applied a final
        //keyword.
        //the following gives an compiling error.
        //stuffs.add(LocalDate.of(2020,10,1));
        input(stuffs);
    }

    public static void input(List<?> anyStuffs) {
        //the following statement will lead to a compiling error, capture of bla bla
        //anyStuffs.add(new Integer(4));

    }
}
