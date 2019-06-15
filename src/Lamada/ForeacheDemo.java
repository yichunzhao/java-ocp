/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamada;

import java.util.Arrays;

/** @author YNZ */
public class ForeacheDemo {

  public static void main(String... args) {

    Arrays.asList(24, 45, 23, 1).stream().sorted().forEach(e -> System.out.println("" + e));
    Arrays.asList(12, 7346, 88, 999).stream()
        .filter((e) -> e > 1000)
        .forEach(e -> System.out.println("" + e));
  }
}
