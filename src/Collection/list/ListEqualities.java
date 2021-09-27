package Collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * what is equality of two lists?
 *
 * <p>both list contains the same size of elements. both list contains the same elements and in the
 * same sequence.
 */
public class ListEqualities {

  private static final List<Character> charList1 = new ArrayList<>();
  private static final List<Character> charList2 = new ArrayList<>();

  static {
    String str1 = "stop";
    String str2 = "tops";

    for (char c : str1.toCharArray()) {
      charList1.add(c);
    }

    for (char c : str2.toCharArray()) {
      charList2.add(c);
    }
  }

  public static void main(String[] args) {
    charList1.equals(charList2);

    System.out.printf("\"stop\" equals \"tops\" ? %b \n", charList1.equals(charList2));

    Set<Character> charList1Set = new HashSet(charList1);
    Set<Character> charList2Set = new HashSet(charList2);

    System.out.printf("\"stop\" equals \"tops\" ? %b \n", charList1Set.equals(charList2Set));

    System.out.println("what is List equality? ");

    List<Character> list1 = Arrays.asList('g', 'a', 'm', 'e');
    List<Character> list2 = Arrays.asList('g', 'a', 'm', 'e');

    System.out.printf("is list1 == list2? %b \n ", (list1 == list2));
    System.out.printf("is list1 equals list2? %b \n ", list1.equals(list2));

    List<Character> list3 = Arrays.asList('e', 'g', 'a', 'm');
    System.out.printf("is list1 == list3? %b \n ", (list1 == list3));
    System.out.printf("is list1 equals list3? %b \n ", list1.equals(list3));
  }
}
