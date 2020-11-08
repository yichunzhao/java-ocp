package Collection.list.search;

import java.util.Arrays;

/**
 * Object[] stores different type of instances; what is the search result?
 *
 * sorting or searching both up to impl of Comparable or Comparator, which compares A and B.
 *
 * the following code it throws
 * java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
 */
public class SearchDifferentObjectTypes {

    public static void main(String[] args) {
        //this list contains 3 different object types; they are all implementing Comparable interfaces
        Object[] myArray = {"Java", 10, 'z'};
        try {
            Arrays.sort(myArray);
            int position = Arrays.binarySearch(myArray, "Java");
            System.out.println(position);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
