package AdvancedClassDesign.nestedclass;

/**
 * A class is defined within a class. It is referred as inner class.
 * <p>
 * It is used to encapsulate partial functionalities of the outer class. It depends on the instance of the outer class.
 * without the instance of outer class, it can not be accessed.
 * <p>
 * it needs a outer class instance first, so as to create an inner class instance.
 * <p>
 * An inner class instance must live within a life cycle of its outer class; without its outer class instance, it
 * won't have a chance to be real. Please imagine the universe and its galaxy.
 * <p>
 * object.new inner
 * <p>
 * Inner class allows only static final variables; Static methods and non-final static variables are not allowed.
 * or by one line code
 * Inner innerObj = new Outer().new Inner();
 * You see two new operator in one line.
 * <p>
 * inner class in a part of outerClass so it can access all methods and attributes of it.
 * <p>
 * An inner class uses outerClassName.this to refer the instance of outer class.
 * Within the inner class, this refers to Inner class instance itself.
 */
public class OuterClass {
    Inner inner;

    private int sameName = 20;


    public OuterClass() {
        inner = new Inner();
    }

    public static void staticMethod() {
        //how a static method refer to an inner class; firstly you have to create an instance of outer class
        OuterClass outerClass = new OuterClass();
        Inner inner = outerClass.new Inner();
        inner.innerClassDoSomething();
    }

    public void outerDoUsingInner() {
        inner.innerClassDoSomething();
    }

    private class Inner {
        static final int constant = 1000;

        private int sameName = OuterClass.this.sameName;
        //static int =2000;
        //static void staticMethod(){)
        //static final void staticFinalMethod(){}

        public Inner() {
            System.out.println("inner class constructed");
        }

        void innerClassDoSomething() {
            System.out.println("inner class instance do method is called");
        }
    }

    public class PublicInner {

    }

    public static void main(String[] args) {
        OuterClass usingInnerClass = new OuterClass();
        usingInnerClass.outerDoUsingInner();

        //how to create an inner class instance
        Inner inner = usingInnerClass.new Inner();
        inner.innerClassDoSomething();

        //invoking a static method from the outer class
        System.out.println("invoking a static method from the outer class");
        OuterClass.staticMethod();
    }
}
