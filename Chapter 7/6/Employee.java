import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Employee {

    private int _id;
    private double _hoursWorked;
    private double _payRate;
    private File employeeFile;
    private FileWriter employeeFileWriter;
    private PrintWriter employeePrintWriter;

    /**
     * Creates employee object
     * 
     * @param id
     * @param hoursWorked
     * @param payRate
     * @throws IOException
     */
    public Employee(int id, double hoursWorked, double payRate){

        _id = id;
        _hoursWorked = hoursWorked;
        _payRate = payRate;

        try{
        employeeFile = new File("Employees.csv");
        
        
        if(!employeeFile.exists()){
            
            employeeFileWriter = new FileWriter(employeeFile, false);
            
            employeePrintWriter = new PrintWriter(employeeFileWriter);

            String tempString = String.format("%d,%f,%f", id, hoursWorked, payRate);
            
            employeePrintWriter.println(tempString);

        }else{

            employeeFileWriter = new FileWriter(employeeFile, true);

            employeePrintWriter = new PrintWriter(employeeFileWriter);

            String tempString = String.format("%d,%f,%f", id, hoursWorked, payRate);
            
            employeePrintWriter.println(tempString);

        }
        

       

        employeePrintWriter.close();

    }catch(IOException e){

        System.out.println("IO Exception");

    }


    }

    //Setters
    
    /**
     * Set employee's id
     * @param id
     */
    public void setId(int id){

        _id = id;

    }

    /**
     * Set employee's hours workes
     * @param hoursWorked
     */
    public void setHoursWorked(double hoursWorked){

        _hoursWorked = hoursWorked;

    }

    /**
     * Set employee's pay rate
     * @param hoursWorked
     */
    public void setPayRate(double payRate){

        _payRate = payRate;

    }

    //Getters

    /**
     * Get employee's ID
     * @return id
     */
    public int getId(){

        return _id;

    }

    /**
     * Get employee's hours worked
     * @return hoursWorked
     */
    public double getHoursWorked(){

        return _hoursWorked;

    }

    /**
     * Get employee's pay rate
     * @return payRate
     */
    public double getPayRate(){

        return _payRate;

    }

    //Other

    /**
     * Get employee's gross pay
     * @return grossPay
     */
    public double getGrossPay(){

        return _payRate * _hoursWorked;

    }
    
}
