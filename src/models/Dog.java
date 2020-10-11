package models;

public class Dog extends Animal {

    public Dog(String food, double avgLife, double weight) {
        super(food, avgLife, weight);
    }

    @Override
    void eat() {
        System.out.printf("eating %s \n", this.food);
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Dog)) throw new IllegalArgumentException("require a Dong type to compare");
        return this.compareTo((Dog) o);
    }
}
