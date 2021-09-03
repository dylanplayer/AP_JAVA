import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    Double packageWeight = 0.0;
    double shippingCharge = 0;



    System.out.print("Enter package weight: ");
    packageWeight = Double.parseDouble(scan.next());

    if(packageWeight <= 2){

      shippingCharge = 1.10;

    }else if(packageWeight > 2 && packageWeight <= 6){

      shippingCharge = 2.20;

    }else if(packageWeight > 6 && packageWeight <= 10){

      shippingCharge = 3.70;  

    }else if(packageWeight > 10){

      shippingCharge = 4.80; 

    }

    System.out.printf("Shipping Charge: %.2f", shippingCharge);




  }
}