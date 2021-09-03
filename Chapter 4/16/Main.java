import java.util.Scanner;
import java.io.*;  // Needed for Scanner class

/**
   This program demonstrates a solution to the
   Distance Traveled programming challenge.
*/

public class Main
{
   public static void main(String[] args) throws IOException
   {
      double speed;        // The vehicle's speed
      int maxHours;        // Max number of hours traveled
      int period;          // To count time periods
             
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
			File file = new File("test.txt");
			PrintWriter pw = new PrintWriter(file);
      
      // Get the speed.
      System.out.print("Enter the vehicle's speed: ");
      speed = keyboard.nextDouble();
      
      // Validate the speed.
      while (speed < 0)
      {
         System.out.print("Enter 0 or greater for speed: ");
         speed = keyboard.nextDouble();
      }
      
      // Get the number of hours.
      System.out.print("Enter the number of hours the " +
                       "vehicle was in motion: ");
      maxHours = keyboard.nextInt();

      // Validate the hours.
      while (maxHours < 1)
      {
         pw.print("Enter 1 or greater for hours: ");
         maxHours = keyboard.nextInt();
      }
      
      // Display the table header.
      pw.println("Hour\tDistance Traveled");
      System.out.println("----------------------------------");
      
      // Display the table of distances.
      period = 1;
      while (period <= maxHours)
      {
         // Display the distance for this period.
         pw.println(period + "\t\t" + period * speed);
         
         // Increment period.
         period++;
      }

			keyboard.close();
			pw.close();
   }
}
