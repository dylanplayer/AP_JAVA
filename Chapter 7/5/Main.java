import java.util.Scanner;

class Main{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Rainfall alabamaRainfall = new Rainfall();
        double tempAmt;
        for(int i = 0; i < 12; i++){

            boolean isNegitive = true;
            do{
                System.out.printf("Enter rainfall for month %d: ", i+1);
                tempAmt = Double.parseDouble(scan.next());
                if(tempAmt >= 0){

                    alabamaRainfall.setRainfall(i+1, tempAmt);
                    isNegitive = false;

                }

            }while(isNegitive);

        }

        alabamaRainfall.printData();

    }

}