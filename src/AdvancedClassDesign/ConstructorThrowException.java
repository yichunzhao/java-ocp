package AdvancedClassDesign;

import java.io.IOException;

/**
 * extending from a super-class that throws an exception as invoking its constructor; sub-class must
 * throw the same exception in its constructor, or throwing an Exception even more generic. no
 * matter what by default a super() will be invoked as a Child instance is constructed.
 *
 * <p>Static method is not overridden, but hidden. A static Super class attribute is hidden by the
 * Child static attribute.
 */
class Parent {
  static String eyeColor = "brown";

  public Parent() throws IOException {
    System.out.println("parent instance no-argument constructor");
  }

  static void constantDo() {
    System.out.println("Parent class constant behaviour.");
  }

  public static String getEyeColor() {
    return eyeColor;
  }
}

class Child extends Parent {
  static String eyeColor = "lightBrown";

  public Child() throws Exception {
    System.out.println("child instance no-argument constructor");
  }

  static void constantDo() {
    System.out.println("Child class constant behaviour.");
  }

  public static String getEyeColor() {
    return eyeColor;
  }
}

public class ConstructorThrowException {

  public static void main(String[] args) throws Exception {
    Child child = new Child();

    Child.constantDo();
    Parent.constantDo();

    System.out.println("Parent eye color: " + Parent.getEyeColor());
    System.out.println("Child eye color: " + Child.getEyeColor());
  }
}
