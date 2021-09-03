

public class LandTract{

    private double tractLength;
    private double tractWidth;

    public LandTract(double length, double width){

        tractLength = length;
        tractWidth = width;

    }

    public double getArea(){

        return tractLength * tractWidth;

    }

    public boolean equals(LandTract track2){

        if(this.getArea() == track2.getArea()){

            return true;

        }else{

            return false;

        }

    }

    public String toString(){

        return this.getArea() + "";

    }



}