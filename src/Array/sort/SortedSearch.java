package Array.sort;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Implement function countNumbers that accepts a sorted array of unique integers and, efficiently with respect to
 * time used, counts the number of array elements that are less than the parameter lessThan.
 *
 * For example, SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4) should return 2
 * because there are two array elements less than 4.
 */
public class SortedSearch {

    public static int countNumbers(int[] sortedArray, int lessThan) {
        //covert array to set
        NavigableSet<Integer> sortedSet = new TreeSet<>();

        for(int num : sortedArray){
            sortedSet.add(num);
        }

        return sortedSet.headSet(lessThan).size();
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }

}
