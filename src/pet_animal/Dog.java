package pet_animal;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Random;

public class Dog  extends PetAnimal implements Comparable<Dog> {
    private int scaredAwayThievesCount = new Random().nextInt(getAge())*getAge() + 1;

    public Dog(String name, LocalDate yearOfBirth) {
        super(name, yearOfBirth);
    }

    public int getScaredAwayThievesCount() {
        return scaredAwayThievesCount;
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep - Zzzzz");
    }
    @Override
    public  void makeSound() {
        System.out.println("Dog making sound - Gav Gav");
    }
    @Override
    public String toString() {
        return "Name: " + getName() + ", age: " + getAge() + ", scared away thieves: " + scaredAwayThievesCount;
    }
    @Override
    public int compareTo(Dog o) {
        return Integer.compare(this.getScaredAwayThievesCount(), o.getScaredAwayThievesCount());
    }
}
