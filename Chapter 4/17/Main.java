import java.util.*;
import java.io.*;

class Main {

  public static void main(String[] args) throws IOException{
    
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = scan.nextLine();

		System.out.print("Enter meme content: ");
		String memeContent = scan.nextLine();

		File memeFile = new File("Meme Webpage.html");
		PrintWriter memePW = new PrintWriter(memeFile);

		memePW.println("<html>");
		memePW.println("<body>");
		memePW.println("<center>");
		memePW.println("<h1>" + name + "</h1>");
		memePW.println("</center>");
		memePW.println("<hr>\n<p>" + memeContent + "<p>");
		memePW.println("</body>");
		memePW.println("</html>");

		memePW.close();
		scan.close();

		
  }

}