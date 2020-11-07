package Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * wrapper class has overwritten the hashcode function.
 */
class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + '}';
    }
}

public class HashMapHashCodeDemo {

    public static void main(String[] args) {
        //different objects have different hashcode
        Person p1 = new Person("dish");
        System.out.println("p1 hashcode : " + p1.hashCode());

        Person p2 = new Person("dish");
        System.out.println("p2 hashcode : " + p2.hashCode());

        Integer i1 = 120;
        System.out.println("i1 hashcode: " + i1.hashCode());

        Integer i2 = 120;
        System.out.println("i2 hashcode: " + i2.hashCode());
        System.out.println("i1 hashcode == i2 hashcode: " + (i2.hashCode() == i1.hashCode()));

        // guess size of map
        // Integer class overrides the hashcode method.
        Map<Integer, Person> dictionary = new HashMap<>();
        dictionary.put(i1, p1);
        dictionary.put(i2, p2);
        dictionary.put(121, new Person("washer"));
        dictionary.put(122, new Person("weather"));
        dictionary.put(123, new Person("forecast"));
        System.out.println("dictionary size: " + dictionary.size());

        // guess size of map
        // Person hashcode inherited from the Object. Different instance have different hashcode
        Map<Person, Integer> dictionary1 = new HashMap<>();
        dictionary1.put(p1, 120);
        dictionary1.put(p2, 120);
        dictionary1.put(new Person("washer"), 121);
        dictionary1.put(new Person("weather"), 122);
        dictionary1.put(new Person("forecast"), 123);
        System.out.println("dictionary1 size: " + dictionary1.size());
        System.out.println("dictionary1 content: " + dictionary1);

    }
}
