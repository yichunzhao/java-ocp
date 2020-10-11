package models;

public class Cat extends Animal {
    protected static String food;

    static {
        food = "cat food";
    }

    public Cat(double age, double weight) {
        super(age, weight);
    }

    @Override
    void eat() {
        System.out.printf("eating %s \n", food);
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Cat)) throw new IllegalArgumentException("require Cat class type");
        return Double.compare(this.weight, ((Cat) o).weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }

}
