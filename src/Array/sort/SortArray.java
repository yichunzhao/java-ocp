package Array.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * Sorting arrays
 *
 * <p>Using helper Arrays sort(byte[] a); sort(byte[], int fromIndex, int toIndex); sort(int[] a);
 * sort(int[] a, int fromIndex, int toIndex); sort(Object[] a); sort(Object[], fromIndex, int
 * toIndex); sort(T[] a, Comparator<? super T> c) sort(T[] a, Comparator<? super T> c, int
 * fromIndex, int toIndex);
 *
 * <p>Object array without implement Comparable interface will throw a Runtime exception.
 */
class Person {
  private String name;
  private String phone;

  public Person(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return Objects.equals(name, person.name) && Objects.equals(phone, person.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phone);
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", phone='" + phone + '\'' + '}';
  }
}

public class SortArray {

  public static void main(String[] args) {
    String[] strings = {"orange", "apple", "banana", "mango"};
    System.out.println("un-sorted: " + Arrays.toString(strings));

    Arrays.sort(strings);
    System.out.println("sorted: " + Arrays.toString(strings));

    Person[] persons = {
      new Person("mike", "12345678"),
      new Person("peter", "22223333"),
      new Person("Jack", "44556677")
    };
    System.out.println("un-sorted" + Arrays.toString(persons));

    try {
      Arrays.sort(persons);
    } catch (Exception e) {
      System.out.println(e);
    }

    Arrays.sort(persons, Comparator.comparing(Person::getName));
    System.out.println("sorted: " + Arrays.toString(persons));

    Arrays.sort(persons, Comparator.comparing(Person::getName).reversed());
    System.out.println("sorted reversed: " + Arrays.toString(persons));
  }
}
