package model; 

public class Cat implements Animal {
    @Override
    public String getSpecies() {
        return "Cat";
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }
}
