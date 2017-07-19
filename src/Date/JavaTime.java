/*
 * Java 8 new time pack. 
 * 
 * 
 */
package Date;

import java.time.LocalDate;

/**
 *
 * @author YNZ
 */
public class JavaTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("" + date);

        LocalDate dateAgain = LocalDate.now();
        System.out.println("" + dateAgain);

        System.out.println("" + (date.compareTo(dateAgain) == 0));

    }

}
