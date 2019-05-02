package String;

public class FlipStringEachTwoChar {

    public static void main(String... args) {
        String numbers = "12345678";  //flip to 21 43 65 87

        System.out.println(flipNumbers(numbers));
    }

    private static String flipNumbers(String numbers) {
        char[] numberArray = numbers.trim().toCharArray();

        for (int i = 0; i < numberArray.length; i += 2) {
            char tmp = numberArray[i];
            numberArray[i] = numberArray[i + 1];
            numberArray[i + 1] = tmp;
        }

        return String.valueOf(numberArray);
    }

}
