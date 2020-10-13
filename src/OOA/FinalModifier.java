package OOA;

/**
 * The final keyword is a non-access modifier, it can modify classes, methods and variables; the semantics of final
 * it means it cannot be changed once it is initialized or created.
 * <p>
 * final class can not be extended; final method cannot be overridden.
 * <p>
 * final variable can be init once; once it is initialized then it cannot be modified.
 * <p>
 * final variables must be init. or generating compilation errors.
 * <p>
 * static final var. cannot be init. in an instance constructor. So it must be init as declared, or with a static block.
 * instance final var. can be init. via an instance constructor.
 * <p>
 * You can assign a static final variable via a static method, because a static method can be invoked more than once.
 * That is the reason why it generates a compilation error.
 */
public class FinalModifier {
    //instance final variable
    final int staticInstanceFinal;

    //class final variable
    static final int staticClassFinal = 123456;
    static final double staticClassFinalDouble;
//    static final float staticClassFinalFloat;

    static {
        staticClassFinalDouble = 3.14;
    }

    public FinalModifier(int staticInstanceFinal) {
        this.staticInstanceFinal = staticInstanceFinal;
    }

    //if you added a non-arg constructor, it generates a compilation error; for the static instance var may not
    //be init.
//    public FinalModifier() {
//    }

    //    static void initStaticClassFinalFloat(){
//        staticClassFinalFloat = 1.2f;
//    }

    public void useInstanceMethod() {
        final int instanceFinalInteger1 = 290;
        int anyLocalVar;
        //local final var can survive without init.
        final int instanceFinalInteger2;
        System.out.printf("instance final integer 1:" + instanceFinalInteger1);
        //however once you use it then it generates a compilation error.
        //System.out.printf("instance final integer 2:" + instanceFinalInteger2);

        //non-final var must be init before using it
//        System.out.printf(""+anyLocalVar);
    }

    public static void main(String[] args) {
        System.out.printf("static class final double: %f \n", FinalModifier.staticClassFinalDouble);
        System.out.printf("static class final %d \n", FinalModifier.staticClassFinal);
        System.out.printf("static instance final %d \n", new FinalModifier(12).staticInstanceFinal);
    }

    //final modify method parameters, meaning that it cannot be modified in the method body.
    public void setPrimitiveMethodArg(final Integer y) {
        //y++;
    }

    public void setInstanceMethodArg(final StringBuilder sb) {
        //referenced object itself still can be modified.
        sb.append("another");
        //however its instance reference cannot be modified, meaning that you can point it to another instance.
        //the following you will get a compilation error; you cannot re-assign a final reference var. 
        //sb = new StringBuilder();
    }
}


