import java.util.Scanner;
class Main {

  public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    System.out.print("Enter package letter: ");
    String input = scan.next();
		char packageLetter = input.charAt(0);

    switch(packageLetter){

      case 'A':
      System.out.println("Your cost is: $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour.");
      break;

      case 'B':
      System.out.println("Your cost is: $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour.");
      break;

      case 'C':
      System.out.println("Your cost is: $19.95 per month unlimited access is provided.");
      break;



    }


  }
}
