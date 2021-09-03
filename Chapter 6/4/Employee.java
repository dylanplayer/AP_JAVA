public class Employee {

    private String NAME;
    private int ID;
    private String DEPARTMENT;
    private String POSITION;


    public Employee(String name, int id, String department, String position){

        NAME = name;
        ID = id;
        DEPARTMENT = department;
        POSITION = position;


    }

    //setters

    /**
     * Sets employee's name
     * 
     * @param name
     */
    public void setName(String name){

        NAME = name;

    }

     /**
     * Sets employee's id
     * 
     * @param ID
     */
    public void setId(int id){

        ID = id;

    }

     /**
     * Sets employee's department
     * 
     * @param department
     */
    public void setDepartment(String department){

        DEPARTMENT = department;

    }

     /**
     * Sets employee's position
     * 
     * @param position
     */
    public void setPosition(String position){

        POSITION = position;

    }

    //getters

    /**
     * Gets employee's name
     * 
     * @return name
     */
    public String getName(){

        return NAME;

    }

     /**
     * Gets employee's id
     * 
     * @return ID
     */
    public int getId(){

        return ID;

    }

     /**
     * Gets employee's department
     * 
     * @return department
     */
    public String getDepartment(){

        return DEPARTMENT;

    }

     /**
     * Gets employee's position
     * 
     * @return position
     */
    public String getPosition(){

        return POSITION;

    }

    /**
     * Prints Name, ID, Department, and Position to the console
     * 
     */

    public void printData(){

        System.out.printf("Name: %s | ID: %d | Department: %s | Position: %s\n", NAME, ID, DEPARTMENT, POSITION);

    }

    
}
