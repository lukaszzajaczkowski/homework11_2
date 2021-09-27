package pl.testuj.oop;

public abstract class Animal {
    private static final int NUMBER_OF_ANIMALS = 2; // stała czyli nie można zmienić wartości
    private String name;

    public Animal() {
        System.out.println("Konstruktor klasy Animal");
    }

    public abstract void useVoice();

    public abstract int getAge(int x);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
