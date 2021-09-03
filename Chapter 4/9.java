import java.util.*;
import java.math.*;

class Main {

  public static void main(String[] args) {
    
		double wage = .01;
		double totalPay = wage;

		int counter = 1;

		int daysWorked = getDaysWorked();
		if(daysWorked > -1){
			

			while (counter <= daysWorked) {

				totalPay += wage;
				counter++;
				wage *= 2;
    	
			}

			System.out.printf("Total pay is: %.2f", totalPay);

			

		}

  }



	public static int getDaysWorked(){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of days worked: ");
		int daysWorked = scan.nextInt();

		scan.close();

		return daysWorked;

	}

}