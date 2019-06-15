/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/** @author YNZ */
public class StringSelectOptional {

  public static void main(String[] args) {
    String str = "Introduction to Java programming";
    List<String> words = Stream.of(str.split("[\\s]")).collect(toList());

    System.out.println("words size: " + words.size());
    Optional<String> found = words.stream().filter(x -> x.equals("Java")).findFirst();

    System.out.println(found.orElse("nothing found"));

    Optional<String> found_ = words.stream().filter(x -> x.equals("xx")).findFirst();
    System.out.println(found_.orElse("nothing found"));

    found.ifPresent(System.out::println);
  }
}
