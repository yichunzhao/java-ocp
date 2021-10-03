/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalProgramming.FunctionalInterface;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/** @author YNZ */
public class FilterPatternInJava8 {

  public static void main(String[] args) {
    List<User> users =
        Stream.of(
                new User("Yichun Zhao", 36),
                new User("Mike xxx", 32),
                new User("Ludovic Dewailly", 30),
                new User("Daoqi Yang", 56))
            .collect(toList());
    System.out.println("before filtering" + users);

    Criteria<User> criteriaByAge_32 =
        (us) -> {
          return us.stream().filter(u -> u.age() > 32).collect(toList());
        };

    Criteria<User> criteriaByAge_30 =
        (us) -> {
          return us.stream().filter(u -> u.age() > 30).collect(toList());
        };

    List<User> filtered = users;
    filtered = criteriaByAge_32.meetCriteria(filtered);
    filtered = criteriaByAge_30.meetCriteria(filtered);

    System.out.println("after filtering : " + filtered);
  }
}
