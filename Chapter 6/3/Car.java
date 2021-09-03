
public class Car {

    private int YEAR;
    private String MAKE;
    private String MODEL;
    private double SPEED;

    public Car(int year, String make, String model){

        YEAR = year;
        MAKE = make;
        MODEL = model;
        SPEED = 0.0;

    }

    /**
     * Sets the year
     * @param year
     */

     public void setYear(int year){

        YEAR = year;

     }

     /**
     * Sets the make
     * @param make
     */

    public void setMake(String make){

        MAKE = make;

     }

     /**
     * Sets the model
     * @param model
     */

    public void setModel(String model){

        MODEL = model;

     }

     /**
     * Sets the speed
     * @param speed
     */

    public void setSpeed(double speed){

        SPEED = speed;

     }



     /**
     * Gets the year
     * @return year
     */

    public int getYear(){

        return YEAR;

     }

     /**
     * Gets the make
     * @return make
     */

    public String getMake(){

        return MAKE;

     }

     /**
     * Gets the model
     * @return model
     */

    public String getModel(){

        return MODEL;

     }

     /**
     * Gets the speed
     * @return speed
     */

    public double getSpeed(){

        return SPEED;

     }

     /**
      * Adds acceleration to the speed
      * @param acceleration
      */

    public void accelerate(double acceleration){

        SPEED += acceleration;

    }

    /**
      * subtracts brake from the speed
      * @param brake
      */

      public void brake(double brake){

        if(brake >= SPEED){

            SPEED = 0;

        }else{

            SPEED -= brake;

        }

    }

    /**
     * Print car's data
     * 
     */

     public void printData(){

        System.out.printf("Year: %d | Make: %s | Model: %s | Speed: %.2f\n", YEAR, MAKE, MODEL, SPEED);

     }

     /**
      * Prints the speed
      */

      public void printSpeed(){

        System.out.printf("Speed: %.2f\n", SPEED);

      }

    



     
    
}
