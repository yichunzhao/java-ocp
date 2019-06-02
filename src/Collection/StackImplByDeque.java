package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackImplByDeque {

    public static void main(String[] args) {
        //how impl. a stack in java
        Deque<Person> stack = new ArrayDeque<>();

        //Using Deque stack interfaces;
        stack.push(new Person("Tom"));
        stack.push(new Person("Jerry"));
        stack.push(new Person("Freeman"));

        //remove and return the first.
        Person p = stack.pop();
        System.out.println(p);
    }

    private static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            return this.name.equalsIgnoreCase(((Person) obj).name);
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

}
