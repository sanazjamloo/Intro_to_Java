package chapter_02;

/*
Write a program that reads the sub-total
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for sub-total and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.
*/


import java.util.Scanner;

public class Exercise_02_05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	// Create new Scanner object.

		// Prompt the user to enter the sub-total and the gratuity rate
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();

		// Calculate gratuity and total
		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;

		// Display results
		System.out.println("The gratuity is $" + gratuity +
			" and total is $" + total);
	}

}