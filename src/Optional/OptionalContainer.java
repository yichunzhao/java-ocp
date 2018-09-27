/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Optional;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author YNZ
 */
public class OptionalContainer {

    public static void main(String[] args) {

        String love = "I love you";
        
        Optional<String> op = Pattern.compile("[\\s]").splitAsStream(love).findFirst();
        System.out.println(op.orElse("Unkonwn"));
        op.ifPresent(System.out::println);

        System.out.println(op.orElse("nothing in optional"));

        String str = "string";
        String what = Optional.ofNullable(str).orElse("wrong");
        System.out.println("what : " + what);

        String str1 = null;
        String what1 = Optional.ofNullable(str1).orElse("wrong");
        System.out.println("what : " + what1);

        //supplier function
        System.out.println(Optional.ofNullable(null).orElseGet(() -> "whatever"));

        Optional.ofNullable(love).ifPresent(System.out::println);
        
        //handling if 
        List<Integer> integers = Stream.of(1, 2, 3).collect(toList());
        Optional.of(integers).filter(x -> x.size() == 2).ifPresent(System.out::println);

    }

}
