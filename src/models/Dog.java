package models;

public class Dog extends Animal {
    protected static String food;

    static {
        food = "dog food";
    }

    public Dog(double age, double weight) {
        super(age, weight);
    }

    @Override
    void eat() {
        System.out.printf("eating %s \n", food);
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Dog)) throw new IllegalArgumentException("require a Dong type to compare");
        return this.compareTo((Dog) o);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }

}
