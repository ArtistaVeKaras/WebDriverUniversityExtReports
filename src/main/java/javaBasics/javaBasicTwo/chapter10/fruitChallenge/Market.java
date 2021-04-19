package javaBasics.javaBasicTwo.chapter10.fruitChallenge;

public class Market {

    public static void main(String[] args) {

//        Fruit seed = new Apple();
//        Fruit seed1 = new Banana();
//        seed1.makeJuice();
//        seed1.setCalories(4400);
//        seed.makeJuice();
//        System.out.println(seed.getCalories());

        /*Create an Object of Apple
        */
        Apple apple = new Apple();
        apple.setCalories(10);
        apple.makeJuice();
        apple.removeSeeds();
        apple.peel();

        /*Create an Object of Banana
         */
        Banana bana = new Banana();
        bana.setCalories(100);
        bana.makeJuice();
        bana.removeSeeds();
        bana.peel();;

        System.out.println(apple.getCalories());
        System.out.println("Apple calories are: " +apple.getCalories() +" "+ "The banana calories are "+bana.getCalories());
    }
}
