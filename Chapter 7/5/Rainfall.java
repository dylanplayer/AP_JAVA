

public class Rainfall {

    private double[] _monthlyRainfall;

    public Rainfall(){

        _monthlyRainfall = new double[12];

    }

    public Rainfall(double jan, double feb, double mar, double apr, double may, double jne, double jly, double aug, double sep, double oct, double nov, double dec){

        _monthlyRainfall = new double[12];

        setRainfall(1, jan);
        setRainfall(2, feb);
        setRainfall(3, mar);
        setRainfall(4, apr);
        setRainfall(5, may);
        setRainfall(6, jne);
        setRainfall(7, jly);
        setRainfall(8, aug);
        setRainfall(9, sep);
        setRainfall(10, oct);
        setRainfall(11, nov);
        setRainfall(12, dec);

    }

    /**
     * Sets specific month's rainfall
     * @param month
     * @param rainAmount
     */

    public void setRainfall(int m, double amt){

        _monthlyRainfall[m-1] = amt;

    }

    /**
     * Gets total rainfall
     * @return totalRainfall
     */

    public double getTotalRainfall(){

        double sum = 0;
        for(double n: _monthlyRainfall){

            sum += n;

        }

        return sum;

    }

    /**
     * Gets specific month's rainfall
     * @param month
     * @return rainfall
     */

    public double getMonthsRainfall(int m){

        return _monthlyRainfall[m-1];

    }

    /**
     * Gets the average rainfall
     * @return avgRainfall
     */

    public double getAvgRainfall(){

        return getTotalRainfall()/_monthlyRainfall.length;

    }

    /**
     * prints all rain data
     */
    public void printData(){

        System.out.printf("Total Rainfall: %.2f\n", getTotalRainfall());
        System.out.printf("Average Rainfall: %.2f\n", getAvgRainfall());

    }

}
