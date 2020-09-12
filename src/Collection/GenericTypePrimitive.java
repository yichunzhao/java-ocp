package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Can byte[] being a generic type? Instance type is a generic type; array is an instance type.
 *
 * @author YNZ
 */

public class GenericTypePrimitive {
    public static void main(String[] args) {

        String string = "Corona-virus: Oxford University to resume vaccine trial after pause";
        List<String> words = Pattern.compile("[\\s:]").splitAsStream(string).collect(toList());
        words.removeIf(String::isEmpty);

        List<byte[]> bytesList = words.stream()
                .map(String::getBytes)
                .collect(toList());

        Map<byte[], Integer> byteLengthMap = bytesList.stream().collect(Collectors.toMap(b -> b, b -> b.length));

        System.out.println("byteListLengthMap: ");
        byteLengthMap.entrySet().forEach(x -> System.out.println(Arrays.toString(x.getKey()) + " " + x.getValue().toString()));
    }

}
