package driver;

import java.util.Scanner;
import model.Animal;
import model.AnimalType;
import model.Cat;
import model.Dog;
import model.Bird;

/*
 *  12S22036-Jonathan Fransilo Hutabarat
 */

public class AnimalDriver{
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        System.out.println("Pilih jenis hewan (0: Anjing, 1: Kucing, 2: Burung): ");
        int choice = scanner.nextInt();
        AnimalType animalType = null;

        switch (choice) {
            case 0:
                animalType = AnimalType.DOG;
                break;
            case 1:
                animalType = AnimalType.CAT;
                break;
            case 2:
                animalType = AnimalType.BIRD;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        if (animalType == AnimalType.DOG) {
            System.out.println("Suara Anjing: " + dog.makeSound());
        } else if (animalType == AnimalType.CAT) {
            System.out.println("Suara Kucing: " + cat.makeSound());
        } else if (animalType == AnimalType.BIRD) {
            System.out.println("Suara Burung: " + bird.makeSound());
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
