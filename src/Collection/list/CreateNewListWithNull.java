package Collection.list;

import java.util.ArrayList;

/** it causes NPE */
public class CreateNewListWithNull {

  public static void main(String[] args) {
    new ArrayList<>(null);
  }
}
