package javaBasics.interfaceChallenge;

public class Farm {

    public static void main(String[] args) {

        Animal animal = new Pig();
        animal.makeSound();
        animal.eat();

        Animal duck = new Duck();
        duck.makeSound();
        duck.eat();
    }
}
