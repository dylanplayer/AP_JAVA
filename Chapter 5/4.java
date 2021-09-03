import java.util.*;


class Main{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of quarters: ");
        int numberOfQuarters = Integer.parseInt(scan.next());

        System.out.printf("%d quarters is equal to $%.2f\n", numberOfQuarters, quartersToDollars(numberOfQuarters));

				scan.close();


    }

    public static double quartersToDollars(int quarters){

        return .25 * quarters;

    }



}