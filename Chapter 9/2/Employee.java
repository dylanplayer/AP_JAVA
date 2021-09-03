
public class Employee {
    
    private String _name;
    private int _idNumber;
    private String _hireDate;
    private double _salary;
    private String _employeeType;

    public Employee(String name, int idNumber, String hireDate, double salary){

        _name = name;
        _idNumber = idNumber;
        _hireDate = hireDate;
        _salary = salary;
        _employeeType = "Employee";

    }

    public void setName(String name){

        _name = name;

    }

    public void setIdNumber(int idNumber){

        _idNumber = idNumber;

    }

    public void setHireDate(String hireDate){

        _hireDate = hireDate;

    }

    public void setSalary(double salary){

        _salary = salary;

    }

    public void setEmployeeType(String employeeType){

        _employeeType = employeeType;

    }

    public String getName(){

        return _name;

    }

    public int getIdNumber(){

        return _idNumber;

    }

    public String getHireDate(){

        return _hireDate;

    }

    public double getSalary(){

        return _salary;

    }

    public String getEmployeeType(){

        return _employeeType;

    }

    public String toString(){

        return "|" + getIdNumber() + "|" + getEmployeeType() + "|" + getName() + "|" + getSalary() + "|";

    }

}
