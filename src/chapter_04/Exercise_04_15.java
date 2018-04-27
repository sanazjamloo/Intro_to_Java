package chapter_04;

/* The international letter/number mapping found on the phones assigns three letters for each number key.  
 * Write a program that prompts the user to enter a letter and displays its corresponding number.
 * Note that, buttons 0 and 1 do not have any alphabets, so, you don't have to worry about them
 */

import java.util.Scanner;

public class Exercise_04_15 {

	public static void main(String[] args) {
		
		// Scanner object to prompt the user to enter a number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		
		String s = input.nextLine();
		char ch = s.charAt(0);
		ch = Character.toUpperCase(ch);
		
		//Display its corresponding number
		int number = 0;
		if (Character.isLetter(ch)) {
			
			if (ch >= 'W') 
				System.out.println("The corresponding number is 9.");
			else if (ch >= 'T')
				System.out.println("The corresponding number is 8.");
			else if (ch >= 'P')
				System.out.println("The corresponding number is 7.");
			else if (ch >= 'M')
				System.out.println("The corresponding number is 6.");
			else if (ch >= 'J')
				System.out.println("The corresponding number is 5.");
			else if (ch >= 'G')
				System.out.println("The corresponding number is 4.");
			else if (ch >='D')
				System.out.println("The corresponding number is 3.");
			else if (ch >= 'A')
				System.out.println("The corresponding number is 2.");
		}
		else
			System.out.println(ch + " is an invalid input.");
		
	}

}
