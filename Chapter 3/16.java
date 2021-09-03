import java.util.Scanner;
class Main {

  public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number of checks: ");
		int numberOfChecks = scan.nextInt();
		double cost = 10;

		if(numberOfChecks < 20){
			cost += ((20 - numberOfChecks) * .10);
		}else if(numberOfChecks < 40){
			cost += ((40 - numberOfChecks) * .08);
		}else if(numberOfChecks < 60){
			cost += ((60 - numberOfChecks) * .06);
		}else if(numberOfChecks > 60){
			cost += ((numberOfChecks - 60) * .04);
		}
		System.out.printf("Cost: %,.2f", cost);


  }
}