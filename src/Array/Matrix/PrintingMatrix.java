package Array.Matrix;

import java.util.Arrays;

public class PrintingMatrix {
    private final static Integer[][] matrix = {
            {1, 0, 0, 0, 0},
            {0, 0, 1, 1, 0},
            {0, 1, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {1, 1, 0, 0, 1},
            {1, 1, 0, 0, 1}
    };

    public static void main(String[] args) {
        Arrays.stream(matrix).forEach(intArray -> System.out.println(Arrays.asList(intArray)));
    }
}
