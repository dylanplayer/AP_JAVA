import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    
		File file = new File("MyName.txt");
		String name = "Dylan";

		PrintWriter pWriter = new PrintWriter(file);

		pWriter.println(name);

		pWriter.close();


  }
}