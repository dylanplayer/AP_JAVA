import java.util.Scanner;

public class Main{

  public static void main(String[] args){
  Character userChar;
  Scanner scan = new Scanner(System.in);


  System.out.print("Enter a letter between A - D: ");
  userChar = scan.next().charAt(0);

switch(userChar){

    case 'A':
    System.out.println("You selected A.");
    break;

    case 'B':
    System.out.println("You selected B.");
    break;

    case 'C':
    System.out.println("You selected C.");
    break;

    case 'D':
    System.out.println("You selected D.");
    break;

    default : 
    System.out.println("Not good with letters, eh?");


    }

    scan.close();

  }
}