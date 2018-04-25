package chapter_02;

/* ShowCurrentTime.java gives a program that displays the current time in GMT.
 * Revise the program so that it prompts the user to enter the time zone offset to GMT 
 * and displays the time in the specified time zone.
 */


import java.util.Scanner;

public class Exercise_02_08 {

	public static void main(String[] args) {

				//Create a new Scanner object
				Scanner input = new Scanner(System.in);
				
				//Prompt user to input a number
				System.out.println("Enter the time zone offset to GMT: ");
				int offset = input.nextInt();
				
				//Get the total milliseconds since midnight Jan 1, 1970
				long totalMilliSeconds = System.currentTimeMillis();
				
				//Get the total seconds since midnight Jan 1, 1970
				long totalSeconds = totalMilliSeconds / 1000;
				
				//Get the current second in the minute in the hour 
				long currentSecond = totalSeconds % 60;
				
				//Get the total minutes
				long totalMinutes = totalSeconds / 60;
				
				//Get the current minutes
				long currentMinute = totalMinutes % 60;
				
				//Get the total hours
				long totalHours = totalMinutes / 60;
				
				//Get the current hour 
				long currentHour =  totalHours %24;
				currentHour = currentHour + offset;
				
				//Print the result
				
				System.out.println("The current time is:" + currentHour + ":" + currentMinute + ":" + currentSecond);	


	}

}
