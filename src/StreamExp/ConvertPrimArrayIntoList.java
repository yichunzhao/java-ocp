/*
 * 
 * How to convert a primitive array into a ArrayList
 * 
 */
package StreamExp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author YNZ
 */
public class ConvertPrimArrayIntoList {

    public static void main(String[] args) {

        //a primitive array
        char[] chars = "I hate it. ".toCharArray();

        //
        List<Character> charList = new ArrayList<>();
        for (char c : chars) {
            charList.add(c);
        }

        System.out.println("size of charList " + charList.size());

        //in java 8
        String str = "what is happening? ";
        List<Character> listOfChar = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.println("List chars : " + listOfChar);

    }

}
