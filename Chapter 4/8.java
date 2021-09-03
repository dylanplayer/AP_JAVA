import java.util.Scanner;

class Main {

  public static void main(String[] args) {

			String userInput = getUI();

			while(!(userInput.equals("Yes")) && !(userInput.equals("No")) ){

				System.out.println("Try again");
				userInput = getUI();

			}
			

  }

	public static String getUI(){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Yes or No: ");
		
		return scan.next();


	}

}