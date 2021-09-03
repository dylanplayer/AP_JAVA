
public class Exam extends GradedActivity{

	private double grammarScore;
	private double maxGrammarScore = 30;

	private double spellingScore;
	private double maxSpellingScore = 20;

	private double correctLengthScore;
	private double maxCorrectLengthScore = 20;

	private double contentScore;
	private double maxContentScore = 30;

	public Exam(double grammarScore, double spellingScore, double correctLengthScore, double contentScore) {

		this.grammarScore = grammarScore;
		this.spellingScore = spellingScore;
		this.correctLengthScore = correctLengthScore;
		this.contentScore = contentScore;

		setScore(gradeExam());

	}

	public double gradeExam(){

		double totalMaxScore = maxContentScore + maxCorrectLengthScore + maxGrammarScore + maxSpellingScore;

		double totalExamScore = contentScore + correctLengthScore + grammarScore + spellingScore;

		return (totalExamScore / totalMaxScore) * 100;

	}

}