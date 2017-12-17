/*
 * Using Deque to implement stack:   push pop
 * 
 * 
 */
package Collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author YNZ
 */
class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}

public class LinkedListStack {

    public static void main(String[] args) {

        Deque<Person> stack = new LinkedList<>();

        stack.push(new Person("alpha"));
        stack.push(new Person("yang"));
        stack.push(new Person("mom"));

        System.out.println("last first: " + stack.pop().toString());

    }

}
