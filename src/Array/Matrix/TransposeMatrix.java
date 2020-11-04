package Array.Matrix;

import java.util.Arrays;

/**
 * matrix transpose is a flip of element indices
 */
public class TransposeMatrix {
    private static int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
    };

    public static void main(String[] args) {
        Arrays.stream(a).forEach(row -> System.out.println(Arrays.toString(row)));

        System.out.println("transpose it: ");
        int[][] t = transpose(a);

        Arrays.stream(t).forEach(row -> System.out.println(Arrays.toString(row)));
    }

    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] transposed = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }
        return transposed;
    }

}
