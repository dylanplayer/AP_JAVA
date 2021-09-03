import java.util.Scanner; // Needed for the Scanner class

/**
   This program demonstrates a solution to the 
   Test Average programming challenge.
*/

public class Main
{
   public static void main(String[] args)
   {
      double test1;     // Test score #1
      double test2;     // Test score #2
      double test3;     // Test score #3
      double average;   // Average of the test scores
             
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the first test score.
      System.out.print("Enter test score #1: ");
      test1 = keyboard.nextDouble();
      
      // Get the second test score.
      System.out.print("Enter test score #2: ");
      test2 = keyboard.nextDouble();
      
      // Get the first test score.
      System.out.print("Enter test score #3: ");
      test3 = keyboard.nextDouble();

      // Calculate the average.
      average = (test1 + test2 + test3) / 3.0;
      
     
      // Display the average.
      System.out.println("Test average: " + average);

      //if the average is higher than 95, congratulate the user. "That's a great score!"

      if(average > 95){

        System.out.println("That's a great score!");

      }

           }
}
