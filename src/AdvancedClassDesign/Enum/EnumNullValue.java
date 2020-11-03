package AdvancedClassDesign.Enum;

import java.util.Arrays;

/**
 * enum is a class; it extends from Java Enum class.
 * as in compiling time, implicit code is added by the compiler.
 * <p>
 * Each constant is defined as a public static final instance in its super class, and instantiated in a static block,
 * where each constant is instantiated with two arguments, i.e. name and ordinal. So each constant has a single
 * and public instance.
 * <p>
 * enum is allowed to have private or default access level constructors.
 */

public class EnumNullValue {

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {

        //NullPointException
        try {
            Level.valueOf(null);
        } catch (Exception e) {
            System.out.println(e);
        }

        //IllegalArgumentException
        try {
            Level.valueOf("some");
        } catch (Exception e) {
            System.out.println(e);
        }

        //constant is instantiated with name and ordinal; ordinal is given by default according to the appearance
        //sequence.
        Arrays.stream(Level.values())
                .forEach(level -> System.out.printf("name: %s and ordinal %d \n ", level.name(), level.ordinal()));
    }
}
