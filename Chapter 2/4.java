import java.util.Scanner;
class Main {

  public static void main(String[] args) {
    
    double percentageProfit = 0.4;
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the retail price: ");
    Double retailPrice = Double.parseDouble(scan.next());
    double totalProfit = (retailPrice * percentageProfit);

    System.out.print("The total profit is: $");
    System.out.printf("%.2f", totalProfit);


  }
}