package HandsOn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sorting_program {
	
	public static int getUserChoice(Scanner  input) {
		int userChoice;
	do {
			System.out.println("Enter a number between 1 to 5 only: ");
		try {
				userChoice = input.nextInt();
				if (userChoice >= 1 && userChoice <= 5) {
				break;
				} else {
					System.out.println("You have not enteretd a number between 1 and 5.  Please try again.");
					continue;	
				}
			} catch (final InputMismatchException e) {
				System.out.println("You have entered an invalid choice.  Try again.");
			input.nextLine();	
			}
			
		} while (true); 
			return userChoice;
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int userChoice;
		
		System.out.println("Welcome to sorting program!");
		userChoice = getUserChoice(input);
		System.out.println("You entered a valid choice.");
		System.out.println("Thank you for giving your choice!" );
		input.close();
		
	
	}

}

























