package Collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * List set(index, newValue)
 * <p>
 * replace element at the index, with newValue
 */
public class RemoveElement {

    public static void main(String[] args) {
        var origin = List.of("id", "comment", "answers", "submittedAt");
        var fields = new ArrayList<>(origin);
        System.out.println("before removing :" + fields);

        fields.set(1, "id");
        System.out.println("insert at tail :" + fields);
        fields.remove("id");
        System.out.println("after removing :" + fields);

        var index = fields.indexOf("answers");
        System.out.println("index :" + index);

        var index_ = fields.indexOf("notExisted");
        System.out.println("index :" + index_);
    }
}
