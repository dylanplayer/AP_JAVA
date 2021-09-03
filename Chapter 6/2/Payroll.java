import java.util.*;

public class Payroll {

    private ArrayList<Employee> EMPLOYEE_LIST = new ArrayList<Employee>();

    public Payroll(){

        

    }


    /**
     * Add employee to payroll
     * @param employee
     */
    public void addEmployee(Employee employee){

        EMPLOYEE_LIST.add(employee);

    }

    /**
     * Add employee to payroll
     * @param employee
     */
    public void removeEmployee(Employee employee){

        EMPLOYEE_LIST.remove(employee);

    }

    /**
     * Print all Employees
     */
    public void printEmployees(){

        System.out.printf("%d Employees\n", EMPLOYEE_LIST.size());

        for(int i = 0; i < EMPLOYEE_LIST.size(); i++){

            EMPLOYEE_LIST.get(i).printData();

        }

    }
    
}
