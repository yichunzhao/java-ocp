package Collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * removing all elements listed in a collection from another collection.
 */
public class RemoveElements {
    public static void main(String[] args) {
        List<String> fields = new ArrayList<>(List.of("id", "comment", "answers", "submittedAt"));
        List<String> marked = List.of("id", "comment", "unknown");

        //removing elements that are marked.
        fields.removeAll(marked);
        System.out.println("not marked: " + fields);
    }
}
