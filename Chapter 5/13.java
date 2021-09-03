class Main {
  public static void main(String[] args) {
    
		double x = 3.2;
		
		sayHello();
		showValue((int)x);
		double x2 = timesTwo(x);
		double halfX = half(x);

    //Call out your methods below
  }

//1. Find the error in the following method definition:
// This method has an error!
public static void sayHello(){
	
	System.out.println("Hello"); 

}

//2. Look at the following method header:
public static void showValue(int x){
//The following code has a call to the showValue method. Find the error.
System.out.println(x); 

}

//3. Find the error in the following method definition:
// This method has an error!
public static double timesTwo(double num) {

return num * 2; 

}

//4. Find the error in the following method definition:
// This method has an error! 
public static double half(double num) {

	return num / 2.0; 

}

}