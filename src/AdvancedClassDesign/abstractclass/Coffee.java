package AdvancedClassDesign.abstractclass;

public abstract class Coffee {
    abstract void concentration();

    protected void addMilk() {
        System.out.printf("add milk");
    }
}

class BlackCoffee extends Coffee{
    @Override
    void concentration() {

    }

    @Override
    protected void addMilk() {
        System.out.println("add another milk");
    }

}
