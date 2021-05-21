/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalProgramming.Lamada;

/** @author YNZ */
public class MapToObjectDemo {

  public static void main(String[] args) {
    String str = "hello";

    for (char c : str.toCharArray()) {
      System.out.println("" + c);
    }

    System.out.println("");

    for (int i = 0; i < str.length(); i++) {
      System.out.println("" + str.charAt(i));
    }
    System.out.println("");

    str.chars().forEach(System.out::println);
    System.out.println("");

    str.chars().forEach(System.out::println);
    System.out.println("");

    str.chars().forEach(c -> System.out.println((char) c));
    System.out.println("");

    str.chars().mapToObj(c -> Character.valueOf((char) c)).forEach(System.out::println);
    System.out.println("");
  }
}
