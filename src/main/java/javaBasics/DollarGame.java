package javaBasics;

import java.util.Scanner;

public class DollarGame {

	public static void main(String[] args) {

		double dollar = 1.00;
		System.out.println("Please enter the how £pennies you have:");
		Scanner scanner = new Scanner(System.in);
		double pennies = scanner.nextInt();
		
		System.out.println("Please enter how £pences you have:");
		double cents = scanner.nextInt();
		
		System.out.println("Please enter how many £pounds you have");
		int pounds = scanner.nextInt();
		scanner.close();
		
		
		double result = pennies + cents + pounds;
		
		
		if(result >= dollar)
		System.out.println("You have $"  +result + "Congrats!! You've won the game!");
		
		else{
			System.out.println("Sorry you are $" +result+ " short of a dollar!");
		}
	}

}
