package models;

public abstract class Animal implements Comparable {

  protected double age;
  protected double weight;

  public Animal(double age, double weight) {
    this.age = age;
    this.weight = weight;
  }

  abstract void eat();

  protected void live() {
    System.out.printf("living forest");
  }

  public double getAge() {
    return age;
  }

  public void setAge(double age) {
    this.age = age;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}
