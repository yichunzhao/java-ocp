package Collection.Stack;

import java.util.LinkedList;

public class MyStack<E> implements Stack<E> {
  private LinkedList<E> myList = new LinkedList<>();

  @Override
  public void push(E e) {
    myList.push(e);
  }

  @Override
  public E pop() {
    return myList.pop();
  }

}
