/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array.OneDimArray;

/** @author YNZ */
class Student {

  public long id;
  public String name;

  public Student(long id, String name) {
    this.id = id;
    this.name = name;
  }
}

public class ClassArray {

  public static void main(String[] args) {
    Student[] students = new Student[1];
    students[0] = new Student(1L, "mike");
    System.out.println("" + students[0].name);

    int[] ints = new int[5];
    System.out.println("" + ints.length);
  }
}
