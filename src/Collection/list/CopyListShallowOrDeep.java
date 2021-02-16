package Collection.list;

import models.Name;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * easy way to make a copy of a list is to use a constructor
 * <p>
 * question: is this a shallow copy or a deep copy?
 * <p>
 * it is a shallow copy. two List share the same element references
 * <p>
 * meanwhile, addAll method is the same as the constructor method, copy of list and list both hold the same references
 * to the element instances. if you change on one side, another side is also changed.
 */
public class CopyListShallowOrDeep {

    public static void main(String[] args) {
        Name name = Name.of("Kathy", "Sierra");
        Name name1 = Name.of("Bert", "Bates");
        List<Name> names = Stream.of(name, name1).collect(toList());
        System.out.println("names: " + names);

        List<Name> copyOfNames = new ArrayList<>(names);
        System.out.println("copy of names: " + copyOfNames);

        //make a change on the copy
        copyOfNames.get(0).setFirstName("Mike");

        //both list having been modified
        System.out.println("modified copy: " + copyOfNames);
        System.out.println("original names: " + copyOfNames);

        //watch out here:
        System.out.println("copy contains original? " + copyOfNames.containsAll(names));

        /**
         * deep copy of a list
         */
        //source size should <= dest size; otherwise it throws exception
        //so simple way to construct a shallow copy.
        List<Name> dest = new ArrayList<>(names);
        //then making a deep copy, using Collections static method
        Collections.copy(dest, names);

        //now, dest List should contain different Name instances from the Original one.
        System.out.println("dest contains all of names? " + dest.contains(names));
    }
}
