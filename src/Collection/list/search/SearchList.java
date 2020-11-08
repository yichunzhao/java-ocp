package Collection.list.search;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * List and binary search:
 * <p>
 * public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key)
 * The list must be sorted into A-dir according to natural ordering, you may apply bi-search.
 *
 * <p>
 * public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c)
 * The list must be sorted into A-dir according to a specific comparator, then you may apply bi-search.
 */
public class SearchList {

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        //
        List<Person> persons = Stream.of(new Person("Mia", 12), new Person("Mike", 23),
                new Person("Tom", 2), new Person("Jerry", 5), new Person("Rose", 12)).collect(toList());
        System.out.println("unsorted: " + persons);

        //sorting it in A-dir
        Comparator<Person> comparator = Comparator.comparingInt(p -> p.age);
        Collections.sort(persons, comparator);
        System.out.println("sorted  : " + persons);

        //search by a key
        int r = Collections.binarySearch(persons, new Person("Mia", 12), comparator);
        System.out.println(r);
        System.out.println(persons.get(r));

    }
}
