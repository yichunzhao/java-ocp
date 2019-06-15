/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamada;

import java.util.Random;

/** @author YNZ */
public class RunnableLambda {
  private static Random r = new Random();

  public static void main(String... args) {

    Thread t = new Thread(() -> System.out.println(r.nextInt(100)));
    t.start();
  }
}
