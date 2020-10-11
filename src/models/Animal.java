package models;

public abstract class Animal implements Comparable {

    protected String food;
    protected double avgLife;

    protected double weight;

    public Animal(String food, double avgLife) {
        this.food = food;
        this.avgLife = avgLife;
    }

    public Animal(String food, double avgLife, double weight) {
        this.food = food;
        this.avgLife = avgLife;
        this.weight = weight;
    }

    abstract void eat();

    protected void live() {
        System.out.printf("living forest");
    }

    public String getFood() {
        return food;
    }

    public double getAvgLife() {
        return avgLife;
    }

    public double getWeight() {
        return weight;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setAvgLife(double avgLife) {
        this.avgLife = avgLife;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
