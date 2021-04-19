package javaBasics.javaBasicTwo.chapter10.fruitChallenge;

public class Fruit {

    protected int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void makeJuice(){
        System.out.println("Juice is made");
    }
}
