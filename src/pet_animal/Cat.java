package pet_animal;

import java.time.LocalDate;
import java.util.Random;

public class Cat extends PetAnimal implements Comparable<Cat>{

    private int caughtMiceCount = new Random().nextInt(getAge())*getAge() + 1;;
    public Cat(String name, LocalDate yearOfBirth) {
        super(name, yearOfBirth);
    }

    public int getCaughtMiceCount() {
        return caughtMiceCount;
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeping - Zzzzzz");
    }
    @Override
    public void makeSound() {
        System.out.println("Cat making sound - Myaaaaaauuuu");
    }
    @Override
    public String toString(){
        return "Name: " + getName() + ", age: " + getAge() + ", caught mice count: " + caughtMiceCount;
    }
    @Override
    public int  compareTo(Cat o) {
        return Integer.compare(caughtMiceCount, o.caughtMiceCount);
    }
}
