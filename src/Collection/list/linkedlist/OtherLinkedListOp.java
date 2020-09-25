package Collection.list.linkedlist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * using linkedList API can easily read from tail, and reverse a List.
 */
public class OtherLinkedListOp {

    public static void main(String[] args) {
        LinkedList<String> linkedStrings = Arrays.stream("we love java programming".split("\\s"))
                .collect(Collectors.toCollection(LinkedList::new));

        List<String> anotherList = new ArrayList<>();
        IntStream.range(0, linkedStrings.size()).forEach(i -> anotherList.add(linkedStrings.pollLast()));

        System.out.println("after poolLast(): " + anotherList);
    }
}
