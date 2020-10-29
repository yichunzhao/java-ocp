package Generics.Boundary;

import java.util.ArrayList;
import java.util.List;

/**
 * Lower bounded
 * T super Gift (class, interface or enum)
 * <p>
 * including boundary type.
 * <p>
 * T extend Gift
 * excluding boundary type.
 */

class Gift {
}

class Book extends Gift {
}

class Watch extends Gift {
}

class Phone extends Gift {
}

public class LowerBoundedGenerics {
    public static void main(String[] args) {
        //a list accept super type of Gift; then why it doesn't accept Object instance.
        List<? super Gift> gifts = new ArrayList<>();
        gifts.add(new Gift());
        gifts.add(new Book());
        gifts.add(new Watch());
        gifts.add(new Phone());
//        gifts.add(new Object());

        List<? extends Gift> gifts1 = new ArrayList<Gift>();

        //gifts1.add(new Book()); //a compilation error

        wrapGift(gifts);
    }

    static void wrapGift(List<?> gifts) {
        gifts.forEach(System.out::println);
        //A collection of wildcard, cannot add any instance in the method; this is a protection.
        //gifts.add(new Gift());

    }
}
