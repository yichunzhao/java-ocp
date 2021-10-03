package AdvancedClassDesign.abstractclass;

/**
 * abstract class doesn't need to implement or redeclare inherited abstract method; non-abstract
 * sub-class must implement incomplete abstract method; otherwise it need to redeclare this abstract
 * method.
 */
abstract class BaseClass {
  private static final boolean flag = true;

  public static void staticMethod() {
    System.out.println("base abstract class static method: ");
  }

  protected void instanceMethod() {
    System.out.println("instance method defined in abstract class ");
  }

  abstract void doAction();

  abstract void launchWarning();
}

abstract class BaseBaseClass extends BaseClass {
  abstract void doActionInAnotherWay();
}

class RealClass extends BaseBaseClass {
  @Override
  void doAction() {
    System.out.println("RealClass instance doAction");
  }

  @Override
  void doActionInAnotherWay() {}

  @Override
  void launchWarning() {}
}

public class AbstractAbstractClass {

  public static void main(String[] args) {
    RealClass realClass = new RealClass();
    realClass.doAction();

    realClass.instanceMethod();
    RealClass.staticMethod();
  }
}
