package Collection.list;

import models.Name;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * easy way to make a copy of a list is to use a constructor
 * <p>
 * question: is this a shallow copy or a deep copy?
 * <p>
 * it is a shallow copy. two List share the same element references
 */
public class CopyList {

    public static void main(String[] args) {
        Name name = Name.of("Kathy", "Sierra");
        Name name1 = Name.of("Bert", "Bates");
        List<Name> names = Stream.of(name, name1).collect(toList());
        System.out.println("names: " + names);

        List<Name> copyOfNames = new ArrayList<>(names);
        System.out.println("copy of names: " + copyOfNames);

        //make a change on the copy
        copyOfNames.get(0).setFirstName("Mike");

        System.out.println("modified copy: " + copyOfNames);
        System.out.println("original names: " + copyOfNames);

        //watch out here:
        System.out.println("copy contains original? " + copyOfNames.containsAll(names));
    }
}
