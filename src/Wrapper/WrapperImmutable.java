/*
 * Wrapper classes are immutable. it cannot be modified; 
 * String is immuatble, 
 * 
 */
package Wrapper;

/**
 *
 * @author YNZ
 */
public class WrapperImmutable {

    public static void main(String[] args) {

        Double d = 12D;
        System.out.println("hascode equal? " + Boolean.valueOf((d++).hashCode() == d.hashCode()));

        String str = "1223";
        String str1 = "1223";
        System.out.println("hascode equal? " + Boolean.valueOf(str.hashCode() == str1.hashCode()));

    }

}
