package Array.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Im curious is it possible to do parallel sorting?
 * <p>
 * Arrays.parallelSort() in line with Arrays.sort();
 * it breaks an array into sub-arrays; sorting those sub-arrays; merge arrays.
 * Time Complexity is O(nlogn)
 * <p>
 * it speeds up above 100% in this example as sorting 1 million integer numbers.
 * Parallel uses 43 ms
 * Normal uses 94 ms
 * <p>
 * parallel is good at handling a big data set;
 */
public class ParallelSorting {
    static long n = 10;
    static int size = 1_000_000;
    static int[] target = new int[size];
    static Random r = new Random();

    static {
        IntStream.range(0, size).forEach(i -> target[i] = r.nextInt(size));
    }

    static class TimeSummer {
        private long total;

        void plus(long period) {
            total += period;
        }

        long total() {
            return total;
        }
    }

    public static void main(String[] args) {

        TimeSummer timeSummer = new TimeSummer();

        for (int i = 0; i < n; i++) {
            long start = System.currentTimeMillis();
            int[] cloned = Arrays.copyOf(target, size);
            Arrays.parallelSort(cloned);
            long end = System.currentTimeMillis();
            timeSummer.plus(end - start);
        }

        System.out.println("average parallel sort time cost: " + (timeSummer.total / n) + " ms");

        TimeSummer timeSummer1 = new TimeSummer();

        for (int i = 0; i < n; i++) {
            long start = System.currentTimeMillis();
            int[] cloned = Arrays.copyOf(target, size);
            Arrays.sort(cloned);
            long end = System.currentTimeMillis();
            timeSummer1.plus(end - start);
        }

        System.out.println("average sort time cost: " + (timeSummer1.total / n) + " ms");
    }
}
