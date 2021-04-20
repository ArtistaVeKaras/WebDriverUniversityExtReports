package javaBasics;

import java.util.Scanner;

public class InstantCreditCheck {

	/*
	 * Write a instant credit check program that approves 
	 * anyone who makes more than $25.000 and has credit score
	 * of 700 or better. Reject all others.
	 * */
	
	//Initialise what we know (Global Variables)
	static double requiredSalary = 25.000;
    static int requiredScore = 700;
    public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		double salary = getSalary();
		int creditScore = getScore();
		scanner.close();
		
		//check if the user is qualified
		boolean qualified = isUserQualified(salary, creditScore);
	
		//Notified the user
		notifyUser(qualified);

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

	/**
	 *
 	 * @param salary Compares if the current salary is equal or greater than the required Salary
	 * @param creditScore Compares if the user creditScore is greater than the required Credit Score
	 * @return Returns boolean value
	 */
	public static boolean isUserQualified(double salary, int creditScore) {
		if(salary >= requiredSalary && creditScore>= requiredScore)
			return true;
		else {
			return false;
		}
	}

	public static void notifyUser(boolean isUserQualified){
		if(isUserQualified)
			System.out.println("Congrats! You qualify for Credit Score :-)");
			else {
				System.out.println("Sorry you don't qualify for Credit :-(");
		}
	}	
}
