package ExtraHomework;


import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;


public class Exercise5 {
	
	public static void processCLArguments (String[] args) {
		//check if the user gave command line arguments
		if (args.length < 2) {
			System.out.println("Usage: Java Exercise 5 inputFile outputFile");
			System.exit(1);
	}	else {
			System.out.println("Input will be read from:" + args[0] );
			System.out.print("Ouput will be written into:" + args[1]);
			System.out.println();
		}	
	}//end processCLArguments
	
	public static void processInputOutputFiles (String[] args) {
		//create a file instance
		File inputFile= new File (args[0]);
		if (!inputFile.exists()) {
			System.out.println("Input file " + args[0] + " does not exist");
			System.exit(2); //indicates abnormal exit 
		}
		
	//Create output file instance	
	File outputFile = new File (args[1]); 
		try {
			//create input and output files
			Scanner input  = new Scanner(inputFile);
			PrintWriter output = new PrintWriter(outputFile);
			int i = 1;
			while (input.hasNextLine()) {
				String line = input.nextLine();
				//Display the whole line on the screen
				System.out.println("Student #: " + i + " " + line);
				// This line has one student's data
				//use split to separate the grades by comma
				String [] studentInfo = line.split(",");
				// write the data in output file 
				// i represents the name of the student + student's grades (the whole line)
				output.print("Student #" + i++ + "is: \"" + studentInfo[0] + "\" whose raw scores are: ");
				//j represents the scores or marks of the student which starts from index number of 1
				for ( int j = 1;  j < studentInfo.length; j++) {
					output.print(studentInfo[j] + ": ");
					output.println(); // one student done, give a line feed.
				}
			}// end while loop
			input.close(); //done with the loop
			output.close();	
		} catch (IOException e ) {
			System.out.println( " Error reading from input file: " + args[0]);	
		}// end catch
		
	}//end processInputOutputFiles
	
	
	
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.printf("Argument %d: %s\n" , i+1, args[i]);
		}
		processCLArguments(args);
		processInputOutputFiles(args);
		
	}// end main


}// end Exercise5




