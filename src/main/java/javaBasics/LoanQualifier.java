package javaBasics;

import java.util.Scanner;

/*
 * NESTED IFs:
 * To qualify for a loan, a  person must make a least $30.000
 * and have been working at their current job for at least 2 years.
 * */
public class LoanQualifier {

	public static void main (String[] args) {
		
		//Initialize what we know
		double requiredSalary = 30.000;
		int requiredYears = 2;
		
		//Get what we don't know
		System.out.println("What is your annually salary?");
		Scanner scanner = new Scanner(System.in);
		double currentSalary = scanner.nextDouble();
		
		System.out.println("How long have you been working at your current job?");
		int yrsCurrentJob = scanner.nextInt();
		
		scanner.close();
		
		/* nested if statement
		 * the same as the above
		 * but uses the logical operator upperSand 
		 * */
		if (currentSalary >= requiredSalary &&  yrsCurrentJob >= requiredYears)
			System.out.println("Congrats! You do qualify for a loan");
			else {
				System.out.println("Sorry you must earn at least £"+ requiredSalary+" and work at your current job at least "+requiredYears+" years to qualify for a loan.");
			}
	}
	
}
