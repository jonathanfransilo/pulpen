package model; 

public class Dog implements Animal {
    @Override
    public String getSpecies() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }
}
