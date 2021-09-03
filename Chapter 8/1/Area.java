import java.math.*;

public class Area{

	public static double getArea(int width, int height){

		return width * height;

	}

	public static double getArea(double radius){

		return (Math.PI * (radius * radius));

	}

	public static double getArea(double radius, double height){

		return getArea(radius) * height;

	}

}