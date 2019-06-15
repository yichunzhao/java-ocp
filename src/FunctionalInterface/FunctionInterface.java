/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionalInterface;

import java.util.HashMap;
import java.util.Map;

/** @author YNZ */
public class FunctionInterface {

  public static void main(String[] args) {
    Map<String, Integer> nameMap = new HashMap<>();
    Integer result = nameMap.computeIfAbsent("John", s -> s.length());
    System.out.println("result : " + result);
    nameMap.putIfAbsent("Yichun", 100);
    System.out.println("name map: " + nameMap);
  }
}
