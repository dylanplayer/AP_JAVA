import java.util.Scanner;
class Main {

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    Integer day = 0;
    Integer month = 0;
    Integer year = 0;


    System.out.print("Enter the day: ");
    day = Integer.parseInt(scan.next());

    System.out.print("Enter the month: ");
    month = Integer.parseInt(scan.next());

    System.out.print("Enter the year: ");
    year = Integer.parseInt(scan.next());

    System.out.println("---------------");

    if((day * month) == year){
      System.out.println("This is a magic date.");
    }else{
      System.out.println("This is not a magic date");
    }

    scan.close();


  }
}