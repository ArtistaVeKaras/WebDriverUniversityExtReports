package javaBasics;

import java.util.Scanner;

public class InstantCreditCheck {

	/*
	 * Write a instant credit check program that approves 
	 * anyone who makes more than $25.000 and gas credit score
	 * of 700 or better. Reject all others.
	 * */
	
	//Initialise what we know
	static double requiredSalary = 25.000;
    static int requiredScore = 700;
    public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		double salary = getSalary();
		int creditScore = getScore();
		scanner.close();
		
		//check if the user is qualified
		boolean qualifed = isUserQulifed( creditScore, salary);
	
		//Noffied the user
		notifyUser(qualifed);

	}
		public static double getSalary() {
			System.out.println("Please enter your salary:");
			int salary = scanner.nextInt();
			return salary;
	}
		
		public static int getScore() {
			System.out.println("Please enter your credit score:");
			int score = scanner.nextInt();
			return score;
		}
	
	public static boolean isUserQulifed(int creditScore, double salary) {
		if(salary >= requiredSalary && creditScore>= requiredScore) {
			return true;
		}
		else {
			return false;
		}
		
	} 
	public static void notifyUser(boolean isUserQulifed){
		if(isUserQulifed) 
			System.out.println("Congrats! You qualify for Credit Score :-)");
			else {
				System.out.println("Sorry you don't qualify for Credit :-(");
		}
	}	
}
