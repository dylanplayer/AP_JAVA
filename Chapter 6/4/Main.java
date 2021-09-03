

class Main{

    public static void main(String[] args){

        Employee SusanMeyers = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee MarkJones = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee JoyRogers = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        SusanMeyers.printData();
        MarkJones.printData();
        JoyRogers.printData();


    }

}