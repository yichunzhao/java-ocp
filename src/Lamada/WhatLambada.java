/*
 *
 *  f(x,y) = x + 2y      (o1, o2)-> o1 + 2*o2
 *
 */
package Lamada;

/** @author YNZ */
public class WhatLambada {

  public static void main(String[] args) {

    Thread t =
        new Thread(
            () -> {
              for (int i = 0; i < 20; i++) {
                System.out.println("... " + i);
              }
            });

    t.start();
  }
}
