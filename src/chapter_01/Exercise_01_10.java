package chapter_01;
/* Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
 * Write a program that displays the average speed in miles per hour.
 * Note that 1 mile is 1.6 kilometers.
 */

public class Exercise_01_10 {

	public static void main(String[] args) {
		// 14 / 1.6 to convert km to miles
		// 45 minutes and 30 seconds equals 45.5 minutes
		// 45.5 / 60 to convert minutes to hours
		// finally divide miles / hours to get the average speed
		System.out.println( ( 14.0 / 1.6 ) / ( 45.5 / 60 ) );
	}

}
