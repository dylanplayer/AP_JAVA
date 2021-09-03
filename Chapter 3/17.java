import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number of books purchased: ");
		int numberOfBooks = scan.nextInt();
		int points = 0;

		if(numberOfBooks == 1){

			points = 5;

		}else if(numberOfBooks == 2){

			points = 15;

		}else if(numberOfBooks == 3){

			points = 30;

		}else if(numberOfBooks >= 4){

			points = 60;

		}

		System.out.printf("Points: %d", points);


	 }
}