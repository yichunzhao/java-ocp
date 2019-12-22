package Collection.DataStructureCodeChallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Item {
  private String name;

  public Item(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Item{" + "name='" + name + '\'' + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Item item = (Item) o;
    return Objects.equals(name, item.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}

public class CodeChallenge {

  public static void main(String[] args) {
    // list
    List<Item> grocery = new ArrayList<>();
    Item item1 = new Item("item1");
    grocery.add(item1);
    grocery.add(new Item("item2"));

    // extra list
    List<Item> moreItems = new ArrayList<>();
    moreItems.add(new Item("item3"));

    // collection addAll, insert one collection into another collection.
    // if the target collection being modified, return true; otherwise,false
    boolean result = grocery.addAll(moreItems);

    if (result) {
      System.out.println("entire items: " + grocery);
      grocery.removeIf(item -> item.equals(item1));
      System.out.println("entire items: " + grocery);
    }
  }
}
