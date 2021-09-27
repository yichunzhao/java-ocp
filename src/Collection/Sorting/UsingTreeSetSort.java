package Collection.Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * TreeSet sorting according to the default Natural ordering fx Numbers and String which implements
 * Comparable interface otherwise according to a customer comparator.
 *
 * @author YNZ
 */
class Person {

  private String name;

  public Person(String name) {
    this.name = name;
  }

  public static Person of(String name) {
    return new Person(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}

public class UsingTreeSetSort {

  public static void main(String[] args) {
    Arrays.stream(Pattern.compile("\\s").split("OCP Java Programmer Study Guide"))
        .collect(Collectors.toCollection(TreeSet::new))
        .forEach(s -> System.out.print(s + " "));

    System.out.println("\n");

    List<Person> persons =
        Stream.of(
                Person.of("mike"),
                Person.of("mason"),
                Person.of("avery"),
                Person.of("ella"),
                Person.of("harper"),
                Person.of("ella"))
            .collect(Collectors.toList());
    System.out.println("Person in ArrayList: " + persons);

    Set<Person> sortedPersons = new TreeSet<>(Comparator.comparing(Person::getName));
    persons.forEach(person -> sortedPersons.add(person));
    System.out.println("Person in TreeSet: " + sortedPersons);
  }
}
