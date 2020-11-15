package Array.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Natural ordering: ordered by the implemented Comparable interface.
 * Comparator provides external comparing.
 *
 * <p>
 * Comparable interface; compareTo method
 * return int
 * <0 a<b incremental
 * =0 a=b equal
 * >0 a>b decremental
 *
 * @author YNZ
 */

public class SortingByNaturalOrdering {

    private class Person implements Comparable<Person> {

        private final String name;
        private final int age;

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


    public static void main(String[] args) {

        Person p1 = new SortingByNaturalOrdering().new Person("Shara", 32);
        Person p2 = new SortingByNaturalOrdering().new Person("Harry", 40);
        Person p3 = new SortingByNaturalOrdering().new Person("Paul", 30);
        Person p4 = new SortingByNaturalOrdering().new Person("Mike", 18);

        Person[] persons = {p1, p2, p3, p4};

        //sorting persons by their natural ordering
        Arrays.sort(persons);
        System.out.println("" + Arrays.toString(persons));

        System.out.println("then sorting by name: ");

        //ordered by name
        Arrays.sort(persons, Comparator.comparing(Person::getName));
        System.out.println("after sorting by name: " + Arrays.toString(persons));

        Arrays.sort(persons, Comparator.comparing(Person::getName, Comparator.reverseOrder()));
        System.out.println("sorting by name and reversed: " + Arrays.toString(persons));

    }
}
