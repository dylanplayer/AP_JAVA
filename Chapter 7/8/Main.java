import java.util.Scanner;

class Main {

  public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numberOfQuestions = 20;

		char[] studentAnswers = new char[numberOfQuestions];

		Character inputChar;

		System.out.println("Enter student's answers");
    
		for(int i = 0; i < studentAnswers.length; i++){

			do{
				System.out.printf("%d. ", i + 1);

				inputChar = Character.toUpperCase(scan.next().charAt(0));

			}while(!(inputChar.equals('A')) && !(inputChar.equals('B')) && !(inputChar.equals('C')) && !(inputChar.equals('D')));

			studentAnswers[i] = inputChar;

		}

		System.out.println();

		DriverExam exam = new DriverExam(studentAnswers);

		System.out.printf("Grade: %.2f\n", exam.gradeExam());

		if(exam.passed()){

			System.out.println("Student Passed");

		}else{

			System.out.println("Student Failed");

		}

		System.out.printf("Correct: %d\n", exam.totalCorrect());
		System.out.printf("Missed: %d\n", exam.totalMissed());
		
		if(exam.totalMissed() > 0){

			System.out.print("Missed: ");

			int[] questionsMissed = exam.questionsMissed().clone();

			for(int i = 0; i < questionsMissed.length; i++){

				if(i != (questionsMissed.length - 1)){

					System.out.printf("#%d, ", questionsMissed[i]);

				}else{

					System.out.printf("#%d\n", questionsMissed[i]);

				}

			}

			System.out.println();

		}

  }

}