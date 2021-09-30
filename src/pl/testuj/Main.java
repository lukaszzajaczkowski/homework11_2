package pl.testuj;

import pl.testuj.access.Person;
import pl.testuj.oop.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(Person.PI);

        Dog pies = new Dog();
        System.out.println("Wartość pola statycznego count: " + pies.getCount());

        Dog pies2 = new Dog();
        System.out.println("Wartość pola statycznego count: " + pies.getCount());
        System.out.println("Wartość pola statycznego count: " + pies2.getCount());

        System.out.println("Wartość pola statycznego count: " + Dog.getNumCount());

        System.out.println("--------");
//        Person student = new Person();
//        String x = student.getFirstname();
//
//	// Animal animal = new Animal(); -> klasa Animal jest abstrakcyjna, więc nie mogę stworzyć jej instancji
//
//        Cat cat = new Cat();
//
//        Dog dog = new Dog();
//
//        Dog dog2 = new Dog();
//
//        // w polimorfizimie mamy dostęp tylko do metod, które są w klasie bazowej lub interfejsie, który implementujemy
//        Petable petable = new Dog();
//        petable.printMsg();
//
//        System.out.println("---------");
//
//        Animal animalDog = new Dog();
//        Animal animalCat = new Cat();
//        animalDog.useVoice(); //
//
//        Animal[] animals = new Animal[4];
//        animals[0] = dog;
//        animals[2] = dog2;
//        animals[1] = cat;
//        animals[3] = new Elephant();
//
//        System.out.println("Początek pętli animals");
//
//        for (int i = 0; i < animals.length; i ++) {
//            System.out.print(animals[i].getAnimalVoice());
//            animals[i].useVoice();
//        }
//
//        System.out.println("Koniec pętli animals");
//
//        System.out.println("------POLIMORFIZM-----");
//        Dog dogPolimorfizm = new Dog(); // mam dostęp do metod z klasy dog + klasy abstrakcyjnej + w interfejsie
//        dogPolimorfizm.eat();
//
//        Animal animalPolimorfizm = new Dog(); // mogę wywołać tylko metody, które są w klasie abstrakcyjnej
//
//        Petable petablePolimorfizm = new Dog(); // mogę wywołać tylko metody, które są w interfejsie

    }

    public static void displayText(Animal animal) {
        animal.useVoice();
    }
}
