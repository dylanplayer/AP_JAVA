public class Square{

    private double LENGTH;

    /**
     * Create Square object
     */
    public Square(){

        LENGTH = 0.0;

    }
    /**
     * Create Square object
     * @param length
     */
    public Square(double length){

        LENGTH = length;

    }


    //setters

    /**
     * Set square side lengths
     * @param length
     * @return void
     */

    public void setLength(double length){

        LENGTH = length;

    }

    //getters

    /**
     * 
     * Get square side lengths
     * @return length
     */

   public double getLength(){

        return LENGTH;


    }

    //Other

    /**
     * Returns the area
     * @return area
     */
    public double getArea(){

        return LENGTH * LENGTH;

    }


}