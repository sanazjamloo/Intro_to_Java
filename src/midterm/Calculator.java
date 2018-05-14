package midterm;


/*A Simple Calculator
 * Summary: Write a console program (character based) to do simple calculations
 * (addition, subtraction, multiplication, and division) of two numbers, using
 * your understanding of Java.
 * 
 * Description: You need to write a program that will display a menu when it is run.
 * The menu gives five choices of operation: addition, subtraction, multiplication, 
 * division, and a last choice to exit the program. It then prompts the user to make
 * a choice of calculation they want to do. Once the user selects the operation, it
 * will check for valid menu choices (and give an appropriate message if a wrong choice
 * was selected) and then prompts the user to enter two numbers, separated by a space.
 * If the user enters valid numbers, the program will do the operation desired, and
 * then displays the result. If the user enters invalid numbers, it displays an error 
 * message and asks for the correct input. After displaying the result, it displays
 * "Press Enter key to continue". Once enter key is pressed, it displays the menu again. 
 * The program repeats, until the user selects the choice to exit. 
 * Only static methods.
 */

import java.util.Scanner;
import java.util.InputMismatchException;



public class Calculator {
	
	//Method to get user's choice from the menu
	public static int getUserChoice (Scanner input) {
	int userChoice = 0;
	System.out.println("Welcome to Sanaz's Handy Calculator!");
	do {
	System.out.println("What would you like to do?");
	System.out.println("Enter a number between 1 to 5 only: ");
	System.out.println("1. Additon");
	System.out.println("2. Subtraction");
	System.out.println("3. Multiplication");
	System.out.println("4. Division");
	System.out.println("5. Exit");
	 try {
		 userChoice = input.nextInt();
		 System.out.println("You successfully entered a number: " + userChoice + ".");
	
	if (userChoice >=1 && userChoice <= 4) {
		break; //done with the loop
	 } else if (userChoice == 5) {
			System.out.println("Bye! Thanks for using Sanaz's Calculator.");
			System.exit(0);
			break;
	 } else {
		 System.out. println("You have entered an invalid number.  Please try again.");
		 input.nextLine();
		 continue; 
	 	}			
	 } catch (final InputMismatchException e) {
	System.out.println("You have entered an invalid choice.  Try again.");
	input.nextLine();	
	 continue;
	 }
	 	} while (true);
	return userChoice;
	} //end of getUserChoice
	
	//Method to get two numbers from the user for calculation
	public static double[] getTwoDoubles (Scanner input) { 
		double[] myDoubles= {0,1};
		do { //loop until we have correct input
			System.out.println("Enter two numbers separated by space: ");
			try {
				myDoubles[0] = input.nextDouble();
				myDoubles[1] = input.nextDouble();
				break; 
			} catch (final InputMismatchException e) {
				System.out.println("You have entered an invalid number.  Please try again.");
				input.nextLine();
				continue;
			}
		} while (true);
		return myDoubles;
	} // end of getTwoDoubles
	
	//Method for the calculation
	public static void calculation (int zz, double x, double y) {
	int userChoice = zz; //variable saves the user choice to invoke it later on.
	double result;
	while (userChoice >= 1 && userChoice <= 4) {
	   if (userChoice == 1) {
		result = x + y;
		System.out.println("Addition result is: " + result + ".");
		break;
	} else if (userChoice == 2) {
		result = x - y;
		System.out.println("Subtraction result is: " + result + ".");
		break;
	} else if ( userChoice == 3) {
		result = x * y;
		System.out.println("Multiplication result is: " + result + ".");
		break;
	} else if (userChoice == 4) {
		result = x / y;
		System.out.println("Division result is: " + result + ".");
		break;
	}  else {
		System.out.println("You have entered an invalid number. You should start over.");
	}
	}
}// end of calculation method
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create Scanner one time
		 int z = getUserChoice(input);
		 double[] values=getTwoDoubles(input);
		 calculation( z, values[0], values[1]);
		 input.close(); //close Scanner one time

		
	}//end of main method

	
}// end of Calculator


