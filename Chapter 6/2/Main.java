

class Main{

    public static void main(String[] args){


        Employee employee1 = new Employee("Jane", "Doe", 1, 15.34, 40.3);
        Employee employee2 = new Employee("John", "Doe", 2, 20.86, 39.8);

        Payroll myPayroll = new Payroll();

        myPayroll.addEmployee(employee1);
        myPayroll.addEmployee(employee2);

        myPayroll.printEmployees();
        


    }

}