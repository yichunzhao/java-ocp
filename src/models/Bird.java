package models;

public class Bird extends Animal {

    public Bird(String food, double avgLife, double weight) {
        super(food, avgLife, weight);
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Bird)) throw new IllegalArgumentException("it requires Bird");
        return Double.compare(this.weight, ((Bird) o).weight);
    }

    @Override
    void eat() {
        System.out.printf("eating %s \n", this.food);
    }

}
