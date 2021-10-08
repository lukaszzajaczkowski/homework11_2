package pl.testuj;

import pl.testuj.oop.Animal;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // ZADANIE DOMOWE:
        //a. stworzyć listę zwierząt, dodać zwierzęta, sprawdzić rozmiar i czy lista jest pusta
        //b. stworzyć zbiór: dodać imiona zwierząt z listy (stworzonej podpunkcie a)
        //c. stworzyć mapę: klucz to imię zaś wartość to obiekt. Następnie przejdź pętlą i wyświetl informacje o obiekcie

        List<String> Animals = new ArrayList<String>();

        Animals.add("Krokodyl");
        Animals.add("Tygrys");
        Animals.add("Kaczka");

        System.out.println("Rozwiązanie a:");
        System.out.println("Rozmiar listy: " + Animals.size());
        System.out.println("Czy lista jest pusta? " + Animals.isEmpty());

        System.out.println("Rozwiązanie b:");
        Set<String> AnimalNames = new HashSet<String>();

        AnimalNames.add("Adam");
        AnimalNames.add("Marcin");
        AnimalNames.add("Karol");

        System.out.println(AnimalNames);


        System.out.println("Rozwiązanie c:");
        Map<String, String> AnimalWithName = new HashMap<>();

        AnimalWithName.put("Adam", Animals.get(0));
        AnimalWithName.put("Marcin", Animals.get(1));
        AnimalWithName.put("Karol", Animals.get(2));

        System.out.println(AnimalWithName);


        for (int i = 0; i < AnimalWithName.size(); i++);
        System.out.println(AnimalWithName.values());
        System.out.println(AnimalWithName.keySet());





//        System.out.println(Person.PI);
//
//        Dog pies = new Dog();
//        System.out.println("Wartość pola statycznego count: " + pies.getCount());
//
//        Dog pies2 = new Dog();
//        System.out.println("Wartość pola statycznego count: " + pies.getCount());
//        System.out.println("Wartość pola statycznego count: " + pies2.getCount());
//
//        System.out.println("Wartość pola statycznego count: " + Dog.getNumCount());
//
//        System.out.println("--------");
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


}
