package AdvancedClassDesign.nestedclass.staticNested;

/**
 * Instantiate static nested class and an inner class(instance)
 *
 * <p>you can refer an inner class type via a class name directly, but you have to instantiate an
 * inner class via its outer class instance. <code>
 * <pre> Outer.InstanceInner instanceInner = new Outer().new InstanceInner(); </pre>
 * </code>
 */
class Outer {
  static int outerStatic = 10;
  int outInstance = 20;

  static class StaticNested {
    static int nestedStatic = 10;
    int innerInstance = 20;
  }

  /**
   * you cannot declare static variable in an inner class you cannot declare static method you can
   * declare static final variable.
   */
  class InstanceInner {
    static final int staticVar = 40;
    int instanceVar = 30;

    void instanceMethod() {}
  }
}

public class InstantiateStaticNestedClass {

  public static void main(String[] args) {
    // how to instantiate a static nested class, it can be
    Outer.StaticNested staticNested = new Outer.StaticNested();

    // how to instantiate inner class; it must depend on an outer instance
    Outer.InstanceInner instanceInner = new Outer().new InstanceInner();
  }
}
