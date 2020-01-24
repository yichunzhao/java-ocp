package Collection.Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

class Person {
  private String firstName;
  private String lastName;

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(firstName);
    sb.append(" ");
    sb.append(lastName);

    return sb.toString();
  }
}

public class HashSetDifferenceFromTreeSetDemo {

  public static void main(String[] args) {
    Person p1 = new Person("Mike", "Jones");
    Person p2 = new Person("Daniel", "Smith");
    Person p3 = new Person("Joseph", "Brown");
    Person p4 = new Person("Carter", "Miller");

    // HashSet is not sorted, meanwhile it doesn't keep the insertion order
    HashSet<Person> myHashSet = new HashSet<>();
    myHashSet.add(p1);
    myHashSet.add(p2);
    myHashSet.add(p3);
    myHashSet.add(p4);

    System.out.println(myHashSet);

    // TreeSet doesn't keep the insertion order, but it is sorted.
    TreeSet<Person> myTreeSet = new TreeSet<>(Comparator.comparing(Person::toString));
    myTreeSet.add(p1);
    myTreeSet.add(p2);
    myTreeSet.add(p3);
    myTreeSet.add(p4);
    System.out.println(myTreeSet);
  }
}
