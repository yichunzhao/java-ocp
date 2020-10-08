package StringProcessing.tokenizing;

import java.util.Scanner;

/**
 * Scanner class: parsing and tokenizing streams(IO: File, Readable,String) by using a pattern, which can be character,
 * a string literal, or a regex.
 */
public class ScannerParseAndTokenize {

    public static void main(String[] args) {

        //If no delimiter is specified, a pattern that matches whitespace is used by default for
        //a Scanner object.
        Scanner scanner = new Scanner("The \tnew \nProgrammer exam");//\t space tab; \n newline character

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        System.out.println("-------------");
        //printout words: you can specify the regEx by calling method useDelimiter()
        Scanner scanner1 = new Scanner("The1new22Programmer exam6");
        scanner1.useDelimiter("\\d+");
        while (scanner1.hasNext()) {
            System.out.println(scanner1.next());
        }

        System.out.println("++++++++++++");
        //printout digits alone:
        Scanner scanner2 = new Scanner("The1new22Programmer exam6");
        scanner2.useDelimiter("[a-zA-Z\\s]+");
        while (scanner2.hasNext()) {
            System.out.println(scanner2.next());
        }

        System.out.println("++++++++++++");
        //next() and nextXXX() returns primitives
        Scanner scanner3 = new Scanner("Shreya,20,true");
        scanner3.useDelimiter(",");
        System.out.println(scanner3.next());
        System.out.println(scanner3.nextInt());
        System.out.println(scanner3.next());

        System.out.println("++++++++++++");
        //retrieving numbers alone from a string
        Scanner scanner4 = new Scanner("1 2 4 The new 55 Programmer 44 exam").useDelimiter("[A-Za-z\\s]+");
        int total = 0;
        while (scanner4.hasNext()) {
            total += scanner4.nextInt();
        }
        System.out.println("total: " + total);

    }
}
