package models;

public class Bird extends Animal {
  protected static String food;

  static {
    food = "bird food";
  }

  public Bird(double age, double weight) {
    super(age, weight);
  }

  @Override
  public int compareTo(Object o) {
    if (!(o instanceof Bird)) throw new IllegalArgumentException("it requires Bird");
    return Double.compare(this.weight, ((Bird) o).weight);
  }

  @Override
  void eat() {
    System.out.printf("eating %s \n", food);
  }

  @Override
  public String toString() {
    return "Bird{" + "age=" + age + ", weight=" + weight + '}';
  }
}
