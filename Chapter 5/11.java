import java.util.*;

class Main {

	public static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

		System.out.print("Enter number of test scores: ");
		int numberOfScores = Integer.parseInt(scan.next());

		System.out.printf("Grade is: %c", getLetterGrade(getAverage(numberOfScores)));



  }

	public static double getAverage(int numberOfScores){

		double total = 0;
		int sum = 0;

		for(int i = 0; i < numberOfScores; i++){

			System.out.printf("Enter test score %d: ", i + 1);

			total += Double.parseDouble(scan.next());

			sum++;

		}

		return total/sum;

	}

	public static char getLetterGrade(double average){

		if(average >= 89.45){
			return 'A';
		}else if(average < 89.45 && average >= 79.45){
			return 'B';
		}else if(average < 79.45 && average >= 69.45){
			return 'C';
		}else if(average < 69.45 && average >= 59.45){
			return 'D';
		}else if(average < 59.45){
			return 'F';
		}else{
			return 'E';
		}

	}


}