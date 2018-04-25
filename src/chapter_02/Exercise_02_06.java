package chapter_02;

/* Write a program that reads an integer between 0 and 1000 and adds all the digits
 * in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93
 */

import java.util.Scanner;

public class Exercise_02_06 {

	public static void main(String[] args) {
		
		// create a new scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt user to input a number 
		System.out.println("Please enter a number between 0 and 1000:");
		int number = input.nextInt();
		
		// find all digits in a number
		int lastDigit = number % 10;
		int remainingNumber = number / 10;
		int secondLastDigit = remainingNumber % 10;
		remainingNumber = remainingNumber / 10;
		int thirdLastDigit = remainingNumber % 10;
		
		//  Sum up all digits
	    int sum = lastDigit + secondLastDigit + thirdLastDigit;
	    
	    System.out.println(" Sum of the digits for " + number + " is " + sum);
		
		

	}

}
