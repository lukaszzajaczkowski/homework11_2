package pl.testuj;

import pl.testuj.oop.Animal;
import pl.testuj.oop.Cat;
import pl.testuj.oop.Dog;
import pl.testuj.oop.Elephant;

public class Main {

    public static void main(String[] args) {
	// Animal animal = new Animal(); -> klasa Animal jest abstrakcyjna, więc nie mogę stworzyć jej instancji

        Cat cat = new Cat();

        Dog dog = new Dog();

        Dog dog2 = new Dog();

        System.out.println("---------");

        Animal animalDog = new Dog();
        Animal animalCat = new Cat();
        animalDog.useVoice(); //

        Animal[] animals = new Animal[4];
        animals[0] = dog;
        animals[2] = dog2;
        animals[1] = cat;
        animals[3] = new Elephant();

        System.out.println("Początek pętli animals");

        for (int i = 0; i < animals.length; i ++) {
            System.out.print(animals[i].getAnimalVoice());
            animals[i].useVoice();
        }

        System.out.println("Koniec pętli animals");
    }

    public static void displayText(Animal animal) {
        animal.useVoice();
    }
}
