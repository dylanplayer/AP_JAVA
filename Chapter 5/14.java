import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
		printName(getName());


  }
	
	public static String getName(){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your name: ");

		return scan.nextLine();

	}

	public static void printName(String name){

		System.out.printf("Hello, %s!", name);

	}


}