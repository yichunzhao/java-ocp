/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalProgramming.Lamada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** @author YNZ */
class Person {

  private String name;
  private Integer age;

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name + " " + this.age;
  }
}

public class SortByComparing {

  public static void main(String[] args) {

    List<Person> list = new ArrayList<>();
    list.add(new Person("Mike", 23));
    list.add(new Person("Tom", 32));
    list.add(new Person("Karry", 18));
    list.add(new Person("Mia", 32));
    list.add(new Person("Jerry", 16));
    System.out.println("before: " + list);
    // type of p1 and p2 can be inferred from list<Person> generic declaring.
    Collections.sort(list, (p1, p2) -> p1.getAge().compareTo(p2.getAge()));
    System.out.println("after: " + list);
    list.forEach(p -> System.out.println(p));
  }
}
