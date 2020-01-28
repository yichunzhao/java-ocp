package Collection.Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {
  private final String name;

  public Person(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + '}';
  }
}

public class HashMapHashCodeDemo {

  public static void main(String[] args) {

    // guess size of map, 4
    // Integer class overrides the hashcode method.
    Map<Integer, Person> dictionary = new HashMap<>();
    dictionary.put(Integer.valueOf(120), new Person("dish"));
    dictionary.put(Integer.valueOf(120), new Person("dish"));
    dictionary.put(Integer.valueOf(121), new Person("washer"));
    dictionary.put(Integer.valueOf(122), new Person("weather"));
    dictionary.put(Integer.valueOf(123), new Person("forecast"));
    System.out.println(dictionary.size());

    // if didn't define a proper hashCode function, it may generate duplicate keys.
    // Guessing what the size of the map? =5
    Map<Person, Integer> personDicA = new HashMap<>();
    Person p1 = new Person("what");
    Person p2 = new Person("what");

    personDicA.put(p1, Integer.valueOf(100));
    personDicA.put(p2, Integer.valueOf(150));
    personDicA.put(new Person("are"), Integer.valueOf(200));
    personDicA.put(new Person("talking"), Integer.valueOf(21));
    personDicA.put(new Person("about"), Integer.valueOf(12));

    // map contains 5 elements
    System.out.println(personDicA.size());

    // HashMap doesn't keep insertion orders, due to its hashing nature.
    Map<Person, Integer> personDic = new HashMap<>();
    personDic.put(new Person("what"), Integer.valueOf(100));
    personDic.put(new Person("are"), Integer.valueOf(200));
    personDic.put(new Person("talking"), Integer.valueOf(21));
    personDic.put(new Person("about"), Integer.valueOf(12));

    System.out.println(personDic.keySet());

    //list allow duplicate elements
    List<Integer> myList = Stream.of(new Integer(10), new Integer(10)).collect(Collectors.toList());
    System.out.println(myList.size());
  }
}
