package javaBasics;

import java.util.Scanner;

public class TestResult {

	public static void main(String[] args) {

		
		//Get the test score
		System.out.println("Enter your grade score:");
		Scanner  scanner = new Scanner(System.in);
		double score = scanner.nextDouble();
		scanner.close();
		
		//Determine the Grades
		char grade;
		
		if(score < 60) {
			grade = 'E';
		}else if(score < 70){
			grade = 'D';
		}else if(score < 80) {
			grade = 'C';
		}else if(score <90){
			grade = 'B';
		}
		else {
			grade = 'A';
		}
		System.out.println("Your grade is " + grade);	
	}

}
