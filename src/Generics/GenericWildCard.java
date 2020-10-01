package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * List<?> anyStuffs, wild card generic type means you can put any type in the collection.
 * Any type can be assigned to this List, but it cannot be modified.
 */
public class GenericWildCard {

    public static void main(String[] args) {
        List<?> stuffs = new ArrayList<>();
        input(stuffs);

    }

    public static void input(List<?> anyStuffs) {
        //the following statement will lead to a compiling error, capture of bla bla
        //anyStuffs.add(new Integer(4));

    }
}
