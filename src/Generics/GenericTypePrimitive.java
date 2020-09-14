package Generics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Can byte[] being a generic type? Instance type can be a generic type; array is an instance type.
 * <p>
 * A restriction in Java generics is that type parameter cannot be a primitive type.
 * <p>
 * The reason: in java generics, during the compiling the type parameter is erased and all generic types are
 * implemented as Object or bounded types. However, primitive types are not an Object, so we cannot use it as
 * a type parameter.
 *
 * @author YNZ
 */

public class GenericTypePrimitive {
    public static void main(String[] args) {

        String string = "Coronavirus: Oxford University to resume vaccine trial after pause";

        List<String> words = Pattern.compile("[\\W]").splitAsStream(string).collect(toList());
        words.removeIf(String::isEmpty);

        List<byte[]> bytesList = words.stream()
                .map(String::getBytes)
                .collect(toList());

        Map<byte[], Integer> byteLengthMap = bytesList.stream().collect(Collectors.toMap(b -> b, b -> b.length));

        System.out.println("byteListLengthMap: ");
        byteLengthMap.entrySet().forEach(x -> System.out.println(Arrays.toString(x.getKey()) + " " + x.getValue()));
    }

}
