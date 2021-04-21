package javaBasics.fruitChallenge;

public class Apple extends Fruit{

    @Override
    public void makeJuice(){
        System.out.println("Make an apple juice!");
    }

    public void removeSeeds(){
        System.out.println("Remove the seeds");
    }

    public void peel(){
        System.out.println("Peel the fruit!");
    }
}
