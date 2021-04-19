package javaBasics;


import java.util.Scanner;

class Cashier {


    public static void main(String[] args){

        letterSearch();
        System.out.println("Please enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        for(int i =0; i<quantity; i++){

            System.out.println("Enter the coast of each item:");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();
        System.out.println("The total coast is $" +total);
    }

    public static void letterSearch() {

        System.out.println("Please enter some text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        boolean letterFound = false;

        for (int i=0; i<text.length(); i++) {
            char currentLetter = text.charAt(i);

            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("This text does contain the letter the word 'A'");
        }else{
            System.out.println("This test does not contain the letter 'A'");
        }
    }

}