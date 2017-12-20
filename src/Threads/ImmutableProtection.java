/*
 * a final varaible can be only assinged once; otherwise it will cause compilation error. 
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

    private final Date birth; //birth is a object reference varaible. it should be constant. 

    public BirthDate(Date birth) { //a final variable can be init. only once. 
        this.birth = birth;
    }

    public Date getBirth() {
        return (Date) birth.clone(); // return a copy of object, thus in avoidance of modification 
    }

    public void modfiyAge() {
        birth.setTime(1111190000); // final variable cannot be re-assigned, but its existing object can be modified. 

    }

}

final class Client {

    private final String name;
    private final Integer age;

    public Client(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name;
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

        bd.getBirth().setMonth(12);
        System.out.println("birth date again: " + bd.getBirth());

        Client c = new Client("Yichun", 50);
        System.out.println("client name: " + c.getName());

        c.getAge();

        System.out.println("after modification: " + c.getName());
        
        BirthDate bDate = new BirthDate(birth);
        System.out.println("b Date : " + bDate.getBirth());
        
        bDate.modfiyAge();
        System.out.println("modify b Date: " + bDate.getBirth());

    }

}
