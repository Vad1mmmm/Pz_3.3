package pet_animal;

import java.time.LocalDate;

public abstract class PetAnimal {
    private String name;
    private LocalDate yearOfBirth;

    public PetAnimal(String name, LocalDate yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return yearOfBirth.getYear();
    }
    public abstract void sleep();
    public abstract void makeSound();
}

