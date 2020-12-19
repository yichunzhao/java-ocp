/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/** @author YNZ */
class Student {
  private String name;
  private int percentage;

  public Student(String name, int percentage) {
    this.name = name;
    this.percentage = percentage;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPercentage() {
    return percentage;
  }

  public void setPercentage(int percentage) {
    this.percentage = percentage;
  }
}

public class MapStringToInteger {

  public static void main(String[] args) {
    List<String> numberOfString = Arrays.asList("1", "5", "8", "9");
    List<Integer> intergers = numberOfString.stream().map(Integer::parseInt).collect(toList());
    System.out.println("" + intergers);

    List<String> knownPerson =
        Arrays.asList("Joe", "Trump", "Obama", "Bush", "Clinton", "Bernie", "Kelly");
    List<String> lowerCaseKnownPerson =
        knownPerson.stream().map(String::toLowerCase).collect(toList());
    System.out.println("" + lowerCaseKnownPerson);

    List<Student> students =
        Arrays.asList(
            new Student("Andre", 76), new Student("Christian", 81), new Student("Haden", 65));
    List<String> names =
        students.stream()
            .filter(x -> x.getPercentage() > 75)
            .map(x -> x.getName())
            .collect(toList());
    System.out.println("> 75 " + names);
  }
}
