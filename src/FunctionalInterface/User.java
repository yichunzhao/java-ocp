/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionalInterface;

/** @author YNZ */
public class User {

  private String name;
  private int age;

  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String name() {
    return name;
  }

  public int age() {
    return this.age;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
