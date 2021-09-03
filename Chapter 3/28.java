//import Scanner Class for User input
import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
  //3.1 Write an if statement that assigns 0 to x when y is equal to 20.
	  int y;
	  
	  Scanner scan = new Scanner (System.in);
	    
	    System.out.print("Enter a number: ");
	    y = scan.nextInt();
	    
	    if (y == 20)
	      {
	        int x = 0;
	        System.out.println(x);
	      }

	  //3.2 Write an if statement that multiplies payRate by 1.5 if hours is greater than 40.
	  double payRate = 8.50;
	  Double hours = 0.0;

	  System.out.print("Enter number of hours worked: ");
	  hours = Double.parseDouble(scan.next());

	  if(hours > 40){

	    payRate *= 1.5;

	  }

	    System.out.println(payRate);

	  /*3.3 Write an if statement that assigns 0.2 to commission if sales is greater than or
	  equal to 10000.*/

	  double commission = 0;
	  Double sales = 0.0;

	  System.out.print("Enter sales: ");
	  sales = Double.parseDouble(scan.next());

	  if(sales >= 10000){

	    commission = .2;

	  }

	  System.out.println(commission);
	 

	  /*3.4 Write an if statement that sets the variable fees to 50 if the boolean variable max
	  is true.*/

	  Double fees = 0.0;
	  boolean max = false;

	  System.out.print("Enter Fees: ");
    fees = Double.parseDouble(scan.next());

	  if(fees == 50){

	    max = true;

	  }

	  System.out.println(max);


	  /*3.5 Write an if statement that assigns 20 to the variable t and assigns 40 to the vari-
	  able z if the variable x is greater than 100.*/
	  Integer x;
	  int t = 0;
	  int z = 0;
	  
	  System.out.print("Enter x: ");
	  x = Integer.parseInt(scan.next());
			  

	  if(x > 100){

	    t = 20;
	    z = 40;


	  }

	  System.out.println("t = " + t + " z = " + z);


	  /*3.6 Write an if statement that assigns 0 to the variable b and assigns 1 to the variable c
	  if the variable a is less than 10.*/

	  int b;
	  int c;
	  Integer a;

	  System.out.println("Enter value for a: ");
	  a = Integer.parseInt(scan.next());

	  if(a < 10){

	    b = 0;
	    c = 1;

	  }

    System.out.println("b = " + b + " c = " + c);


	  /*3.7 Write an if statement that displays “Goodbye” if the variable myCharacter contains
	  the character 'D'.*/

	  String myCharacter;

	  System.out.print("Enter myCharacter: ");
	  myCharacter = scan.next();

	  if(myCharacter.contains("D")){

	    System.out.println("Goodbye");

	  }


	  scan.close();
	    
	  }

}