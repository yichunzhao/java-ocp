package AdvancedClassDesign.Overriding;

/**
 * How about static method overriding?
 *
 * <p>overriding is only related with instance inheritance. Static methods can be hidden by the same
 * method in super class; it because the static method is referred directly by the class name. It
 * won't have an issue like dynamic bounding.
 */
class A {
  static void method() {
    System.out.println("A: method ");
  }
}

class B extends A {
  static void method() {
    System.out.println("B: method ");
  }
}

public class StaticMethodHidden {

  public static void main(String[] args) {
    A.method();
    B.method();
  }
}
