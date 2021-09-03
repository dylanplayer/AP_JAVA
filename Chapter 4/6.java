import java.util.Scanner;

class Main {

  public static void main(String[] args) {

			int userInput = getUI();

			while(userInput < 10 || userInput > 24){

				System.out.println("The number entered is out of range");
				userInput = getUI();

			}
			

  }

	public static int getUI(){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a whole number between 10 - 24 : ");
		
		return scan.nextInt();


	}

}