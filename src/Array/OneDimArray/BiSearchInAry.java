/*
 * Using Arrays.binarySearch, array must be sorted accendant first.
 * if array is not sorted, the result is undefined.
 * if you sort it first, then elements are comparable.
 */
package Array.OneDimArray;

import java.util.Arrays;

/**
 * Arrays.binarySearch(array, key)
 * index of the search key, if it is contained in the array; otherwise, (-(insertion point) - 1).
 *
 * @author YNZ
 */
public class BiSearchInAry {

    public static void main(String[] args) {

        int[] myAry = {12, 24, -1, 2, 23, 22};
        System.out.println("original array: " + Arrays.toString(myAry));

        Arrays.sort(myAry);
        System.out.println("sorting array first:" + Arrays.toString(myAry));

        int result = Arrays.binarySearch(myAry, 2);
        System.out.println("target index = " + result);

        //if not existed
        System.out.println("if not found? " + Arrays.binarySearch(myAry, 100));
        System.out.println("if not found? " + Arrays.binarySearch(myAry, 250));

    }
}
