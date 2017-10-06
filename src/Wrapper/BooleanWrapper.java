/*
 * Booean wrapper default value, without double it is null. for it is instance.
 * boolean primitive default value, it shuold be zero, i.e. false. 
 * for instance var., by default java will init primitive to be zero, and
 * instance var. to be null. 
 */
package Wrapper;

/**
 *
 * @author YNZ
 */
public class BooleanWrapper {

    private static Boolean b;
    private static boolean h;

    public static void main(String[] args) {
        System.out.println("b = " + b);
        System.out.println(Boolean.toString(h));

    }

}
