package Collection.queue.priority;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Opposed to a LinkedList or ArrayQueue, elements in a priority queue opposed to Queue is sorted by its natural ordering
 * or by a custom comparator. The purpose of it is for 'priority-in, priority out'.
 */
public class NaturalOrderPriorityQueue {
    private static final int[] nums = new int[20];
    private static final Random r = new Random();

    static {
        IntStream.range(0, nums.length).forEach(i -> nums[i] = r.nextInt(100));
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nums));

        Queue<Integer> priorityQ = new PriorityQueue<>();
        Queue<Integer> arrayQ = new ArrayDeque<>();

        IntStream.range(0, nums.length).forEach(i -> priorityQ.offer(nums[i]));
        IntStream.range(0, nums.length).forEach(i -> arrayQ.offer(nums[i]));

        System.out.println(priorityQ);
        System.out.println(arrayQ);

    }

}
