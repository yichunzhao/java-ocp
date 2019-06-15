/*
 * Stream: converts a collection into a pipe line.
 * Map: application lambada operation on each element in the pipe, and return a collection
 * how to operate each element of a collection?
 */
package Lamada;

import java.util.Arrays;
import java.util.List;

/** @author YNZ */
public class UsingMapDemo {

  public static void main(String... args) {
    final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

    for (String f : friends) {
      System.out.print(" " + f);
    }
    System.out.println("");

    friends.forEach(f -> System.out.print(" " + f));
    System.out.println("");

    friends.stream().map(f -> f.toUpperCase()).forEach(f -> System.out.print(" " + f));
    System.out.println("");

    friends.stream().filter(f -> f.startsWith("N")).forEach(System.out::print);
    System.out.println("");

    Long num = friends.stream().filter(f -> f.startsWith("N")).count();
    System.out.println("how many: " + num);
  }
}
