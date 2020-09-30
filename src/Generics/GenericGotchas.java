package Generics;

import models.Animal;
import models.Cat;
import models.Dog;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  <H1>Polymorphism and Generics</H1>
 *
 * One of Generic rule:
 * reference generic type must be identical to the object generic type, i.e.
 * List<Animal> animals = new ArrayList<Animal>()
 * <p>
 * if you define method Argument List<Animal>, then you cannot assign List<Dog> to it. It causes a compilation error.
 * <p>
 * The way to solve it, using the Generic boundary.
 */

class AnimalDoctor {
    public void checkAnimals(List<? extends Animal> animals) {
        animals.forEach(animal -> System.out.println("doctor check: " + animal.toString()));
    }
}

public class GenericGotchas {
    public static void main(String[] args) {
        List<Dog> dogs = Stream.of(new Dog(), new Dog(), new Dog()).collect(Collectors.toList());
        List<Cat> cats = Stream.of(new Cat(), new Cat(), new Cat()).collect(Collectors.toList());

        AnimalDoctor animalDoctor = new AnimalDoctor();
        animalDoctor.checkAnimals(dogs);
        animalDoctor.checkAnimals(cats);

    }


}
