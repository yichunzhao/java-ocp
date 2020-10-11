package models;

public class Cat extends Animal {

    public Cat(String food, double avgLife, double weight) {
        super(food, avgLife, weight);
    }

    @Override
    void eat() {
        System.out.printf("eating %s \n", this.food);
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Cat)) throw new IllegalArgumentException("require Cat class type");
        return Double.compare(this.weight, ((Cat) o).weight);
    }
}
