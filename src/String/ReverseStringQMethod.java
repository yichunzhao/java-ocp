package String;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class ReverseStringQMethod {

  public static void main(String[] args) {
    String str = "I love this game";
    System.out.println(str);

    Deque<Character> deque = new LinkedList();

    // Used as a stack
    str.chars().map(c -> (char) c).forEach(c -> deque.push((char) c));

    char[] reversed = new char[deque.size()];

    IntStream.range(0, reversed.length)
        .forEach(
            i -> {
              reversed[i] = deque.pop();
              System.out.print(reversed[i]);
            });
  }
}
