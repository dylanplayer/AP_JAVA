import java.util.*;

class Main {

  public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter distance in meters: ");
		double meters = Double.parseDouble(scan.next());
		boolean tf = true;

		do{

			System.out.println("1. Convert to kilometers");
			System.out.println("2. Convert to inches");
			System.out.println("3. Convert to feet");
			System.out.println("4. Quit the program");

			String input = scan.next();

			if(input.equals("1")){

				System.out.printf("%f kilometers\n",getKilometers(meters));

			}else if(input.equals("2")){

				System.out.printf("%f Inches\n",getInches(meters));

			}else if(input.equals("3")){

				System.out.printf("%f Feet\n",getFeet(meters));

			}else if(input.equals("4")){

				tf = false;

			}else{
				System.out.println("Invalid Input");
			}

		}while(tf);


  }

	public static double getKilometers(double meters){

		return meters/1000;

	}

	public static double getInches(double meters){

		return meters*39.3701;

	}

	public static double getFeet(double meters){

		return meters*3.281;

	}

}