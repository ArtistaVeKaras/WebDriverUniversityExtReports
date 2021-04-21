package javaBasics.fruitChallenge;

public class Banana extends Fruit{

    @Override
    public void makeJuice(){
        System.out.println("Make a banana juice");
    }

    public void removeSeeds(){
        System.out.println("Remove the seeds");
    }

    public void peel(){
        System.out.println("Peel the fruit!");
    }
}
