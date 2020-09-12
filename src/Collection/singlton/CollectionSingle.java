package Collection.singlton;

import java.util.Collections;
import java.util.Set;

/**
 * Collection.singleton return an immutable set which contains one element.
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
    }
}
