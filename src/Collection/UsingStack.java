package Collection;

import java.util.Stack;

public class UsingStack {
  public static void main(String[] args) {
    // Java stack data structure,
    Stack<Integer> myStack = new Stack<>();
    // stack implements List<T> interface. it allows duplicated elements.
    myStack.push(Integer.valueOf(1)); // first in
    myStack.push(Integer.valueOf(1));
    myStack.push(Integer.valueOf(3)); // last in

    System.out.println(myStack.toString());
    Integer onTop = myStack.peek(); // make a copy of the element at the top.
    System.out.println(onTop);
    System.out.println(myStack); // nothing modified.

    while (!myStack.empty()) {
      System.out.println(myStack.pop());
    }

    System.out.println("stack is empty? " + myStack.isEmpty());
  }
}
