/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Arrays;

/**
 * @author YNZ
 */
public class StringJoin {

    public static void main(String[] args) {
        //join String variables together in a single String
        String joinedString = String.join("--", "java", "world");
        System.out.println("joined String : " + joinedString);

        //join an iterable in to string with a conjunction String
        System.out.println(String.join("+", Arrays.asList("what", "are", "you", "doing")));
    }
}
