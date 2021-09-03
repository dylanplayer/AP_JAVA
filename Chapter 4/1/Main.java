import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException{
    Scanner userInput = new Scanner(System.in);

		System.out.print("Enter the file name: ");
		String fileName = userInput.next();

		File file = new File(fileName);

		if(file.exists()){

			Scanner scan = new Scanner(file);

		for(int i = 0; i < 5; i++){

			if(scan.hasNextLine()){

			System.out.println(scan.nextLine());
				
			}

		}

			scan.close();
			userInput.close();

		}else{

			System.out.println("File Not Found");

		}

  }
}