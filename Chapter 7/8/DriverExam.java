

public class DriverExam{

	private char[] studentAnswers;
	private char[] correctAnswers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};

	public DriverExam(char[] studentAnswersTemp){

		studentAnswers = studentAnswersTemp.clone();

	}

	public double gradeExam(){

		double correct = 0;

		for(int i = 0; i < studentAnswers.length; i++){

			if(studentAnswers[i] == correctAnswers[i]){

				correct++;

			}

		}

		
		return 100 * (correct / 20);

	}


	public boolean passed(){

		boolean flag = true;

		if(gradeExam() < 70){

			flag = false;

		}

		return flag;

	}

	public int totalCorrect(){

		int correct = 0;

		for(int i = 0; i < studentAnswers.length; i++){

			if(studentAnswers[i] == correctAnswers[i]){

				correct++;

			}

		}

		return correct;

	}

	public int totalMissed(){

		return studentAnswers.length - totalCorrect();

	}

	public int[] questionsMissed(){

		int[] questionsMissed = new int[totalMissed()];
		int index = 0;

		for(int i = 0; i < studentAnswers.length; i++){

			if(!(studentAnswers[i] == correctAnswers[i])){

				questionsMissed[index] = i+1;

				index++;

			}

		}

		return questionsMissed;


	}




}

