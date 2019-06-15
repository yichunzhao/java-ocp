/*
 * Using Arrays.binarySearch, array must be sorted accendant first.
 * if array is not sorted, the result is undefined.
 * if you sort it first, then elements are comparable.
 */
package OneDimArray;

import java.util.Arrays;

/** @author YNZ */
public class BiSearchInAry {

  public static void main(String[] args) {

    int[] myAry = {12, 24, -1, 2, 23, 22};

    Arrays.sort(myAry);
    System.out.println(Arrays.toString(myAry));
    int result = Arrays.binarySearch(myAry, 2);
    System.out.println("re = " + result);

    int[] intArray = {20, 14, 4, 10, 5, 3};
    Arrays.sort(intArray, 1, 5);
    System.out.println(Arrays.toString(intArray));

    String[] strArray = {"ocP", "oCP", "OcP", "OCp", "Ocp"};

    // "ocP", "oCP", "Ocp" "OcP", "OCp",
    Arrays.sort(strArray);
    System.out.println(Arrays.toString(strArray));
  }
}
