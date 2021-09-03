import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);

		boolean tf1 = true;
		double vehicleSpeed = 0;
		double totalTime = 0;

		while(tf1){

				System.out.print("Enter the speed of a vehicle (MPH): ");
				vehicleSpeed = scan.nextDouble();

			if(vehicleSpeed >= 0){

				tf1 = false;
			}

		}

		boolean tf = true;

		while(tf){

			System.out.print("Enter the total time: ");
			totalTime = scan.nextDouble();

			if(totalTime > 1){

				tf = false;
			}

		}

		double distanceTraveled;

		for(int i = 1; i <= totalTime; i++){

			distanceTraveled = i * vehicleSpeed;

			System.out.printf("%d\t%.2f\n", i, distanceTraveled);
		
		}


  }
}