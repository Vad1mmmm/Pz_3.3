package main;

import pet_animal.*;
import sorter.AnymalByAgeComparator;
import sorter.Order;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Max", LocalDate.of(2015, 6, 10)));
        dogs.add(new Dog("Buddy", LocalDate.of(2013, 4, 22)));
        dogs.add(new Dog("Charlie", LocalDate.of(2017, 8, 15)));
        dogs.add(new Dog("Rocky", LocalDate.of(2019, 12, 2)));
        dogs.add(new Dog("Cooper", LocalDate.of(2014, 2, 28)));
        dogs.add(new Dog("Duke", LocalDate.of(2016, 11, 5)));

        System.out.println("--------------Array dogs---------------------");
        dogs.forEach(System.out::println);

        System.out.println("-------------------Sorted dogs--------------------");
        dogs.sort(Dog::compareTo);
        dogs.forEach(System.out::println);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Luna", LocalDate.of(2012, 9, 14)));
        cats.add(new Cat("Milo", LocalDate.of(2016, 3, 7)));
        cats.add(new Cat("Oliver", LocalDate.of(2018, 7, 20)));
        cats.add(new Cat("Leo", LocalDate.of(2014, 11, 30)));
        cats.add(new Cat("Bella", LocalDate.of(2013, 1, 18)));

        System.out.println("------------------Array cats---------------------");
        cats.forEach(System.out::println);

        System.out.println("-----------------------Sorted cats--------------------");
        cats.sort(Cat::compareTo);
        cats.forEach(System.out::println);

        ArrayList<PetAnimal> animals = new ArrayList<>();
        animals.addAll(dogs);
        animals.addAll(cats);

        System.out.println("---------------------Array All animals---------------------");
        animals.forEach(System.out::println);

        animals.sort(new AnymalByAgeComparator(Order.ASCENDING));
        System.out.println("--------------------Ascending sorted-------------");
        animals.forEach(System.out::println);

        animals.sort(new AnymalByAgeComparator(Order.DESCENDING));
        System.out.println("--------------------Descending sorted-------------");
        animals.forEach(System.out::println);
    }
}
