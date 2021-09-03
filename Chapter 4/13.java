import java.util.Scanner;
import java.util.stream.*;

class Main {


  public static void main(String[] args) {

		System.out.print("Enter the number of integers: ");
		int max = Integer.parseInt(getUserInput()); 
		int [] numbers = new int [max];
		
		System.out.println("Enter numbers: ");
		for(int i = 0; i < max; i++){

			numbers[i] = Integer.parseInt(getUserInput());

		}

		System.out.printf("Sum: %d", getArraySum(numbers));

  }

	public static int getArraySum(int[] numbers){

		return IntStream.of(numbers).sum();

	}

	public static String getUserInput(){

		Scanner scan = new Scanner(System.in);
		return scan.next();

	}


}