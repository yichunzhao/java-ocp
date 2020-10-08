package StringProcessing.tokenizing;

import java.util.Scanner;

/**
 * Scanner.findLine(regEx) matching the specified pattern in an entire line.
 */
public class ScannerMatchLine {

    public static void main(String[] args) {
        String target = "ABC 223.2343 Paul 10";
        Scanner scanner = new Scanner(target);

        //fit the line with a pattern
        scanner.findInLine("[A-C]{3}\\s\\d\\.\\d\\s[A-Za-z]+\\s\\d{2}");
        System.out.println(scanner.next());
        System.out.println(scanner.nextDouble());
        System.out.println(scanner.next());
        System.out.println(scanner.nextInt());

        //if the string is found, return it.  if the string not matched, returns null
        System.out.println("find a string in a line: " + scanner.findInLine("Paul 10"));
    }
}
