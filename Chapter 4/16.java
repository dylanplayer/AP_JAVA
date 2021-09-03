import java.util.Scanner;

class Main {


  public static void main(String[] args) {
    //input scanner class
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a word: ");
    
    //user inputs their words
		String userString = scan.next();

		System.out.print("Enter a charaacter: ");
    
    //user enters the char variable being searched
		char userChar = scan.next().toLowerCase().charAt(0);

		int numberOfChars = 0;
    
    //close scanner
    scan.close();
    
    //for loop
		for(int i = 0; i < userString.length(); i++){

			if(userChar == (userString.toLowerCase().charAt(i))){
        //count variable for char
				numberOfChars++;

			}

		}
    //output statement.
		System.out.printf("There are %d %c's in %s", numberOfChars, userChar, userString);


  }

}