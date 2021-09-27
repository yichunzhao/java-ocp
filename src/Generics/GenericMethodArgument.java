package Generics;

import java.util.ArrayList;
import java.util.List;

class Vehicle {

  @Override
  public String toString() {
    return Vehicle.class.getName();
  }
}

class Car extends Vehicle {

  @Override
  public String toString() {
    return Car.class.getName();
  }
}

class Jet extends Vehicle {

  @Override
  public String toString() {
    return Jet.class.getName();
  }
}

public class GenericMethodArgument {

  public static void main(String[] args) {
    List<Vehicle> vehicles = new ArrayList<>();
    vehicles.add(new Vehicle());
    vehicles.add(new Car());

    invokeMethod(vehicles);

    System.out.println(vehicles);
  }

  public static void invokeMethod(List<Vehicle> numbers) {
    numbers.add(new Jet());
  }
}
