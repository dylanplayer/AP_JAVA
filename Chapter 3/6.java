import java.util.*;

class Main {

  public static void main(String[] args) {

    Double mass;
    double weight;
    
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter mass: ");
    mass = Double.parseDouble(scan.next());

    weight = mass * 9.8;

    if(weight < 10){
      System.out.println("The object is too light.");
    }else if(weight > 1000){
      System.out.println("The object is too heavy.");
    }else {
      System.out.println("The object is: " + weight + " Newtons");
    }

    scan.close();

  }

}