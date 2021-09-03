

public class Circle {

	private double radius;

	public Circle(double r) {

		radius = r; 
	}

	public double getArea() {

		return Math.PI * radius * radius; 
	
	}

	public double getRadius() {
	
		return radius; 
	
	}

	public String toString(){

		return getRadius() + " " + getArea();

	}

	public boolean equals(Circle circle){

		if(this.getRadius() == circle.getRadius()){

			return true;

		}else{

			return false;

		}

	}

	public boolean greaterThan(Circle circle){

		if(this.getArea() > circle.getArea()){

			return true;

		}else{

			return false;

		}

	}
}