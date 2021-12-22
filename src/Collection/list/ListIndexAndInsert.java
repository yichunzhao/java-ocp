package Collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListIndexAndInsert {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("we");
    list.add("are");
    list.add("football");
    list.add("players");
    System.out.printf("Original list : %s \n", list);

    // insert
    list.add(list.indexOf("we"), "They");
    System.out.printf("After insertion : %s \n", list);

    // replace
    list.set(list.indexOf("we"), "they");
    System.out.printf("After replace : %s \n", list);
  }
}
