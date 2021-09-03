import java.util.Scanner;
import java.math.*;

class Main {
  public static void main(String[] args) {
    
    Double weight = 0.0;
    Double height = 0.0;
    double BMI;
    double maxOptimumBMI = 25;
    double minOptimumBMI = 18.5;
  
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your weight: ");
    weight = Double.parseDouble(scan.next());

    System.out.print("Enter your height: ");
    height = Double.parseDouble(scan.next());

    BMI = (weight * 703)/Math.pow(height, 2);

    if(BMI >= minOptimumBMI && BMI <= maxOptimumBMI ){

      System.out.println("You are optimal weight");

    }
    else if(BMI > maxOptimumBMI ){

      System.out.println("You are overweight");

    }
    else if(BMI < minOptimumBMI){

      System.out.println("You are underweight");

    }else{

      System.out.println("You aren't a human");
      
    }



  }
}