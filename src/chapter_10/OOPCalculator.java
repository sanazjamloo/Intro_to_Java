package chapter_10;

/*Write a OOPCalculator class, by giving it proper states and behaviors. For example, you
can have menuChoice, firstFloat, secondFloat as member variables. You can give it
behaviors like, askCalcChoice, askTwoValues, displayResults to get the choice from
users, to get the numbers and display the calculation results respectively. 
All of the code written for calculation needs to be properly placed within these methods
 of the OOPCalculator class. For example: askCalcChoice first displays the menu, prompts the 
user to input the choice, and then waits until user presses enter. Once a valid input is
entered, it returns the choice (between 1 to 5 or A for addition, S for subtraction, M for
multiplication, D for division or X for exit). Similarly, other methods will implement rest
of the behaviors. The users of your OOPCaluclator class do not need to know internal
details of how you have implemented your behaviors. These are the only public
interface exposed to the users, rest of the details stays with OOPCalculator class.*/



import java.util.Scanner;
import java.util.InputMismatchException;



public class OOPCalculator {
	
	//Getting the user choice from the menu
	public void askCalcChoice (Scanner input) {
		int userChoice;
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
			 System.out.println("You have entered an invalid choice. Try again.");
			 input.nextLine();	
		 continue;
		 }
		 	} while (true);
		} //end askCalcChoice
		
		
		public float [] askTwoValues (int calcOption, Scanner input) {
			//System.out.println("Enter two numbers separated by space: ");
			float floatNumbers[] = { -999999, -999999 };
			do {
					String calcOperation = (calcOption == 1) ? "add"
												: (calcOption == 2) ? "subtract"
												: (calcOption == 3) ? "multiply"
												: "divide";
			System.out.printf("\nPlease enter two numbers separated by a space:",calcOperation);
			if (input.hasNextFloat()) {
					floatNumbers[0] = input.nextFloat();
			if (input.hasNextFloat()) {
					floatNumbers[1] = input.nextFloat();
			if (floatNumbers[1] == 0
					&& calcOperation.equalsIgnoreCase("divide")) {
			// Print error for dividing by zero
			System.out.printf("Cannot divide by zero. Please try again.\n");
			floatNumbers[1] = -999999; // reset it
				}
			} else
			System.out.print("Invalid floats. Please re-enter.\n"); 
			//Print error for non-numeric value
			} else
			System.out.print("Invalid floats. Please re-enter.\n"); 
			//Print error for non-numeric value
			// no matter what, clear the buffer
			input.nextLine();
			} while (floatNumbers[0] == -999999 || floatNumbers[1] == -999999);
			return floatNumbers;
		}//end askTwoValues
		
		public void sum () {

	
	
		}

		
		
		
		
		
		
		
		
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in); //create Scanner object one time
			int calcOption = 0;
			OOPCalculator myCalculate = new OOPCalculator();
			myCalculate.askCalcChoice(input);
			myCalculate.askTwoValues(calcOption, input);
			myCalculate.sum();
			input.close(); //close Scanner one time

			
		}// end main
	
	

}// end OOPCalculator
