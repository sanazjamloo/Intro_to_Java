package finalProject;



public class TestLetterGrader {
	
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.printf("Argument %d: %s\n", i+1, args[i]);
		}	
		LetterGrader letterGrader =  new LetterGrader (args[0], args[1] );  //LetterGrader is the main class
		                                           //args[0] is input file and args[1] is the output file.
		letterGrader.readScore();                 // reads scores and stores the data in member variables
		letterGrader.calcLetterGrade();          //determines letter grade and stores information
		letterGrader.printGrade();              //writes the grade into output file
		letterGrader.displayAverages();        //displays the averages in console
		letterGrader.doCleanup();             //use it to close files and other resources
	} // end main

} //end testLetterGrader
