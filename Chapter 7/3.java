

class Main{

    public static void main(String[] args){

        double[] numbers = new double[100];
        myMethod(numbers);

    }

    public static void myMethod(double[] arr){

        int counter = 0;
        for(double n: arr){

            arr[counter] = 0;
            System.out.printf("index: %d = %f\n", counter, arr[counter]);
            counter++;

        }

        System.out.println("--------------");

    }

}