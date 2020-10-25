package CodeCharllenge;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * how to print a 2D array in a spiral order.
 */
public class Print2DArrayInSpiralOrder {
    private static short[][] matrix = {{2, 4, 6, 8}, {5, 9, 12, 16}, {2, 11, 5, 9}, {3, 2, 1, 8}};

    public static void main(String[] args) {
        System.out.println("original 2D array: ");
        IntStream.range(0, matrix.length).forEach(i -> System.out.println(Arrays.toString(matrix[i])));

        

    }
}
