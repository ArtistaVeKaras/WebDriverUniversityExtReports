package javaBasics;

import java.util.Scanner;

public class LoopBreak {

	/*
	 * Loop Break 
	 * Search a string to determine if it contains the letter 'a'
	 * */
	public static void main(String[] args) {

		//Get the text
		System.out.println("Please enter a word");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		scanner.close();
		
		boolean letterFound = false;
		
		for(int i=0;  i<text.length();  i++) {
			char currentLetter = text.charAt(i);
			if( currentLetter == 'A' || currentLetter == 'a' ) {
				letterFound = true;
				break;
			}
		}
		if(letterFound) 
			System.out.println("This text contins the letter 'A' ");
			else {
				System.out.println("This letter does not contain the letter 'A' ");
			}
	}

}
