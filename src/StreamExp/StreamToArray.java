package StreamExp;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamToArray {
    public static void main(String[] args) {

        //converting a stream to a specific array.
        String[] strings = Stream.of("who", "are", "you", "?").toArray(String[]::new);

        for (String string : strings) {
            System.out.println(string);
        }

        //converting an array to a stream(int stream).
        int[] numbs = {12, 34, 56};
        System.out.println(Arrays.stream(numbs).sum());

        //convert a stream of object into a int array
        int[] ls = Stream.of("who", "are", "you", "?").mapToInt(s -> s.length()).toArray();
        //convert an Array to a string
        System.out.println(Arrays.toString(ls));

        //convert a string stream with a specific conjunction.
        String[] words = {"we", "found", "a", "truth"};
        System.out.println(Arrays.stream(words).collect(Collectors.joining("-")));
    }
}
