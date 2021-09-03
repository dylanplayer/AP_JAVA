

class Main{

    public static void main(String[] args){

        int min = 5;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        findLargerThan(arr, 5);
        
    }

    public static void findLargerThan(int[] arr, int min){

        int count = 0;

        for(int n: arr){


            if(n > min){

                System.out.printf("index: %d = %d\n", count, n);

            }

            count++;

        }

    }

}