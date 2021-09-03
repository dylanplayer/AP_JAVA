import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    double totalCharge;
    double totalTax;
    double totalTip;
    double taxPercentage = 0.0675;
    double tipPercentage = 0.2;

    System.out.print("Enter the meal charge: ");
    Double mealCharge = Double.parseDouble(scan.next());
    System.out.println();


    totalTax = (mealCharge * taxPercentage);
    totalTip = (mealCharge * tipPercentage);
    totalCharge = mealCharge + totalTax + totalTip;

    System.out.print("Meal charge: ");
    System.out.printf("%.2f", mealCharge);
    System.out.println();

    System.out.print("Total tax: ");
    System.out.printf("%.2f", totalTax);
    System.out.println();

    System.out.print("Total tip: ");
    System.out.printf("%.2f", totalTip);
    System.out.println();

    System.out.print("Total charge: ");
    System.out.printf("%.2f", totalCharge);
    System.out.println();


  }
}