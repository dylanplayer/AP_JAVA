import java.util.*;

class Main{

    public static void main(String[] args){

        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Number of divisions: ");

        int numberOfDivisions;
        
        do{

            numberOfDivisions = Integer.parseInt(scan.next());

        }while(numberOfDivisions < 1);
            
        Sales companySales = new Sales(numberOfDivisions);


        for(int i = 0; i < numberOfDivisions; i++){

            for(int j = 0; j < 4; j++){

                System.out.printf("Q%d Division %d: ", j+1, i+1);
                companySales.setSalesAt(j, i, Double.parseDouble(scan.next()));

            }

        }

        companySales.printSales();
        companySales.printPercentages();

        scan.close();

    }

}