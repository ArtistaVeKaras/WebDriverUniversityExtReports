package javaBasics;

import java.util.Scanner;

public class GrossPayCalculator {
	
	public static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		
		seasonOfTheYear();
		
//		Get the number of hours worked
		System.out.println( "Please enter a number of hours worked:");
		int hours = scanner.nextInt();

		//Get the hourly pay rate
		System.out.println("Please enter the employee's pay rate:");
		double rate = scanner.nextDouble();
		scanner.close();

		//Multiply hours and pay rate
		double grossPay  = hours * rate ;

		//Display result
		System.out.println("The employee pay rate is £" + grossPay);
	}
	
	public static void seasonOfTheYear() {	
		System.out.print("Please enter a season of the year:");
		String season =  scanner.nextLine();
		
		System.out.print("Please enter a whole number:");
		int num = scanner.nextInt();

		System.out.print("Please enter an adjective:");
		String adjective = scanner.nextLine();
		
		System.out.println("On a " +adjective+ " "+season+ " day, I drink a minimum of" +num+ " cups of coffee.");
	}

}
