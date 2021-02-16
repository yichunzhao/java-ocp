package Collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Collections.copy(List<T> dest,List<T> source)
 * dest.size >= source.size; otherwise throw IndexOutOfBoundException
 * <p>
 * if the dest.size is bigger than source.size, a partial dest will be overwritten by the source.
 * <p>
 * it is a shallow copy too. so maybe it is a good way to make element class immutable.
 */
public class CollectionsCopy {

    public static void main(String[] args) {

        List<Integer> copyList = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("copyList before:");
        System.out.println(copyList);

        List<Integer> origin = Arrays.asList(230, 345, 556);

        System.out.println("after copy:");
        Collections.copy(copyList, origin);
        System.out.println(copyList);

        //Integer's hashcode is overwritten; so the same number has the same hashcode, even different instances.
        System.out.println("copy containsAll of origin? ");
        System.out.println(copyList.containsAll(origin));
    }

}
