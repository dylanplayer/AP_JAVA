import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    Integer packagesPurchased = 0;
    double packageCost = 99;
    double discount = 0;

    System.out.print("Enter number of packages purchased: ");
    packagesPurchased = Integer.parseInt(scan.next());

    if(packagesPurchased >= 10 && packagesPurchased <= 19){
      discount = 1.2;
    }else if(packagesPurchased >= 20 && packagesPurchased <= 49){
      discount = 1.3;
    }else if(packagesPurchased >= 50 && packagesPurchased <= 99){
      discount = 1.4;
    }else if(packagesPurchased >= 100){
      discount = 1.5;
    }

    double packagePrice =  packagesPurchased * packageCost;
    double totalDiscount = packagePrice * discount;
    double total = packagePrice + totalDiscount;
    
    System.out.println("--------------");
    System.out.println("Discount: " + totalDiscount);
    System.out.println("Total: " + total);

    scan.close();
    

  }
}