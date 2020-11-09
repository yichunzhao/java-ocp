package Collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * List allows null value item; allows duplicated items;
 * query or remove the duplicated items; only the first occurrence is achieved or removed.
 */
public class ListAcceptNullOrDuplicated {

    public static void main(String[] args) {

        //can contain duplicated elements.
        //arrayList is not thread safe.
        //can hold null value
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(19);
        list.add(7);
        list.add(9);
        list.add(19);
        list.add(null);
        System.out.println(list);

        // list allow duplicated elements. the first occurrence will be obtained.
        System.out.println("duplicated key occurrence: " + list.indexOf(19));

        // insertion in the list; o(n)
        System.out.println("original list 0: " + list.get(0) + " size: " + list.size());
        list.add(0, 9999);
        System.out.println("after insertion at 0: " + list.get(0) + " size: " + list.size());

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(3);
        list1.add(5);
        list1.add(13);
        list1.add(15);
        list1.add(25);

        System.out.println("what have in list1: " + list1);
        list1.remove(5);
        // the first occurrence is removed from the left to right.
        System.out.println("what left in list1: " + list1);

    }

}
