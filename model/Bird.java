package model;

public class Bird implements Animal {
    @Override
    public String getSpecies() {
        return "Bird";
    }

    @Override
    public String makeSound() {
        return "Tweet!";
    }
}
 