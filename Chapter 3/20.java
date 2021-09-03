import java.util.Scanner;

class Main {



  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    cp38(scan);
    cp39(scan);
    cp310(scan);
    cp311(scan);


  }


  public static void cp38(Scanner scan){

    Integer x = 0;
    int y = 0;

    System.out.print("Enter value for x: ");
    x = Integer.parseInt(scan.next());

    if(x > 100){

      y = 20;

    }

      System.out.println("Y = " + y);

  }

  public static void cp39(Scanner scan){

    Integer y = 0;
    int x = 0;

    System.out.print("Enter value for y: ");
    y = Integer.parseInt(scan.next());

    if(y == 100){

      x = 1;
      
      }

    System.out.println("X = " + x);

  }

  public static void cp310(Scanner scan){

    Double sales = 0.0;
    double commission = 0.1;

    System.out.print("Enter the number of sales: ");
    sales = Double.parseDouble(scan.next());

    if(sales >= 50000.0){

      commission = 0.2;

    }

    System.out.println("Commission is: " + commission);


  }

  public static void cp311(Scanner scan){
  
    Integer a = 0;
    int b = -99;
    int c = 0;

    System.out.print("Enter the value for a: ");
    a = Integer.parseInt(scan.next());

    if(a < 10){

      b = 0;
      c = 1;

    }

    System.out.print("b = " + b + " c = " + c);



  
  }






}