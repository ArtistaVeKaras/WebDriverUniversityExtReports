package javaBasics;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Create an obj in order to call the other methods because the methods are not static
        //In Java constructors are declared by default implicitly
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);

         scanner.close();
    }

    public Rectangle getRoom(){

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

   public double calculateArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
   }
}
