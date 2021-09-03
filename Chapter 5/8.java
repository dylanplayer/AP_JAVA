class Main {
  public static void main(String[] args) {

		double num1 = 25;
		double num2 = 45;
		double num3 = 65;

		System.out.printf("The avg of %.2f, %.2f, & %.2f is %.2f", num1,num2,num3,getAvg(num1, num2, num3));

  }

	public static double getAvg(double num1, double num2, double num3){

		return (num1+num2+num3)/3;


	}
}