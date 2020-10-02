package Generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * List<Object> object means only hold Object; it is different from List<?>, it holds any type.
 * <p>
 * List<Object> can be accessed and modified.
 */
public class GenericTypeObjectVsWildCard {

    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        objectList.add(Integer.valueOf(1));
        objectList.add(LocalDate.of(2020, 10, 1));

        List<?> objects = new ArrayList<>();

        input(objectList);

        //compiling error
        //inputWild(objects);
    }

    private static void input(List<?> any) {

    }

    private static void inputWild(List<Object> any) {

    }

}
