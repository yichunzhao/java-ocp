package CodeCharllenge;

import java.util.Map;
import java.util.TreeMap;

/**
 * 10 20 10 40 50 20 20
 * <p>
 * print all the repeated numbers with frequency in an Array
 * <p>
 * delete all the duplicate data from the list. So the final array will be with all distinct values
 * <p>
 * Final array: 10 20 40 50
 */
public class PrintRepeatedNumWithFreq {
    public static int[] ints = {10, 20, 10, 40, 50, 20, 20};

    public static void main(String[] args) {
        Map<Integer, Integer> numberFreqMap = new TreeMap<>();
        
        for (int i = 0; i < ints.length; i++) {
            if (numberFreqMap.keySet().contains(ints[i])) {
                int count = numberFreqMap.get(ints[i]);
                count++;
                numberFreqMap.put(ints[i], count);

            } else {
                numberFreqMap.put(ints[i], 1);
            }
        }

        System.out.println("number-freq: " + numberFreqMap);
        System.out.println("final array: " + numberFreqMap.keySet());

    }
}
