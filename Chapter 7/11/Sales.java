import java.awt.color.*;

public class Sales {

    private final String ANSI_RESET = "\u001B[0m";
    private final String ANSI_BLACK = "\u001B[37m";
    private final String ANSI_RED = "\u001B[31m";
    private final String ANSI_GREEN = "\u001B[32m";

    private double[][] _salesArr;
    private int _quarters = 4;
    private int _numberOfDivisions;

    public Sales(int numberOfDivisions){

        _salesArr = new double[4][numberOfDivisions];
        _numberOfDivisions = numberOfDivisions;

    }

    public void setSalesAt(int quarter, int divisionNumber, double amount){

        _salesArr[quarter][divisionNumber] = amount;

    }

    public double getTotalQSales(int quarter){

        double total = 0;

        for(int j = 0; j < _numberOfDivisions; j++){

            total += _salesArr[quarter][j];

        }

        return total;

    }

    public double getAvgQSales(int quarter){

        return getTotalQSales(quarter) / _numberOfDivisions;

    }

    public void printSales(){

        System.out.print("\n");

        for(int i = 0; i < _quarters; i++){

            System.out.printf("Q%d. ", i+1);

            for(int j = 0; j < _numberOfDivisions; j++){

                System.out.printf("$%,.2f ", _salesArr[i][j]);

            }

            System.out.printf("total: $%,.2f ", getTotalQSales(i));

            System.out.printf("avg: $%,.2f ", getAvgQSales(i));

            System.out.print("\n");

        }

    }

    public void printPercentages(){

        System.out.print("\n");

        double percentageDif;
        double totalPercentageDif;

        
        for(int i = 0; i < _quarters; i++){

            System.out.printf("Q%d. ", i+1);

            for(int j = 0; j < _numberOfDivisions; j++){

                if(i == 0){

                    System.out.print(" 0.00%");

                }else{

                    percentageDif = (_salesArr[i][j] / _salesArr[i-1][j]) * 100;

                    if(_salesArr[i][j] > _salesArr[i-1][j]){

                        System.out.print(ANSI_GREEN + String.format("%,.2f%% ", percentageDif - 100) + ANSI_RESET);

                    }else if(_salesArr[i][j] == _salesArr[i-1][j]){

                        System.out.print(ANSI_BLACK + String.format("%,.2f%% ", percentageDif - 100) + ANSI_RESET);

                    }else{

                        System.out.print(ANSI_RED + String.format("-%,.2f%% ", percentageDif) + ANSI_RESET);

                    }  
                    
                }

                
            }
            
            
            if(i == 0){

                System.out.print(" 0.00%");

            }else{

                totalPercentageDif = getTotalQSales(i)/getTotalQSales(i-1) * 100;

                if(getTotalQSales(i) > getTotalQSales(i-1)){
    
                    System.out.print(ANSI_GREEN + String.format("total: %,.2f%% ", totalPercentageDif - 100) + ANSI_RESET);
    
                }else if(getTotalQSales(i) == getTotalQSales(i-1)){
    
                    System.out.print(ANSI_BLACK + String.format("total: %,.2f%% ", totalPercentageDif - 100) + ANSI_RESET);
    
                }else{
    
                    System.out.print(ANSI_RED + String.format("total: -%,.2f%% ", totalPercentageDif) + ANSI_RESET);
    
                }
            }


            System.out.print("\n");

        }


    }

    

    
    
}
