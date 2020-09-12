package Collection.singlton;

import java.time.Period;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Collection.singleton return an immutable Set, which contains one element.
 * Collection.singletonList return an immutable List, which contains one element.
 */
public class CollectionSingle {

    public static void main(String[] args) {
        Set<String> xx = Collections.singleton("one");
        System.out.println(xx instanceof Set);

        try {
            xx.add("two");
        } catch (UnsupportedOperationException e) {
            System.out.println(e.toString());
        }

        List<Period> yy = Collections.singletonList(Period.of(2012, 3, 18));
        System.out.println("yy is a List? " + (yy instanceof List));

        try {
            yy.add(Period.ofMonths(2));
        } catch (UnsupportedOperationException e) {
            System.out.println(e.toString());
        }
    }
}
