


public class ArrayOperations {

    public static double getTotal(double[][] arr){

        double sum = 0;

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[i].length; j++){

                sum += arr[i][j];

            }

        }

        return sum;

    }

    public static double getTotalLength(double[][] arr){

        double length = arr.length;

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[i].length; j++){

                length++;

            }

        }

        return length;

    }

    public static double getAverage(double[][] arr){

        return ArrayOperations.getTotal(arr) / ArrayOperations.getTotalLength(arr);

    }

    public static double getRowTotal(double[][] arr, int rowNumber){

        double sum = 0;

        for(int i = 0; i < arr.length; i++){

            sum += arr[rowNumber][i];

        }

        return sum;
        
    }

    public static double getColumnTotal(double[][] arr, int columnNumber){

        double sum = 0;

        for(int i = 0; i < arr[columnNumber].length; i++){

            sum += arr[i][columnNumber];

        }

        return sum;
        
    }

    public static double getHighestInRow(double[][] arr, int rowNumber){

        double highest = arr[rowNumber][0];

        for(int i = 1; i < arr.length; i++){

            if(arr[rowNumber][i] > highest){

                highest = arr[rowNumber][i];

            }

        }

        return highest;
        
    }

    public static double getLowestInRow(double[][] arr, int rowNumber){

        double lowest = arr[rowNumber][0];

        for(int i = 1; i < arr.length; i++){

            if(arr[rowNumber][i] < lowest){

                lowest = arr[rowNumber][i];

            }

        }

        return lowest;
        
    }


}
