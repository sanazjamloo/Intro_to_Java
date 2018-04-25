package chapter_01;
/* Write a program that displays the area and perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following formula: 
 * 
 * area =  width x height
 * perimeter = 2 x (height + width)
 * 
 * */



public class Exercise_01_09 {

	public static void main(String[] args) {

		System.out.println("Area of the rectangle is: ");
		System.out.println(4.5 * 7.9);
		System.out.println("Perimeter of the rectangle is: ");
		System.out.println( 2 * (4.5 * 7.9));
		
		
	}

}

// Since the question is asking only to display the result, I did not need to use Scanner object 
//and collect data from the user.