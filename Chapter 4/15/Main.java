import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException{
    
		File file = new File("MyName.txt");

		if(file.exists()){

			Scanner scan = new Scanner(file);

			if(scan.hasNext()){

			System.out.println(scan.nextLine());
				
			}else{

			System.out.println("There is no data to print");

		}

			scan.close();

		}else{

			System.out.println("File Not Found");

		}

  }
}