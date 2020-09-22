/*
 * Comparable interface; compareTo method
 * return int
 * <0 a<b
 * =0 a=b
 * >0 a>b
 */
package OneDimArray;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Natural ordering
 *
 * @author YNZ
 */
class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " ";
    }
}

public class ArySorting {

    public static void main(String[] args) {

        Person p1 = new Person("Shara", 32);
        Person p2 = new Person("Harry", 40);
        Person p3 = new Person("Paul", 30);
        Person p4 = new Person("Mike", 18);

        Person[] persons = {p1, p2, p3, p4};

        //sorting persons by their natural ordering
        Arrays.sort(persons);
        System.out.println("" + Arrays.toString(persons));

        System.out.println("then sorting by name: ");
        Arrays.sort(persons, Comparator.comparing(person -> person.getName()));
        System.out.println("after sorting by name: " + Arrays.toString(persons));
    }
}
