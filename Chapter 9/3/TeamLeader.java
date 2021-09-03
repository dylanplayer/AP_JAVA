

public class TeamLeader extends ProductionWorker{

	private double _monthlyBonus;
	private int _requiredTrainingHours;
	private int _trainingHoursComplete;

	public TeamLeader(String name, String employeeNumber, String hireDate, double monthlyBonus, int requiredTrainingHours){

		super(name, employeeNumber, hireDate, 1, 25.43);

		setMonthlyBonus(monthlyBonus);
		setRequiredTrainingHours(requiredTrainingHours);
		setCompleteTrainingHours(0);

	}

	public void setMonthlyBonus(double monthlyBonus){

		_monthlyBonus = monthlyBonus;

	}

	public void setRequiredTrainingHours(int numberOfHours){

		_requiredTrainingHours = numberOfHours;

	}

	public void setCompleteTrainingHours(int numberOfHours){

		_trainingHoursComplete = numberOfHours;

	}

	public double getMonthlyBonus(){

		return _monthlyBonus;

	}

	public int getRequiredHoursOfTraining(){

		return _requiredTrainingHours;

	}

	public int getNumberOfCompleteTrainingHours(){

		return _trainingHoursComplete;

	}

	public void print(){

		System.out.printf("|%s|%s|%s|%.2f|%d/%d|", getName(), getEmployeeNumber(), getHireDate(),getMonthlyBonus(), getNumberOfCompleteTrainingHours(), getRequiredHoursOfTraining());

	}

}