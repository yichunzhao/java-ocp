package Generics;

import models.Animal;
import models.Cat;
import models.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <H1>Polymorphism and Generics</H1>
 * <p>
 * One of Generic rule:
 * reference generic type must be identical to the object generic type, i.e.
 * List<Animal> animals = new ArrayList<Animal>()
 * List<Object> objects = new ArrayList<Object>()
 * <p>
 * List<Animal> animals = new ArrayList<Dog>() //Compilation error
 * List<Object> objects = new ArrayList<Dog>() //Compilation error
 * List<?> anything = new ArrayList<Dog>() //only wildcard allowing any type of instance type.
 * List<?> list = new ArrayList<Dog>();
 * List<? extends Animal> list1 = new ArrayList<Dog>();
 * List<? super Dog> list2 = new ArrayList<Animal>();
 * <p>
 * if you define method Argument List<Animal>, then you cannot assign List<Dog> to it. It causes a compilation error.
 * * It is a java generic gotchas.
 * <p>
 * The way to solve it, using the Generic boundary. By this way, the generic types are constrained in a scope, and
 * allowing its subtypes.
 */

class AnimalDoctor {
    public void checkAnimals(List<? extends Animal> animals) {
        animals.forEach(animal -> System.out.println("doctor check: " + animal.toString()));
    }
}

public class GenericGotchas {
    public static void main(String[] args) {
        List<Dog> dogs = Stream.of(new Dog(1, 1.2), new Dog(2, 2.3), new Dog(2, 3.4)).collect(Collectors.toList());
        List<Cat> cats = Stream.of(new Cat(2, 0.7), new Cat(2, 3.4), new Cat(3, 4.4)).collect(Collectors.toList());

        AnimalDoctor animalDoctor = new AnimalDoctor();
        animalDoctor.checkAnimals(dogs);
        animalDoctor.checkAnimals(cats);

        List<?> list = new ArrayList<Dog>();
        List<? extends Animal> list1 = new ArrayList<Dog>();
        List<? super Dog> list2 = new ArrayList<Animal>();
    }

}
