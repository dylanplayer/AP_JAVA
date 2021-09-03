import java.util.*;
import java.math.*;

class Main {


	public static final double SQUARE_FEET_PER_GALLON = 115;
	public static final double HOURS_PER_GALLON = 8;
	public static final double PAINTER_WAGE = 18.0;
	public static int NUMBER_OF_ROOMS;
	public static double TOTAL_SQUARE_FOOTAGE = 0;
	public static double PRICE_PER_GALLON;

  public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter total number of rooms: ");
		NUMBER_OF_ROOMS = scan.nextInt();

		for(int i = 0; i < NUMBER_OF_ROOMS; i++){

			System.out.printf("Enter Squarefootage for room %d: ", i+1);

			TOTAL_SQUARE_FOOTAGE += scan.nextDouble();

		}

		System.out.print("Enter price per gallon: ");
		PRICE_PER_GALLON = scan.nextDouble();

		System.out.println("-------------------");
		System.out.printf("Gallons: %.0f\n", getGallons());
		System.out.printf("Hours: %.2f\n", getHours());
		System.out.printf("Paint Cost: $%.2f\n", getPaintCost());
		System.out.printf("Labor Cost: $%.2f\n", getLaborCost());
		System.out.printf("Total: $%.2f\n", getTotal());

		

  }

	public static double getGallons(){

		return Math.ceil(TOTAL_SQUARE_FOOTAGE/SQUARE_FEET_PER_GALLON);

	}

	public static double getHours(){

		return getGallons()*HOURS_PER_GALLON;

	}

	public static double getPaintCost(){

		return getGallons()*PRICE_PER_GALLON;

	}

	public static double getLaborCost(){

		return getHours()*PAINTER_WAGE;

	}

	public static double getTotal(){

		return getLaborCost() + getPaintCost();

	}

}