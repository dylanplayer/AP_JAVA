public class Rectangle{

    private double LENGTH;
    private double WIDTH;

    public Rectangle(double length, double width){

        LENGTH = length;
        WIDTH = width;

    }

    //setters

    /**
     * Set the Length of the rectangle
     * @param length
     * @return void
     */

    public void setLength(double length){

        LENGTH = length;

    }

    /**
     * Set the Width of the rectangle
     * @param Width
     * @return void
     */

    public void setWidth(double width){

        WIDTH = width;

    }

    //getters

    /**
     * 
     * Get the Length of the rectangle
     * @return Length
     */

    public double getLength(){

        return LENGTH;


    }

    /**
     * 
     * Get the Width of the rectangle
     * @return Width
     */

    public double getWidth(){

        return WIDTH;


    }

}