package pet_animal;

import java.time.LocalDate;

public class Cat extends PetAnimal implements Comparable<Cat>{

    private int caughtMiceCount;
    public Cat(String name, LocalDate yearOfBirth, int caughtMiceCount) {
        super(name, yearOfBirth);
        this.caughtMiceCount = caughtMiceCount;
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
        return "Name: " + getName() + ", year of birth: " + getAge() + ", caught mice count: " + caughtMiceCount;
    }
    @Override
    public int  compareTo(Cat o) {
        return Integer.compare(caughtMiceCount, o.caughtMiceCount);
    }
}
