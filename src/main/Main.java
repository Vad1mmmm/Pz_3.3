package main;
import pet_animal.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("1Spayk", LocalDate.of(2015, 12, 4), 2));
        dogs.add(new Dog("2Spayk", LocalDate.of(2015, 12, 4), 90));
        dogs.add(new Dog("3Spayk", LocalDate.of(2015, 12, 4), 0));
        dogs.add(new Dog("4Spayk", LocalDate.of(2015, 12, 4), 13));
        dogs.add(new Dog("5Spayk", LocalDate.of(2015, 12, 4), 7));
        dogs.add(new Dog("6Spayk", LocalDate.of(2015, 12, 4), 16));
        System.out.println("--------------Array dogs---------------------");
        for  (Dog dog : dogs) {
            System.out.println(dog);
        }
        System.out.println("-------------------Sorted dogs--------------------");
        dogs.sort(Dog::compareTo);
        dogs.forEach(System.out::println);

        ArrayList<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Tom1", LocalDate.of(2015, 12, 4), 7));
        cats.add(new Cat("Tom2", LocalDate.of(2015, 12, 4), 17));
        cats.add(new Cat("Tom3", LocalDate.of(2015, 12, 4), 4));
        cats.add(new Cat("Tom4", LocalDate.of(2015, 12, 4), 2));
        cats.add(new Cat("Tom5", LocalDate.of(2015, 12, 4), 1));
        System.out.println("------------------Array cats---------------------");
        for(Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("-----------------------Sorted cats--------------------");
        cats.sort(Cat::compareTo);
        cats.forEach(System.out::println);
    }
}
