package CodeCharllenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Good morning! Here's your coding interview problem for today. This problem was asked by Facebook.
 * Given an N by N matrix, rotate it by 90 degrees clockwise. For example, given the following
 * matrix: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
 *
 * <p>you should return: [[7, 4, 1], [8, 5, 2], [9, 6, 3]]
 */
public class RotateMatrix {
  private static final int rowNum;
  private static final int colNum;

  static {
    rowNum = getMatrix().length;
    colNum = getMatrix()[0].length;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(getMatrix()));

    System.out.println(Arrays.deepToString(rotate(getMatrix())));
  }

  private static int[][] getMatrix() {
    return new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
  }

  private static int[][] rotate(int[][] matrix) {
    int[][] rotated = new int[rowNum][colNum];

    List<Integer> list = new ArrayList<>();

    for (int col = 0; col < matrix[0].length; col++) {
      for (int row = matrix.length - 1; row >= 0; row--) {
        list.add(matrix[row][col]);
      }
    }

    if (list.size() != (rowNum * colNum)) throw new IllegalStateException("not match");
    int index = 0;
    for (int i = 0; i < rowNum; i++) {
      for (int j = 0; j < colNum; j++) {
        rotated[i][j] = list.get(index);
        index++;
      }
    }

    return rotated;
  }
}
