package Collection;

import java.util.Collections;
import java.util.Set;

public class CollectionSingle {

    public static void main(String[] args) {
        Set<String> xx= Collections.singleton("one");
        System.out.println(xx instanceof Set);
    }
}
