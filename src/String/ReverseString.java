/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author YNZ
 */
public class ReverseString {

    public static void main(String[] args) {

        String str = "Design Patterns";

        /**
         * method 1
         */
        char[] chars = str.toCharArray();

        int i, j;
        char[] reversed = new char[chars.length];
        //for loop; var. initialisation; condition (true); var increasement
        for (i = chars.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = chars[i];
        }

        System.out.println("" + String.valueOf(chars));
        System.out.println("" + String.valueOf(reversed));

        /**
         * method 2 using Deque to impl. a stack; push on the head, pop on the
         * head
         */
        Deque<Character> charStack = new LinkedList<>();

        for (char c : chars) {
            charStack.push(c);
        }

        char[] reversed2 = new char[chars.length];

        for (int m = 0; m < reversed2.length - 1; m++) {
            reversed2[m] = charStack.pop();

        }

        System.out.println("Using a stack:  " + String.valueOf(reversed2));

    }

}
