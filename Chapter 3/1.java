import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    
    String userInput;
    Scanner scan = new Scanner(System.in);

    while(true){


    System.out.print("Enter a number 1 - 10: ");
    userInput = scan.next();

    if(userInput.equals("1")){
      System.out.println("I");
    }
    if(userInput.equals("2")){
      System.out.println("II");
    }
    if(userInput.equals("3")){
      System.out.println("III");
    }
    if(userInput.equals("4")){
      System.out.println("IV");
    }
    if(userInput.equals("5")){
      System.out.println("V");
    }
    if(userInput.equals("6")){
      System.out.println("VI");
    }
    if(userInput.equals("7")){
      System.out.println("VII");
    }
    if(userInput.equals("8")){
      System.out.println("VIII");
    }
    if(userInput.equals("9")){
      System.out.println("IX");
    }
    if(userInput.equals("10")){
      System.out.println("X");
    }

    System.out.println();
    
    }

  }

}