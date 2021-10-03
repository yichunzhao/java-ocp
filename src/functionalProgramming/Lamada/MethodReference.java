/*
 * Using method reference
 *
 *
 */
package functionalProgramming.Lamada;

import java.util.Arrays;
import java.util.List;

/** @author YNZ */
public class MethodReference {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 343, 4546, 453, 8728347);
    list.forEach(System.out::println);
  }
}
