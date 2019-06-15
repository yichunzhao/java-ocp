/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Optional;

import java.util.Optional;

/** @author YNZ */
public class UsingOptional {

  public static void main(String[] args) {

    Optional<String> firstName = Optional.empty();

    firstName = Optional.of("Yichun");

    Optional.ofNullable(args);
    // consumer interface f(x) -> nothing
    firstName.ifPresent(x -> System.out.println("" + x));
    // supplier function, f()-> y
    //
    firstName.orElseThrow(IllegalStateException::new);
    firstName.orElseThrow(() -> new IllegalAccessError("ddddd"));
  }
}
