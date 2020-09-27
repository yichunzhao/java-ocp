package CodeCharllenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * printing out all repeated numbers with frequency in an Array
 */
public class PrintAllRepeatedNumWithFreq {
    public static final int[] nums = {10, 20, 10, 40, 50, 20, 20};

    public static void main(String[] args) {
        Map<Integer, Integer> numberCountMap = new HashMap<>();

        Arrays.stream(nums).forEach(n -> {
            if (numberCountMap.containsKey(n)) {
                Integer count = numberCountMap.get(n);
                numberCountMap.put(n, count += 1);
            } else {
                numberCountMap.put(n, 1);
            }
        });


        System.out.println("entire map: " + numberCountMap);

        System.out.println("repeated number and its frequency: ");
        numberCountMap.entrySet().forEach(entry -> {
                    if (entry.getValue() > 1) System.out.print(entry.getKey() + "=" + entry.getValue() + ",");
                }
        );
        System.out.println();

    }
}
