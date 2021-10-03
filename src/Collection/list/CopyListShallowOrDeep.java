package Collection.list;

import models.Name;

import java.util.ArrayList;
import java.util.List;

/**
 * A shallow copy of a List
 *
 * <p>an easy way to make a copy of a list is to use a constructor
 *
 * <p>it is a shallow copy. two List share the same references points to elements
 *
 * <p>List.addAll method is the same as the constructor, sharing the same references to the element
 * instances. if you make a change on one list, the content in another list is modified too.
 *
 * <p>
 *
 * <p>When using a shallow copy? when need to resort a list without any modifications; but don't
 * want to pollute the origin. you may use a shallow copy.
 */
public class CopyListShallowOrDeep {

  public static void main(String[] args) {
    Name name = Name.of("Kathy", "Sierra");
    Name name1 = Name.of("Bert", "Bates");

    List<Name> names = new ArrayList<>();
    names.add(name);
    names.add(name1);

    System.out.println("names: " + names);

    List<Name> copyOfNames = new ArrayList<>(names);
    System.out.println("copy of names: " + copyOfNames);

    System.out.println("make a change on the copy...");

    copyOfNames.get(0).setFirstName("Mike");

    // both list having been modified
    System.out.println("modified copy: " + copyOfNames);
    System.out.println("original names: " + names);

    // watch out here:
    System.out.println("copy contains original? " + copyOfNames.containsAll(names));
  }
}
