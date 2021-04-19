package javaBasics;

import java.util.Scanner;

public class QuotaCalculator {

	/*
	 * If else statement
	 * All salespeople are expected to make at least 10 sales each week.
	 * For those who do, they receive a congratulatory message.
	 * For those who don't, they are informed of how many sales they were short.
	 * */
	public static void main(String args []) {
		
		int quota = 10;
		
		System.out.println("Please enter how sales you have made this week:");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		scanner.close();
		
		if(sales >= quota)
			System.out.println("Congrats you have made " + sales + " sales this week");
		
		else {
			int shortSales = sales - quota;
			System.out.println("You did not receive you bonus because your were " + shortSales+ " sales short this week ");
		}
	}
}
