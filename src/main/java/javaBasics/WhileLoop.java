package javaBasics;

import java.util.Scanner;

public class WhileLoop {

	/*
	 * While loop
	 * Each store employee makes $15 an hours. Write a program that allows the employee
	 * to enter the number of hours worked for the week. Do not allow overtime.
	 * */
	public static void main(String[] args) {

			//Initialize know variable
		   int rate = 15;
		   int maxHours = 40;
		   
		   System.out.println("Please enter the amount of hours worked this week: ");
		   Scanner scanner = new Scanner(System.in);
		   int hoursWorked = scanner.nextInt();
		   
		   while(hoursWorked > maxHours) {
			   System.out.println("Invalid entry. Please enter a number between 1 to 40. Try again! ");
			   hoursWorked = scanner.nextInt();
			   
		   }
		   
		   scanner.close();
		   
		   //Calculate the gross
		   int grossPay = hoursWorked * rate;
		   System.out.println("Your grossPay for this week is: " + grossPay);
	}
}
