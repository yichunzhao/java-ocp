package Collection.list.search;

import java.util.Arrays;

/**
 * as the list is not sorted, the search output is undefined
 *
 * <p>it returns -4; normally if the bi-search cannot find a target, it returns -1.
 */
public class UndefinedResult {

  public static void main(String[] args) {
    Object[] myArray = new Object[3];
    myArray[0] = "Java";
    myArray[1] = "EJava";
    myArray[2] = "Guru";
    int position = Arrays.binarySearch(myArray, "Java");
    System.out.println(position);
  }
}
