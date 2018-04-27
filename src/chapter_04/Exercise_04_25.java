package chapter_04;

/*Assume a vehicle plate number consists of three uppercase letters followed by four digits.  Write a program
 * to generate a plate number. Use random method approach to generate letters and digits.
 */

public class Exercise_04_25 {

	public static void main(String[] args) {
		
		
		//Generating random letters
	    StringBuilder s = new StringBuilder();
	    for (int i = 0; i < 3; i++) {
	        char ch = (char) (Math.random() * 26 + 'A');
	        s.append(ch);
	    }
	    //Generating random numbers
	    for (int i = 0; i < 4; i++) {
	        char digit1 = (char) (Math.random() * 10 + '0');
	        s.append(digit1);
	    }
	    System.out.println("Random vehicle plate number: " + s);
		

	}

}
