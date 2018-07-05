/*
 * 
 * Using recursive function. 
 * 
 */
package Lamada;

/**
 *
 * @author YNZ
 */
public class PrintOneToNWithoutLoop {

    public static void main(String[] args) {
        printN(1);
        System.out.println("");
    }

    public static void printN(int n) {
        if (n <= 100) {
            System.out.print(" " + n);
            n++;
            printN(n);
        }

    }

}
