package Concurrency.AsyncPrograming.forkjoin;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

/**
 * A ForkJoinPool takes use of the strategy of divide-and-conquer.
 * <p>
 * a big task is divide into small enough to handle and assemble results afterwards.
 * <p>
 * A ForkJoinPool only consume ForkJoinTask, which is an Abstract class. it has two sub-class, i.e. RecursiveTask
 * and RecursiveAction.
 * <p>
 * A ForkJoinPool extends ExecutorService interface, so it follows Executor design concept, consisting of a task
 * queue and a thread pool. Each worker thread within a ForkJoinPool has its own Deque to store the tasks; and it
 * allows free workers to steal the task from other busy workers.
 */
class CalculationTask extends RecursiveTask<Integer> {
    private static final int TASK_SIZE = 10;
    private int startPos;
    private int endPos;

    private int[] numbers;

    public CalculationTask(int[] numbers) {
        this(numbers, 0, numbers.length);
    }

    public CalculationTask(int[] numbers, int startPos, int endPos) {
        this.numbers = numbers;
        this.startPos = startPos;
        this.endPos = endPos;
    }

    @Override
    protected Integer compute() {
        int currentTaskSize = endPos - startPos;

        if (currentTaskSize <= TASK_SIZE) {
            return sum();
        } else {
            //divide into left and right part
            int mid = (endPos - startPos) / 2;

            int leftEnd = startPos + mid;

            //creating a new task for the left part
            CalculationTask leftTask = new CalculationTask(numbers, startPos, leftEnd);

            //assign the task to another thread, asynchronously.
            leftTask.fork();

            //creating a new task for the right part
            int rightStart = startPos + mid + 1;
            CalculationTask rightTask = new CalculationTask(numbers, rightStart, endPos);

            return rightTask.compute() + leftTask.join();
        }
    }

    private int sum() {
        int s = IntStream.of(numbers).sum();
        System.out.printf("startPos: %d endPos: %d part sum = %d \n ", startPos, endPos, s);
        return s;
    }

}

public class UsingForkJoinPool {

    private static int[] numbers = new int[100];

    public static void main(String[] args) {
        populateNumbers(numbers);
        System.out.println("numbers: " + Arrays.toString(numbers));

        //creating fork-join pool
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        CalculationTask calculationTask = new CalculationTask(numbers);
        Integer result = forkJoinPool.invoke(calculationTask);
        System.out.printf("final result: %d \n", result);
    }

    private static void populateNumbers(int[] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
    }

}
