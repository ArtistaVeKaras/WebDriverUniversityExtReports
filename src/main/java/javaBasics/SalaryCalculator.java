package javaBasics;

import java.util.Scanner;

public class SalaryCalculator {
	
	/*
	 * If Statement
	 * All Sales people get a payment of $1000 a week.
	 * Sales people who exceed 10 sales get an additional bonus of $250
	 * */
	public static  void main(String args []) {
		
		//Initialize known values
		int salary = 1000;
		int bonus = 250;
		int target = 10;
		
		//Get values for the unknown
		System.out.println("Please enter how many sales you made this week:");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		scanner.close();
		
		//Quick detour for the bonus earners
		if(sales > target) {
			int bonusSalary = salary + bonus;
			System.out.println("Your new salary is £"  + bonusSalary);
		}
		else {
			System.out.println("Sorry you did  not exceed the sales target. Your salary is £" + salary);
		}
	}

}
