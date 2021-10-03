package Collection.queue.priority;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Opposed to a LinkedList or ArrayQueue, elements in a priority queue is sorted by its natural
 * ordering or by a custom comparator. The purpose of it is for 'priority-in, priority out'.
 *
 * <p>Sorting elements according to left element < right element. incremental from left to right
 * direction. Sorting according to an external comparator in a reversed direction; or soring
 * according to any fancy attribute.
 */
public class NaturalOrderPriorityQueue {
  private static final int[] nums = new int[20];
  private static final Random r = new Random();

  static {
    IntStream.range(0, nums.length).forEach(i -> nums[i] = r.nextInt(100));
  }

  public static void main(String[] args) {
    System.out.println("numbs: " + Arrays.toString(nums));

    Queue<Integer> priorityQ = new PriorityQueue<>(Comparator.reverseOrder());
    Queue<Integer> arrayQ = new ArrayDeque<>();

    IntStream.range(0, nums.length).forEach(i -> priorityQ.offer(nums[i]));
    IntStream.range(0, nums.length).forEach(i -> arrayQ.offer(nums[i]));

    System.out.println("In priority Q: " + priorityQ);
    System.out.println("In array Q: " + arrayQ);

    System.out.println("peek head of a priority Q: " + priorityQ.peek());
  }
}
