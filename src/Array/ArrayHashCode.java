package Array;

import java.util.Arrays;

public class ArrayHashCode {

  public static void main(String[] args) {
    int[] a = new int[10];
    int[] b = new int[10];

    System.out.println("a == b ?" + (a == b));

    int originalCode = a.hashCode();
    Arrays.fill(a, 5);
    int afterCode = a.hashCode();
    System.out.println(" original == after? " + (originalCode == afterCode));

    // Arrays.hashCode return a int calculated according to the content
    System.out.println(" after == Arrays.hashCode? " + (originalCode == Arrays.hashCode(a)));
  }
}
