package javaBasics.javaBasicTwo.chapter10.chapterAnimal;

public class Dog extends Animal {

    @Override
    public void makeSound(){
        System.out.println("woof");
    }

    public void fetch(){
        System.out.println("fetch is fun!");
    }
}
