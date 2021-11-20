package Collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * removing all elements listed in a collection from another collection.
 */
public class RemoveElements {
    public static void main(String[] args) {
        var origin = List.of("id", "comment", "answers", "submittedAt");
        var fields = new ArrayList<>(origin);
        var marked = List.of("id", "comment", "unknown");

        //removing elements that are marked.
        fields.removeAll(marked);
        System.out.println("not marked: " + fields);

        //keeping all elements that are in another collection.
        var myFields = new ArrayList<>(origin);
        myFields.retainAll(marked);
        System.out.println("retained: " + myFields);
    }
}
