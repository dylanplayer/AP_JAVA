

public class Supervisor extends Employee{

    private double _bonus;
		
    public Supervisor(String name, int idNumber, String hireDate, double salary, double bonus){

        super(name, idNumber, hireDate, salary);
        setEmployeeType("Supervisor");
        _bonus = bonus;


    }

    public void setBonus(double bonus){

        _bonus = bonus;

    }

    public double getBonus(){

        return _bonus;

    }

    public String toString(){

        return "|" + getIdNumber() + "|" + getEmployeeType() + "|" + getName() + "|" + getSalary() + "|" + getBonus() + "|";

   }

}