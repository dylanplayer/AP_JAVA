import java.util.*;
import java.io.*;

class Main {

  public static void main(String[] args) throws IOException{
    
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter the inputs file name: ");
		String inputFileName = userInput.next();

		System.out.print("Enter the output file name: ");
		String outputFileName = userInput.next();

		File inputFile = new File(inputFileName);
		File outputFile = new File(outputFileName);


		if(inputFile.exists()){

			Scanner scan = new Scanner(inputFile);
			PrintWriter pw = new PrintWriter(outputFile);

		while(scan.hasNextLine()){

			String temp = scan.nextLine();
			String tempUpperCase = temp.toUpperCase();

			pw.println(tempUpperCase);
			

		}

			scan.close();
			userInput.close();
			pw.close();

		}else{

			System.out.println("File Not Found");

		}

  }

}