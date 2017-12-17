/*
 * how to create a immutable 
 * 
 * 
 */
package Threads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author YNZ
 */
final class BirthDate {

    private final Date birth;

    public BirthDate(Date birth) { //final fild can be init. only once
        this.birth = birth;
    }

    public Date getBirth() {
        return (Date) birth.clone();
    }

}

public class ImmutableProtection {

    public static void main(String[] args) throws ParseException {
        String birthString = "2/19/1971";
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date birth = dateFormat.parse(birthString);
        System.out.println("birth : " + birth.toString());

        String anotherBirthString = "February/19/1971";
        SimpleDateFormat pattern = new SimpleDateFormat("MMMM/dd/yyyy", Locale.ENGLISH);
        Date anotherBirth = pattern.parse(anotherBirthString);
        System.out.println("another birth: " + anotherBirth.toString());

        String thirdBirthString = "February 19, 1971";
        SimpleDateFormat pattern1 = new SimpleDateFormat("MMMM dd, yyyy", Locale.ENGLISH);
        Date thirdBirth = pattern1.parse(thirdBirthString);
        System.out.println("third birth: " + thirdBirth.toString());

        BirthDate bd = new BirthDate(thirdBirth);
        System.out.println("Birth date: " + bd.getBirth());

    }

}
