/*
   Using a stack to reverse a string. 
 * push() to the head
 * 
 * add() to the tail. 
 */
package Collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author YNZ
 */
public class ImplementingStack {

    public static void main(String[] args) {
        
        String str = "I love Java.";
        
        //Deque implemented by a LinkedList. 
        Deque<Character> stack = new LinkedList<>();
        str.chars().mapToObj(i->(char)i).forEach(c->stack.push(c));
        
        
        stack.stream().forEach(System.out::print);
        System.out.println("");
        
    }

}
