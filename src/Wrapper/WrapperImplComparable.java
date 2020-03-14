package Wrapper;

import java.util.Map;
import java.util.TreeMap;

/** all wrapper classes implement comparable interface. */
public class WrapperImplComparable {

  public static void main(String[] args) {

    Map<Integer, String> myTree = new TreeMap<>();
    myTree.put(new Integer(10), "ten");
    myTree.put(new Integer(6), "six");
    myTree.put(new Integer(8), "eight");
    myTree.put(new Integer(1), "one");

    System.out.println(myTree);
  }
}
