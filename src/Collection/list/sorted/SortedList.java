package Collection.list.sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

/**
 * Sorting a List with a help class Collections
 * <p>
 * Sorting by their natural order
 * Sorting by an external Comparator
 * Reverse()
 */

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SortedList {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(200);
        integerList.add(87);
        integerList.add(999);
        System.out.println("original : " + integerList);

        Collections.sort(integerList);
        System.out.println("sorted   : " + integerList);

        //add a new element
        integerList.add(1);
        System.out.println("not sorted: " + integerList);

        //reverse
        Collections.reverse(integerList);
        System.out.println("reversed: " + integerList);

        //sorting by Comparator
        List<Person> people = Arrays.asList(new Person("Mia", 32), new Person("Paul", 20),
                new Person("Harry", 16));
        System.out.println("original: " + people);
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        });

        Collections.shuffle(people);
        System.out.println("after shuffle:  " + people);
        System.out.println("sorted : " + people.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(toList()));
    }
}
