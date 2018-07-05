/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Optional;

import java.util.regex.Pattern;

/**
 *
 * @author YNZ
 */
public class UsingOptional {
    public static void main(String[] args) {
        
        String anyStr = "Java Generics and Collections";
        Pattern.compile("[\\s]").splitAsStream(anyStr).findFirst();
        
    }
}
