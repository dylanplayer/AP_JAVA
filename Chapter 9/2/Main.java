

class Main{

    public static void main(String[] args) {

        Employee employee = new Employee("John", 1, "1/1/2020", 85000.00);
        Supervisor supervisor = new Supervisor("Bill", 2, "1/1/2018", 120000.00, 15000);

        System.out.println("--------------------------------------");
        System.out.println(employee.toString());
        System.out.println(supervisor.toString());
        System.out.println("--------------------------------------");
        
    }

}