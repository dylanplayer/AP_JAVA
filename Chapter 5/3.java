import java.util.*;

class Main {

	public static Scanner SCAN = new Scanner(System.in);

  public static void main(String[] args) {
    
		System.out.print("Enter text: ");
		String text = getConsoleInput();

		System.out.print("Enter index of character: ");
		int indexOfChar = Integer.parseInt(getConsoleInput());

		System.out.printf("The character at index #%d is \"%c\".", indexOfChar, showChar(text, indexOfChar));

		SCAN.close();


  }

	/**
	* Method gets specified character
	* @return {@link Character}
	* @param {@link String}, {@link Integer}
	*/

	public static char showChar(String str, int index){

		return str.charAt(index);


	}

	/**
	* Method gets console input
	* @return {@link String}
	*/
	public static String getConsoleInput(){

		return SCAN.nextLine();


	}




}