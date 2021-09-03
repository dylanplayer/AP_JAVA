import java.util.*;

class Main {

  public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Wholesale Price: ");
		double wholesalePrice = Double.parseDouble(scan.next());
		System.out.print("Enter Markup Percentage: ");
		double markup = Double.parseDouble(scan.next());
		System.out.printf("Reatil Price: %.2f",calculateRetail(wholesalePrice, markup));


  }

	public static double calculateRetail(double wholesalePrice, double markUpPercentage){

		return wholesalePrice + ((markUpPercentage/100) * wholesalePrice);

	}


}