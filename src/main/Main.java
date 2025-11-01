package main;
import pet_animal.*;
import sorter.AnymalByAgeComparator;
import sorter.Order;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("1Spayk", LocalDate.of(2015, 12, 4), 2));
        dogs.add(new Dog("2Spayk", LocalDate.of(2014, 12, 4), 90));
        dogs.add(new Dog("3Spayk", LocalDate.of(2017, 12, 4), 0));
        dogs.add(new Dog("4Spayk", LocalDate.of(2019, 12, 4), 13));
        dogs.add(new Dog("5Spayk", LocalDate.of(2013, 12, 4), 7));
        dogs.add(new Dog("6Spayk", LocalDate.of(2016, 12, 4), 16));
        System.out.println("--------------Array dogs---------------------");
        for  (Dog dog : dogs) {
            System.out.println(dog);
        }
        System.out.println("-------------------Sorted dogs--------------------");
        dogs.sort(Dog::compareTo);
        dogs.forEach(System.out::println);

        ArrayList<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Tom1", LocalDate.of(2012, 12, 4), 7));
        cats.add(new Cat("Tom2", LocalDate.of(2016, 12, 4), 17));
        cats.add(new Cat("Tom3", LocalDate.of(2018, 12, 4), 4));
        cats.add(new Cat("Tom4", LocalDate.of(2014, 12, 4), 2));
        cats.add(new Cat("Tom5", LocalDate.of(2013, 12, 4), 1));
        System.out.println("------------------Array cats---------------------");
        for(Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("-----------------------Sorted cats--------------------");
        cats.sort(Cat::compareTo);
        cats.forEach(System.out::println);

        ArrayList<PetAnimal> animals = new ArrayList<>();

        for(Dog dog : dogs) {
            animals.add(dog);
        }
        for(Cat cat : cats) {
            animals.add(cat);
        }
        System.out.println("---------------------ArrayList---------------");
        for(PetAnimal animal : animals) {
            System.out.println(animal);
        }
        animals.sort(new AnymalByAgeComparator(Order.ASCENDING));
        System.out.println("--------------------Ascending sorted-------------");
        animals.forEach(System.out::println);
        animals.sort(new AnymalByAgeComparator(Order.DESCENDING));
        System.out.println("--------------------Descending sorted-------------");
        animals.forEach(System.out::println);
    }
}
