


public class ArrayOperations {

    public static int getTotal(int[] arr){

        int sum = 0;

        for(int n: arr){

            sum += n;

        }

        return sum;

    }

    public static long getTotal(long[] arr){

        long sum = 0;

        for(long n: arr){

            sum += n;

        }

        return sum;

    }

    public static double getTotal(double[] arr){

        double sum = 0;

        for(double n: arr){

            sum += n;

        }

        return sum;

    }

    public static float getTotal(float[] arr){

        float sum = 0;

        for(float n: arr){

            sum += n;

        }

        return sum;

    }

    public static int getAverage(int[] arr){

        double sum = getTotal(arr);

        return (int)(sum/arr.length);

    }

    public static double getAverage(double[] arr){

        double sum = getTotal(arr);

        return sum/arr.length;

    }

    public static float getAverage(float[] arr){

        float sum = getTotal(arr);

        return sum/arr.length;

    }
    

    public static long getAverage(long[] arr){

        double sum = getTotal(arr);

        return (long)(sum/arr.length);

    }

    public static int getHighest(int[] arr){

        int highest = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] > highest){

                highest = arr[i];

            }

        }

        return highest;

    }

    public static float getHighest(float[] arr){

        float highest = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] > highest){

                highest = arr[i];

            }

        }

        return highest;

    }

    public static double getHighest(double[] arr){

        double highest = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] > highest){

                highest = arr[i];

            }

        }

        return highest;

    }

    public static long getHighest(long[] arr){

        long highest = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] > highest){

                highest = arr[i];

            }

        }

        return highest;

    }

    public static int getLowest(int[] arr){

        int lowest = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] < lowest){

                lowest = arr[i];

            }

        }

        return lowest;

    }

    public static float getLowest(float[] arr){

        float lowest = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] < lowest){

                lowest = arr[i];

            }

        }

        return lowest;

    }

    public static double getLowest(double[] arr){

        double lowest = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] < lowest){

                lowest = arr[i];

            }

        }

        return lowest;

    }

    public static long getLowest(long[] arr){

        long lowest = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] < lowest){

                lowest = arr[i];

            }

        }

        return lowest;

    }
}
