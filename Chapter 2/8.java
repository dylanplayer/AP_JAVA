import java.util.Scanner;
import java.math.*;
// TASK #2 Add an import statement for the Scanner class
// TASK #2(Alternate)
// Add an import statement for the JOptionPane class
/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/
public class Main
{
   public static void main (String [] args)
   {
	   Scanner scan = new Scanner(System.in); // TASK #2 Create a Scanner object here
       // (not used for alternate)
	   // Identifier declarations
	   final int NUMBER = 2 ;//Number of scores
	   final int SCORE1 = 100;// First test score
	   final int SCORE2 = 95; // Second test score
	   final int BOILING_IN_F = 212; // Boiling temperature
	   int fToC;// Temperature Celsius
	   double average;// Arithmetic average
	   String output;// Line of output

	   String firstName;// TASK #2 declare variables used here
	   String lastName;
	   String fullName;
	   char firstInitial;// TASK #3 declare variables used here
	   String firstUpperCase;
	   double sphereDiameter;// TASK #4 declare variables used here
	   double sphereRadius;
	   double pi = Math.PI;
	   double sphereVolume;
	   // Find an arithmetic average.
	   average = (SCORE1 + SCORE2) / NUMBER;
	   output = SCORE1 + " and " + SCORE2 +
         " have an average of " + average;
	   System.out.println(output);
	   // Convert Fahrenheit temperature to Celsius.
	   fToC = (int)((BOILING_IN_F - 32) * .5556);
	   output = BOILING_IN_F + " in Fahrenheit is " +
       fToC + " in Celsius.";
	   System.out.println(output);
	   System.out.println();      // To leave a blank line
	   // ADD LINES FOR TASK #2 HERE
	   System.out.print("Enter your first name: ");// Prompt the user for first name
	   firstName = scan.nextLine();// Read the user's first name
	   System.out.print("Enter your last name: ");// Prompt the user for last name
	   lastName = scan.nextLine();// Read the user's last name
	   fullName = firstName + "" + lastName;// Concatenate the user's first and last names
	   System.out.println(fullName);// Print out the user's full name
	   System.out.println();// To leave a blank line
	   // ADD LINES FOR TASK #3 HERE
	   firstInitial = firstName.charAt(0);// Get the first character from the user's first name
	   System.out.println(firstInitial);// Print out the user's first initial
	   firstUpperCase = firstName.toUpperCase();// Convert the user's full name to uppercase
	   System.out.println(firstUpperCase);// Print out the user's full name in uppercase
	   System.out.println();// To leave a blank line
	   // ADD LINES FOR TASK #4 HERE
	   System.out.print("Enter diamater of sphere: ");// Prompt the user for a diameter of a sphere
	   sphereDiameter = scan.nextDouble();// Read the diameter
	   sphereRadius = sphereDiameter/2;// Calculate the radius
	   sphereVolume = (1.333333334)*(pi)*(sphereRadius * sphereRadius * sphereRadius);// Calculate the volume
	   System.out.println(sphereVolume);// Print out the volume
   }
}
