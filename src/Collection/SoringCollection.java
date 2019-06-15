/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/** @author YNZ */
class Apple {
  private double weight;

  public Apple(double weight) {
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}

public class SoringCollection {

  public static void main(String[] args) {

    List<Apple> apples =
        Stream.of(new Apple(12.3D), new Apple(23.0D), new Apple(34.9D)).collect(toList());
  }
}
