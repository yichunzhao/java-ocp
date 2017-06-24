/*
 * I want to know how parallel streaming improved the sorting speed. 
 * 
 * conclusion: 6 times faster as soring 1 million numbers. 
 */
package Lamada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author YNZ
 */
public class ComparingParallelSorting {

    private static final int S = 1_000_000;

    public static List<Integer> genNum() {
        List<Integer> nums = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < S; i++) {
            nums.add(r.nextInt(S));
        }
        return nums;
    }

    public static void main(String[] args) {

        Long start = System.currentTimeMillis();
        List nums = genNum();
        Collections.sort(nums);
        Long end = System.currentTimeMillis();
        System.out.println("time to sort: " + (end - start));
        
        Long start1 = System.currentTimeMillis();
        List nums1 = genNum();
        Stream<Integer> sorted = nums1.parallelStream().sorted();
        Long end1 = System.currentTimeMillis();
        List<Integer> nums2 = sorted.collect(Collectors.toList());
        
        System.out.println("time to sort: " + (end1 - start1));
        
        
        
        

    }

}
