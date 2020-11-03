package CodeCharllenge;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * This problem was asked by Microsoft.
 * <p>
 * Given a 2D matrix of characters and a target word, write a function that returns whether the word can be found
 * in the matrix by going left-to-right, or up-to-down.
 * <p>
 * For example, given the following matrix:
 * <p>
 * [['F', 'A', 'C', 'I'],
 * ['O', 'B', 'Q', 'P'],
 * ['A', 'N', 'O', 'B'],
 * ['M', 'A', 'S', 'S']]
 * and the target word 'FOAM', you should return true, since it's the leftmost column. Similarly, given the target word
 * 'MASS', you should return true, since it's the last row.
 */
public class FindTargetWordInMatrix {
    private static char[][] given =
            {
                    {'F', 'A', 'C', 'I'},
                    {'O', 'B', 'Q', 'P'},
                    {'A', 'N', 'O', 'B'},
                    {'M', 'A', 'S', 'S'}
            };

    private static String target = "MASS";
    private static String target1 = "FOAM";

    public static void main(String[] args) {
        printMatrix(given);

        Set<String> words = countAllWords(given);
        System.out.println(words);

        System.out.println("Contain MASS? " + words.contains(target));
        System.out.println("Contain FOAM? " + words.contains(target1));
    }

    public static Set<String> countAllWords(char[][] matrix) {
        Set<String> words = new TreeSet<>();
        //from up to down;
        for (char[] chars : matrix) {
            words.add(String.valueOf(chars));
        }

        //from left to right;
        for (int col = 0; col < matrix[1].length; col++) {
            StringBuilder word = new StringBuilder();
            for (int row = 0; row < matrix.length; row++) {
                char c = matrix[row][col];
                word.append(c);
            }
            words.add(word.toString());
        }

        return words;
    }

    public static void printMatrix(char[][] matrix) {
        Arrays.stream(matrix).forEach(row -> System.out.println(Arrays.toString(row)));
    }
}
