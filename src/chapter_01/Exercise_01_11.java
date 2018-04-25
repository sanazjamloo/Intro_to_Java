package chapter_01;

/* The population project
 * The U.S. Census Bureau projects population based on the following assumptions:
 * 1. One birth every 7 seconds
 * 2. One death every 13 seconds
 * 3. One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five years. Assume
 * the current population is 312,032,486 and one year has 365 days.
 * 
 */

public class Exercise_01_11 {

	public static void main(String[] args) {
		
		// defining variables or storing each value in a variable so we can call them later on.
		int birth = 7;
		int death = 13;
		int immigrant = 45;
		int currentPopulation = 312032486;
		int year = 365;
		
		//calculating population in one year
		int BirthInOneYear = (((year * 24 * 60 * 60) / birth));
		int DeathInOneYear = (((year * 24 * 60 * 60) / death));
		int ImmigrantInOneYear = (((year * 24 * 60 * 60) / immigrant));
		int PopulationInOneYear = (BirthInOneYear + ImmigrantInOneYear - DeathInOneYear);
		
		//printing the population for the next 5 years based on 
		System.out.println("This Year's Population is: " + currentPopulation);
		System.out.println("Population of one year will be: " + (PopulationInOneYear));
		System.out.println("Next year's population will be: " + (currentPopulation + PopulationInOneYear));
		System.out.println("Pouplation in 2 years will be: " + (currentPopulation + (PopulationInOneYear * 2)));
		System.out.println("Pouplation in 3 years will be: " + (currentPopulation + (PopulationInOneYear * 3)));
		System.out.println("Pouplation in 4 years will be: " + (currentPopulation + (PopulationInOneYear * 4)));
		System.out.println("Pouplation in 5 years will be: " + (currentPopulation + (PopulationInOneYear * 5)));


	}

}
