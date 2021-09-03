import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {

    private static Payroll payroll;

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(System.in);

        payroll = new Payroll();

        getEmployeesFromFile();

        String input;

        System.out.println("Enter /h to get help");

        try{
        while(true) {

            System.out.print("input: ");
            input = scan.next();

            if (input.equals("/h")) {

                System.out.println("Command List");
                System.out.println("/h : Help");
                System.out.println("/a : Add employee");
								System.out.println("/p : prints all employees");
                System.out.println("Enter employee id to print specific information");

            } else if (input.equals("/a")) {

                int id;
                double hoursWorked;
                double payRate;

                do {
                    System.out.print("Enter employee id: ");
                    id = Integer.parseInt(scan.next());
                } while (payroll.isIDTaken(id));

								
								do{
                System.out.print("Enter hours worked: ");
                hoursWorked = Double.parseDouble(scan.next());
								}while(hoursWorked < 0 );

								do{
                System.out.print("Enter payRate: ");
                payRate = Double.parseDouble(scan.next());
								}while(payRate < 6);

                payroll.addEmployee(new Employee(id, hoursWorked, payRate));

            }else if (input.equals("/p")) {

                

                for(int i = 0; i < payroll.getNumberOfEmployees(); i++){

                    System.out.println("--------------");

                    payroll.printInfoAt(i);


                }
                System.out.println("--------------");

            }else if (payroll.isIDTaken(Integer.parseInt(input))) {

                for(int i = 0; i < payroll.getNumberOfEmployees(); i++){

                    if(payroll.getEmployeeIdAt(i) == Integer.parseInt(input)){

                        payroll.printInfoAt(i);
                        break;

                    }

                }

            }else if(!payroll.isIDTaken(Integer.parseInt(input))){

                System.out.printf("Id: %d not found\n", input);

            }else{

                System.out.println("Command not know type \\h for help");

            }

            System.out.println("++++++++++++++");

        }
    }catch(Exception e){

        scan.close();


    }
        
        

    }

    public static void getEmployeesFromFile() throws FileNotFoundException {

        int numberOfEmployees = 0;
        File file = new File("Employees.csv");
        
        if(file.exists()) {
            
            
        
                Scanner fileScanner = new Scanner(file);
                Scanner newFileScanner = new Scanner(file);

                while(fileScanner.hasNextLine()){

                    numberOfEmployees++;
                    fileScanner.nextLine();

                }


                for(int i = 0; i < numberOfEmployees; i++){


                    int id;
                    double hoursWorked;
                    double payRate;

                    String line = newFileScanner.nextLine();

                    String[] stuff = line.split(",", 3);

                    id = Integer.parseInt(stuff[0]);
                    hoursWorked = Double.parseDouble(stuff[1]);
                    payRate = Double.parseDouble(stuff[2]);

                    if(!payroll.isIDTaken(id)){

                        payroll.addEmployee(new Employee(id, hoursWorked, payRate));

                    }

                }

                

            fileScanner.close();
            newFileScanner.close();


        }

    }


}