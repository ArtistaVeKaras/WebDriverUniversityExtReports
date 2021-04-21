package javaBasics.chapterAnimal;

public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        //Polymorphism
        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound();
    }

    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("here's your dog food");
        }
        else if(animal instanceof Cat){
            System.out.println("here's your cat food!");
        }
    }
}
