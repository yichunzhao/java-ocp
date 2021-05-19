package others.MemoryLeak;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TooManyStaticVariable {

  private static List<Person> list = new ArrayList<>();

  private static void populateValuesInList() {
    IntStream.rangeClosed(0, 1000).forEach(i -> list.add(new Person("Tomy")));
  }

  public static void main(String[] args) {
    TooManyStaticVariable.populateValuesInList();
    System.out.println("size: " + list.size());
  }

  private static class Person {
    private String name;

    public Person(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
}
