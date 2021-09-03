import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a whole number: ");
		int userNumber = scan.nextInt();

		while(userNumber > 0){

			System.out.println(userNumber);
			userNumber--;

		}



  }
}