package chapter_04;

/*Write a program that prompts the user to enter a year and the first three letters of a month name 
 * (with the first letter in uppercase) and displays the number of days in month.
 * Don't forget to check for the leap years.
 */


import java.util.Scanner;

public class Exercise_04_17 {

	public static void main(String[] args) {
		
		//Prompts the user to enter a year and the first letters of a month
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		System.out.println("Enter first three letters of a month: ");
		String month = input.next();
		
		//Check for leap year
		boolean leapYear = (( year % 4 == 0 ) && (year % 100 != 0)) || (year % 400 == 0);
		
		//Display the number of days in a month
		System.out.println(month + " " + year + " has " );
		
		if ( month.equals("Jan") || month.equals("Mar") || 
				  month.equals("May") || month.equals("Jul") ||
				  month.equals("Aug") || month.equals("Oct") ||
				  month.equals("Dec"))
				System.out.println(31 + " days");
			else if (month.equals("Apr") || month.equals("Jun") || 
				month.equals("Sep") || month.equals("Nov"))
				System.out.println(30 + " days");
			else
				System.out.println(((leapYear) ? 29 : 28) + " days");
		
	}

}
