package AdvancedClassDesign;

/**
 * Static class and interface:
 *
 * <p>Static cannot modify class and interface, it generates compilation error. However, you can
 * define a static class or interface inside another class as a static member.
 *
 * <p>thus you can access static member without instances, but directly from Class. Static classes
 * and interfaces can be used in a static context.
 */
class Top {
  static interface Dressing {}

  static class Pie {}
}

public class StaticClassAndInterface {}
