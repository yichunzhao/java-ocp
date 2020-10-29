/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamada;

import java.util.ArrayList;
import java.util.List;

/** @author YNZ */
public class LambdaRemove {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("aa");
    list.add("aab");
    list.add("aa");
    list.add("cc");
    list.add("ddd");
    System.out.println(list);

    list.removeIf((e) -> e.equals("aa"));
    System.out.println(list);
  }
}
