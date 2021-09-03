

class Main{

    public static void main(String[] args){

        double[][] points = new double[3][3];

        for(int i = 0; i < points.length; i++){

            for(int j = 0; j < points[i].length; j++){

                points[i][j] = i;

            }

        }


        System.out.printf("Array total: %.2f\n", ArrayOperations.getTotal(points));
        System.out.printf("Array average: %.2f\n", ArrayOperations.getAverage(points));
        System.out.printf("Array Row 2 total: %.2f\n", ArrayOperations.getRowTotal(points, 1));
        System.out.printf("Array Col 3 total: %.2f\n", ArrayOperations.getColumnTotal(points, 2));
        System.out.printf("Array Row 2 highest: %.2f\n", ArrayOperations.getHighestInRow(points, 1));
        System.out.printf("Array Row 2 lowest: %.2f\n", ArrayOperations.getLowestInRow(points, 1));






    }

}