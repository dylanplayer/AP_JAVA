import java.util.Scanner;

class Main {

  public static void main(String[] args) {

			String userInput = getUI();

			while(!(userInput.equalsIgnoreCase("y")) && !(userInput.equalsIgnoreCase("n")) ){

				System.out.println("Try again");
				userInput = getUI();

			}
			

  }

	public static String getUI(){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter y or n: ");
		
		return scan.next();


	}

}