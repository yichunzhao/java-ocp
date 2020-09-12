/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.Sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Sorting a stream of instances.
 *
 * @author YNZ
 */
class Apple {
    private double weight;

    public Apple(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public static Apple of(double weight) {
        return new Apple(weight);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }
}

public class SortingCollection {
    public static List<Apple> apples;

    static {
        apples =
                Stream.of(Apple.of(12.3D), Apple.of(23.0D), Apple.of(34.9D), Apple.of(44.56D)).collect(toList());
    }

    public static void main(String[] args) {
        Collections.shuffle(apples);
        //converting a Collection into a String; Using Arrays helper class and add a custom toString method
        System.out.println(apples.toString());

        //sorting a List
        apples.sort(Comparator.comparingDouble(Apple::getWeight));
        System.out.println("after sorting: +++++");
        System.out.println(apples.toString());

        Collections.shuffle(apples);
        //find max weight
        apples.stream().max(Comparator.comparingDouble(Apple::getWeight))
                .ifPresent(apple -> System.out.println("max weight apple: " + apple));

        Collections.shuffle(apples);
        //find min weight
        apples.stream().min(Comparator.comparingDouble(Apple::getWeight))
                .ifPresent(apple -> System.out.println("min weight apple: " + apple));

        //counting elements in a stream
        System.out.println("how many apples: " + apples.stream().count());
        System.out.println("how many apples: " + apples.stream().collect(Collectors.counting()));
    }
}
