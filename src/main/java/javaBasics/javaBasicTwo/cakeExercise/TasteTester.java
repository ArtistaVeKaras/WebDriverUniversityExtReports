package javaBasics.javaBasicTwo.cakeExercise;

public class TasteTester {

    public static void main(String[] args) {

        BirthdayCake cake = new BirthdayCake();
        cake.setFlavour("caramel");
        cake.setCandles(30);

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setTiers(4);
        weddingCake.setFlavour("vanilla");

        System.out.println("The flavour is: " +cake.getFlavour() +" "+ "with" +" "+ cake.getCandles()+" "+ "candles and "+ weddingCake.getTiers() +" "+ "tiers") ;
    }
}
