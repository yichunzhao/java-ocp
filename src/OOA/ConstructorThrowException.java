package OOA;

import java.io.IOException;

/**
 * extending from a super-class that throws an exception as invoking its constructor; sub-class must throw the same
 * exception in its constructor, or throwing an Exception even more generic. no matter what by default a super() will
 * be invoked as a Child instance is constructed.
 */
class Parent {

    public Parent() throws IOException {
        System.out.println("parent instance no-argument constructor");
    }
}

class Child extends Parent {
    public Child() throws Exception {
        System.out.println("child instance no-argument constructor");
    }
}

public class ConstructorThrowException {

    public static void main(String[] args) throws Exception {
        Child child = new Child();
    }
}
