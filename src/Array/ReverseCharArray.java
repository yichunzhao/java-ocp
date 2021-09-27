package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/** Reverse a String and convert the result to char[] */
public class ReverseCharArray {

  public static void main(String[] args) {

    String str = "Java is popular";
    System.out.println("original: " + str);

    // convert char array to Character List
    List<Character> characterList = str.chars().mapToObj(i -> (char) i).collect(toList());
    System.out.println("converted to List: " + characterList);

    // reverse using Collections method
    Collections.reverse(characterList);
    System.out.println("reversed: " + characterList);

    // convert the Character list to char[]; from instance list to primitive array.
    char[] chars = new char[characterList.size()];
    IntStream.range(0, characterList.size()).forEach(i -> chars[i] = characterList.get(i));
    System.out.println("back to primitive char[]" + Arrays.toString(chars));
  }
}
