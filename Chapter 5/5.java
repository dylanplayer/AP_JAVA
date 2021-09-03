import java.util.*;

class Main {


  public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input the first number: ");
		int x1 = Integer.parseInt(scan.next());

		System.out.print("Input the second number: ");
		int x2 = Integer.parseInt(scan.next());

		System.out.print("Input the third number: ");
		int x3 = Integer.parseInt(scan.next());

		System.out.printf("The smallest value is %d", getSmallestNum(x1, x2, x3));

		scan.close();

  }

	public static int getSmallestNum(int x1, int x2, int x3){

		if(x1 < x2 && x1 < x3){

			return x1;

		}else if(x2 < x1 && x2 < x3){

			return x2;

		}else if(x3 < x1 && x3 < x2){

			return x3;

		}else{

			return 0;

		}


	}


}