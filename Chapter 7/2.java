import java.util.*;

class Main{

    public static void main(String[] args){

        sevenNine();
        sevenTen();
        sevenEleven();
        sevenTwelve();

    }


    public static void sevenNine(){

        int[] numbers1 = { 1, 3, 6, 9 };
        int[] numbers2 = { 2, 4, 6, 8 };
        int result = numbers1[0] * numbers2[3];

        System.out.println("7.9:");
        System.out.printf("result: %d", result);
        System.out.println("\n------------");

    }


    public static void sevenTen(){

        int arrIndex = 9;
        int[] array = new int[arrIndex];

        for(int i = 0; i < array.length; i++){

            array[i] = -1;

        }

        System.out.println("7.10:");
        for(int i = 0; i < array.length; i++){

            System.out.print(array[i] + "\t");

        }
        System.out.println("\n------------");

    }

    public static void sevenEleven(){

        Scanner scan = new Scanner(System.in);

        double[] values;
        System.out.println("7.11:");
        System.out.print("Enter arr size: ");
        int arrSize = Integer.parseInt(scan.next());

        values = new double[arrSize];

        System.out.println("------------");
        

    }

    public static void sevenTwelve(){
    
        int[] a = { 1, 2, 3, 4, 5, 6, 7 }; 
        
        int[] b = a;

        System.out.println("7.12:");
        for(int i = 0; i < b.length; i++){

            System.out.print(b[i] + "\t");

        }
        System.out.println("\n------------");

    
    }

}