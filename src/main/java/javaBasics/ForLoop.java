package javaBasics;

import java.util.Scanner;

public class ForLoop {
	
/*
 * For Loop:
 * Write a cashier program that will scan a given number of items and tally the coast.
 * */
	public static void main(String[] args) {

		//Get number of items to scan
		System.out.println("Enter the number of items you would like to scan:");
		Scanner scanner = new Scanner(System.in);
		int quantity = scanner.nextInt();
		
		double total = 0;
		
		//Create loop to iterate through all of the items and accumulate the coasts
		for(int i=0; i< quantity; i++) {
			System.out.println("Enter the cost of the item:");
			double price = scanner.nextDouble();
			
			total = total +price;
		
		}
		
		scanner.close();
		
		System.out.println("The total is $: "+total);
	}
}
