

class Main{

    public static void main(String[] args){

        int[] iArr = {0, 1, 2, 3, 4, 5};
        double[] dArr = {0.1, 1.1, 2.1, 3.1, 4.1, 5.1};
        float[] fArr = {0.2f, 1.2f, 2.2f, 3.2f, 4.2f, 5.2f};
        long[] lArr = {0, 1, 2, 3, 4, 5};


        System.out.println("----------------");
        System.out.printf("int total: %d\n", ArrayOperations.getTotal(iArr));
        System.out.printf("int average: %d\n", ArrayOperations.getAverage(iArr));
        System.out.printf("int highest: %d\n", ArrayOperations.getHighest(iArr));
        System.out.printf("int lowest: %d\n", ArrayOperations.getLowest(iArr));
        System.out.println("----------------");
        System.out.printf("double total: %.2f\n", ArrayOperations.getTotal(dArr));
        System.out.printf("double average: %.2f\n", ArrayOperations.getAverage(dArr));
        System.out.printf("double highest: %.2f\n", ArrayOperations.getHighest(dArr));
        System.out.printf("double lowest: %.2f\n", ArrayOperations.getLowest(dArr));
        System.out.println("----------------");
        System.out.printf("float total: %.2f\n", ArrayOperations.getTotal(fArr));
        System.out.printf("float average: %.2f\n", ArrayOperations.getAverage(fArr));
        System.out.printf("float highest: %.2f\n", ArrayOperations.getHighest(fArr));
        System.out.printf("float lowest: %.2f\n", ArrayOperations.getLowest(fArr));
        System.out.println("----------------");
        System.out.printf("long total: %d\n", ArrayOperations.getTotal(lArr));
        System.out.printf("long average: %d\n", ArrayOperations.getAverage(lArr));
        System.out.printf("long highest: %d\n", ArrayOperations.getHighest(lArr));
        System.out.printf("long lowest: %d\n", ArrayOperations.getLowest(lArr));
        System.out.println("----------------");


    }

}