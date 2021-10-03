/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalProgramming.Lamada;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/** @author YNZ */
public class Sorting {

  public static void main(String[] args) {
    List<Character> chars = Arrays.asList('a', 'W', 'x', 'B', 'C', 'k');
    Collections.sort(chars, Character::compareTo);
    System.out.println("sorted : " + chars);
  }
}
