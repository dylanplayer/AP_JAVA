import java.util.Scanner;

class Main {

	public static Scanner scan = new Scanner(System.in);

	public static double MINIMUM_ANNUAL_SALARY = 20000;
	public static int MINIMUM_CREDIT_RATING = 7;
	
  public static void main(String[] args) {
    
		
		System.out.print("Enter your annual salary: ");
		double annualSalary = getAnnualSalary();

		System.out.print("Enter your credit rating out of 10: ");
		int creditRating = getCreditRating();

		showQualificationText(checkQualification(annualSalary, creditRating));

		scan.close();

  }

	/**
	method shows if qualified text
	*/
	public static void showQualificationText(boolean qualified){

		if(qualified){

			System.out.println("Congratulations! You qualify for the credit card!");

		}else{

		System.out.println("I’m sorry, You do not qualify for the credit card.");


		}

	}

	/**
	method checks if user qualifies
	*/
	public static boolean checkQualification(double annualSalary, int creditRating){

		if(annualSalary >= MINIMUM_ANNUAL_SALARY && creditRating >= MINIMUM_CREDIT_RATING){

			return true;

		}else if(annualSalary < MINIMUM_ANNUAL_SALARY && creditRating >= MINIMUM_CREDIT_RATING){

			System.out.println("-------------------------");
			System.out.println("Annual salary is too low");
			return false;

		}else if(annualSalary >= MINIMUM_ANNUAL_SALARY && creditRating < MINIMUM_CREDIT_RATING){

			System.out.println("-------------------------");
			System.out.println("Credit rating is too low");
			return false;
			
		}else{

			System.out.println("-------------------------");
			System.out.println("Credit rating is too low and annual salary is too low");
			return false;

		}

	}


	/**
	method gets credit rating
	*/
	public static int getCreditRating(){

		int creditRating = Integer.parseInt(getUserInput());

		while(!validateCreditRating(creditRating)){

			System.out.println("Invalid Credit Rating");
			System.out.print("Renter your credit rating out of 10: ");

			creditRating = Integer.parseInt(getUserInput());

		}

		return creditRating;
		

	}


	/**
	method validates credit rating
	*/
	public static boolean validateCreditRating(int creditRating){

		if(creditRating >= 0 && creditRating <= 10){

			return true;

		}else{

			return false;

		}

	}

	/**
	method gets annual salary
	*/
	public static double getAnnualSalary(){

		double annualSalary = Double.parseDouble(getUserInput());

		while(!validateAnnualSalary(annualSalary)){

			System.out.println("Invalid Annual Salary");
			System.out.print("Renter your annual salary: ");

			annualSalary = Double.parseDouble(getUserInput());

		}

		return annualSalary;

	}

	/**
	method validates annual salary
	*/
	public static boolean validateAnnualSalary(double annualSalary){

		if(annualSalary >= 0){

			return true;

		}else{

			return false;

		}

	}


	/**
	method gets user input from console
	*/
	public static String getUserInput(){

		String output = scan.next();

		return output;

	}


}