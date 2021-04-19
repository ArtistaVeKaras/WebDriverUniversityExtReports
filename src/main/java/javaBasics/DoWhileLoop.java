package javaBasics;

import java.util.Scanner;

/*
 * Do while loop 
 * write a program that allows  a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to 
 * repeat this action until they indicate they are done.
 * */

public class DoWhileLoop {

	public static void main(String[] args) {
					
			Scanner scanner = new Scanner(System.in);
			
			boolean again ;
			
			do {
				System.out.println("Please enter a number");
				int num = scanner.nextInt();
				
				System.out.println("Please enter a new number");
				int num1 = scanner.nextInt();
				
				int sum = num + num1;
				
				System.out.println("The sum of your numbers is: "  +sum);
				
				System.out.println("Would like to start again. Type True or False " );
				again = scanner.nextBoolean();
			}
			while(again);
			scanner.close();
		}
	}

