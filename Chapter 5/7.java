class Main {
  public static void main(String[] args) {

		int year = 2000;

		if(isLeapYear(year)){

			System.out.printf("The year %d is a leap year", year);

		}else{

			System.out.printf("The year %d is not a leap year", year);

		}
    
  }

	public static boolean isLeapYear(int year){

		if(year%4 == 0){

			return true;

		}else{

			return false;

		}

	}



}