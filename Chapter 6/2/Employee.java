

public class Employee {

    private String FIRST_NAME;
    private String LAST_NAME;
    private String FULL_NAME;
    private int ID;
    private double HOURS_WORKED;
    private double WAGE;


    /**
     * Creates Employee Object
     */
    public Employee(){

        FIRST_NAME = "";
        LAST_NAME = "";
        FULL_NAME = FIRST_NAME + " " + LAST_NAME;
        ID = 0;
        WAGE = 0.0;
        HOURS_WORKED = 0;

    }

    /**
     * Creates Employee Object
     * @param frist
     * @param last
     * @param id
     * @param wage
     * @param hours
     */
    public Employee(String frist, String last, int id, double wage, double hours){

        FIRST_NAME = frist;
        LAST_NAME = last;
        FULL_NAME = FIRST_NAME + " " + LAST_NAME;
        ID = id;
        WAGE = wage;
        HOURS_WORKED = hours;

    }

    //Setters

    /**
     * Sets first name
     * @param first
     */
    public void setFirstName(String first){

        FIRST_NAME = first;

    }

    /**
     * Sets last name
     * @param last
     */
    public void setLastName(String last){

        LAST_NAME = last;

    }

    /**
     * Sets hours worked
     * @param hours
     */
    public void setHours(double hours){

        HOURS_WORKED = hours;

    }

    /**
     * Sets ID
     * @param id
     */
    public void setId(int id){

        ID = id;

    }

    /**
     * Sets Wage
     * @param wagw
     */
    public void setWage(double wage){

        WAGE = wage;

    }

    //Getters

    /**
     * Gets first name
     * @return firstName
     */
    public String getFirstName(){

        return FIRST_NAME;

    }

    /**
     * Gets last name
     * @return lastName
     */
    public String getLastName(){

        return LAST_NAME;

    }

    /**
     * Gets full name
     * @return fullName
     */
    public String getFullName(){

        return FULL_NAME;

    }

    /**
     * Gets ID
     * @return ID
     */
    public int getId(){

        return ID;

    }

    /**
     * Gets hours worked
     * @return hoursWorked
     */
    public double getHours(){

        return HOURS_WORKED;

    }

    /**
     * Gets wage
     * @return wage
     */
    public double getWage(){

        return WAGE;

    }

    //Other


    /**
     * Gets gross pay
     * @return grossPay
     */
    public double getGrossPay(){

        return WAGE * HOURS_WORKED;

    }

    /**
     * Prints all employee data
     */
    public void printData(){

        System.out.printf("|ID: %d|Name: %s|Wage %.2f|Hours Worked: %.2f|\n", ID, FULL_NAME, WAGE, HOURS_WORKED);

    }

    
}
