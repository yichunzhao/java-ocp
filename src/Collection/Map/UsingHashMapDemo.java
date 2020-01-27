package Collection.Map;

import java.util.HashMap;
import java.util.Map;

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

public class UsingHashMapDemo {

  public static void main(String[] args) {

    Map<Integer, Person> dictionary = new HashMap<>();
    dictionary.put(Integer.valueOf(120), new Person("dish"));
    dictionary.put(Integer.valueOf(121), new Person("washer"));
    dictionary.put(Integer.valueOf(122), new Person("weather"));
    dictionary.put(Integer.valueOf(123), new Person("forecast"));

    System.out.println(dictionary.keySet());
    System.out.println(dictionary.values());

    //HashMap doesn't keep insertion orders, due to its hashing nature.

    Map<Person, Integer> personDic = new HashMap<>();
    personDic.put(new Person("what"), Integer.valueOf(100));
    personDic.put(new Person("are"), Integer.valueOf(200));
    personDic.put(new Person("talking"), Integer.valueOf(21));
    personDic.put(new Person("about"), Integer.valueOf(12));

    System.out.println(personDic.keySet());

    //if didn't define a proper hashCode function, it may generate duplicate keys.
    Map<Person, Integer> personDicA = new HashMap<>();
    personDicA.put(new Person("what"), Integer.valueOf(100));
    personDicA.put(new Person("what"), Integer.valueOf(150));
    personDicA.put(new Person("are"), Integer.valueOf(200));
    personDicA.put(new Person("talking"), Integer.valueOf(21));
    personDicA.put(new Person("about"), Integer.valueOf(12));

    System.out.println(personDicA.keySet());

  }
}
