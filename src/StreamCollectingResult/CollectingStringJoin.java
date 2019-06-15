/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamCollectingResult;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

/** @author YNZ */
public class CollectingStringJoin {

  public static void main(String[] args) {

    String one =
        Pattern.compile("[\\s]").splitAsStream("I love you").collect(Collectors.joining(","));
    System.out.println("joined : " + one);
  }
}
