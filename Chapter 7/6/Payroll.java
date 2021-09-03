import java.util.ArrayList;

public class Payroll {

    private ArrayList<Employee> employeeList;

    /**
     * Create payroll object
     */
    public Payroll(){

        employeeList = new ArrayList<Employee>();

    }

    /**
     * Add employee to payroll
     * @param employee
     */
    public void addEmployee(Employee employee){

        if(!isIDTaken(employee.getId())){
            
            employeeList.add(employee);

        }

    }

    /**
     * Remove employee from payroll
     * @param employee
     */
    public void removeEmployee(Employee employee){

        employeeList.remove(employee);

    }

    /**
     * Get employee's gross pay at i
     * @param i
     */
    public double getGrossPay(int i){

        return employeeList.get(i).getGrossPay();

    }

    /**
     * Set employee id at i
     * @param i
     * @param id
     */
    public void setEmployeeIdAt(int i, int id){

        employeeList.get(i).setId(id);

    }

    /**
     * Set employee's hours worked at i
     * @param i
     * @param hoursWorked
     */
    public void setHoursAt(int i, double hoursWorked){

        employeeList.get(i).setHoursWorked(hoursWorked);

    }

    /**
     * Set employee's payrate at i
     * @param i
     * @param payRate
     */
    public void setPayRateAt(int i, double payRate){

        employeeList.get(i).setHoursWorked(payRate);

    }

    /**
     * Get employee's gross pay at i
     * @param i
     * @return grossPay
     */
    public double getGrossPayAt(int i){

        return employeeList.get(i).getGrossPay();

    }

    /**
     * Get employee's ID at i
     * @param i
     * @return Id
     */
    public int getEmployeeIdAt(int i){

        return employeeList.get(i).getId();

    }

    /**
     * Get employee's hours at i
     * @param i
     * @return hoursWorked
     */
    public double getEmployeeHoursAt(int i){

        return employeeList.get(i).getHoursWorked();

    }

    /**
     * Get employee's pay rate at i
     * @param i
     * @return payRate
     */
    public double getEmployeePayRateAt(int i){

        return employeeList.get(i).getPayRate();

    }

    /**
     * Checks if ID is taken
     * @param id
     * @return isIdTaken
     */
    public boolean isIDTaken(int id){

        for(int i = 0; i < employeeList.size(); i++){

            if(employeeList.get(i).getId() == id){

                return true;

            }

        }

        return false;

    }

    public void printInfoAt(int i){

        System.out.printf("Employee id: %d\n", getEmployeeIdAt(i));
        System.out.printf("Hours Worked: %f\n", getEmployeeHoursAt(i));
        System.out.printf("Payrate: %f\n", getEmployeePayRateAt(i));
        System.out.printf("Gross Pay: %f\n", getGrossPayAt(i));


    }

    public int getNumberOfEmployees(){

        return employeeList.size();
    
    }
    
}
