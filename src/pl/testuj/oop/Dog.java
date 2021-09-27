package pl.testuj.oop;

public class Dog extends Animal {
    public Dog() {
        System.out.println("Konstruktor klasy Dog");
    }

    @Override
    public void useVoice() {
        System.out.println("Woof");
    }

    @Override
    public int getAge(int x) {
        return 0;
    }

    @Override
    public String getAnimalVoice() {
        return AnimalVoice.DOG.getText();
    }
}
