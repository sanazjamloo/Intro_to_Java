package chapter_10;


/* 10.26 Miscellaneous (OOPCalculaor):	Convert your Midterm Project – A Simple
Calculator Program-- into a class based program, using your knowledge of Object
Oriented Programming techniques. Meaning, with proper state and behaviors (and
without static variables and static methods).

Write a OOPCalculator class, by giving it proper states and behaviors. For example, you
can have menuChoice, firstFloat, secondFloat as member variables. You can give it
behaviors like, askCalcChoice, askTwoValues, displayResults to get the choice from
users, to get the numbers and display the calculation results respectively. 

All of the code written for calculation needs to be properly placed within these methods of the
OOPCalculator class. For example: askCalcChoice first displays the menu, prompts the 
user to input the choice, and then waits until user presses enter. Once a valid input is
entered, it returns the choice (between 1 to 5 or A for addition, S for subtraction, M for
multiplication, D for division or X for exit). Similarly, other methods will implement rest
of the behaviors. The users of your OOPCaluclator class do not need to know internal
details of how you have implemented your behaviors. These are the only public
interface exposed to the users, rest of the details stays with OOPCalculator class.*/
 

import java.util.Scanner;
import java.util.InputMismatchException;

public class NewTestOOPCalculator {

	public static void main(String[] args) {
		NewOOPCalculator calc = new NewOOPCalculator();
		int menuChoice; 
		float firstFloat, secondFloat;
		menuChoice = calc.askCalcChoice();
		while (menuChoice!=5) {
		float myFloats[] = calc.askTwoFloats(menuChoice);
		firstFloat = myFloats[0];
		secondFloat = myFloats[1];
		calc.displayResults(menuChoice,firstFloat,secondFloat);
		calc.userWait();
		menuChoice = calc.askCalcChoice();
		} 
	System.out.println( "Thank you for using Sanaz’s Handy Calculator! Goodbye. ");
		}
}//end NewTestOOPCalculator


	class NewOOPCalculator {
		//Method to get user's choice from the menu
	public int askCalcChoice() {
		int menuChoice ; // class variable
        System.out.println("  *** Welcome to Sanaz's Handy Calculator! ***");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		System.out.println();
		Scanner input = new Scanner(System.in); // open scanner one time
		do {
			System.out.println("What would you like to do?");
			try {
				menuChoice = input.nextInt();
				if (menuChoice >= 1 && menuChoice <= 5) {
				break;
				} 
				else 
				{
				System.out.println("You have not enteretd a choice between 1 and 5. Please try again.");
				continue;	
				}
			} catch (final InputMismatchException e) {
				System.out.println("You have entered an invalid choice. Plaease Try again.");
				input.nextLine();
				continue;
			}
		} while (true); 
		input.nextLine();

		System.out.printf("You entered valid choice %d\n", menuChoice);
		System.out.println("Thank you for giving your choice");
		System.out.println();
		
		return menuChoice;	
	}

	public float[] askTwoFloats(int userChoice)  {

			float myFloats[] = new float[2];
			Scanner readInput = new Scanner(System.in); //open scanner
		do {
		
			System.out.print("Enter two floats separated by a space: ");

		try {
					myFloats[0] = readInput.nextFloat(); 
					myFloats[1] = readInput.nextFloat();
					
			if ((userChoice == 4) && (myFloats[1]== 0)) {
				System.out.println("You can’t divide by zero, So please re-enter");
				readInput.nextLine();
				continue;
			} 
					 
				break;
			} // end try
			catch (final InputMismatchException e) 
			{
				System.out.println("You have entered an invalid input. Try again.");
				readInput.nextLine();
				continue;
			}
		} while (true);
		
		readInput.nextLine(); // this gives the user the option to try again.  Must be declared after while.
		return myFloats;	
	}
	
	public void displayResults(int menuChoice,float firstFloat,float secondFloat) {
		
		float result;
		
		switch(menuChoice) {
		case 1:
			result = firstFloat + secondFloat;
			System.out.printf("The result of adding %5.2f",firstFloat);
			System.out.printf(" and %3.2f", secondFloat);
			System.out.printf(" is %5.2f", result);
			System.out.println();
			System.out.println();
			break;
		case 2:
			result = firstFloat - secondFloat;
			System.out.printf("The result of subtracting %5.2f",firstFloat);
			System.out.printf(" and %3.2f", secondFloat);
			System.out.printf(" is %5.2f", result);
			System.out.println();
			System.out.println();
			break;
		case 3:
			result = firstFloat * secondFloat;
			System.out.printf("The result of multiplying %5.2f",firstFloat);
			System.out.printf(" and %3.2f", secondFloat);
			System.out.printf(" is %5.2f", result);
			System.out.println();
			System.out.println();
			break;
		case 4:
			result = firstFloat / secondFloat;
			System.out.printf("The result of dividing %5.2f",firstFloat);
			System.out.printf(" and %3.2f", secondFloat);
			System.out.printf(" is %5.2f", result);
			System.out.println();
			System.out.println();
			break;
		}	
}
	public void userWait() {
		Scanner input = new Scanner(System.in); //open scanner one time.
		System.out.println("Press enter key to continue ....");
		System.out.println();
		input.nextLine();
	}//end userWait
	
}// end NewOOPCalculator

