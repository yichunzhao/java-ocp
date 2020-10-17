package OOD.nestedclass;

/**
 * A class is defined within a class. It is referred as inner class.
 * <p>
 * It is used to encapsulate partial functionalities of the outer class. It depends on the instance of the outer class.
 * without the instance of outer class, it can not be accessed.
 * <p>
 * it needs a outer class instance first, so as to create an inner class instance.
 */
public class OuterClass {
    Inner inner;


    public OuterClass() {
        inner = new Inner();
    }

    public void outerDoUsingInner() {
        inner.innerClassDoSomething();
    }

    private class Inner {
        static final int constant = 1000;
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
    }
}
