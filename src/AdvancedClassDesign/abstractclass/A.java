package AdvancedClassDesign.abstractclass;

public class A {

    protected void methodA(){
        System.out.println("class a :");
    }

}

abstract class B extends A{

    @Override
    abstract protected void methodA();
}

class C extends B{

    @Override
    protected void methodA() {
        System.out.println("from C class ");
    }
}

class Implementation{
    public static void main(String[] args) {
        C cInstance = new C();
        cInstance.methodA();
    }
}