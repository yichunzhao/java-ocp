package AdvancedClassDesign.nestedclass.Anonymous;

/**
 * The purpose of anonymous class, in some cases you only want to override inherited methods for a single instance; and
 * for saving you don't want to write a new class. You may write an anonymous class, which only have class body but
 * without a name together with instance declaration. Within this class body you may override inherited methods for this
 * specific instance.
 */

class SomeClass {
    void doAction() {
        System.out.println("I am SomeClass, launch my action.");
    }

    void launch() {
        System.out.println("SomeClass instance launch.");
    }

}

public class AnonymousInnerClassDemo {

    static SomeClass divertedSomeClassInstance = new SomeClass() {
        @Override
        public void doAction() {
            System.out.println("I am a sub of SomeClass, but action differently....");
        }

    };

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.doAction();
        someClass.launch();

        divertedSomeClassInstance.doAction();
        divertedSomeClassInstance.launch();
    }
}
