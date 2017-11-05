/*
 * Comparable interface; compareTo method
 * return int  
 * <0 a<b
 * =0 a=b
 * <0 a>b
 */
package OneDimArray;

import java.util.Arrays;

/**
 *
 * @author YNZ
 */
class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " ";
    }

}

public class ArySorting {

    public static void main(String[] args) {

        Person p1 = new Person("Shreya", 32);
        Person p2 = new Person("Harry", 40);
        Person p3 = new Person("Paul", 30);

        Person[] persons = {p1, p2, p3};

        Arrays.sort(persons);

        System.out.println("" + Arrays.toString(persons));
       
    }

}
