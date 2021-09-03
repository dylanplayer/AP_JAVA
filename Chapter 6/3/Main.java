
class Main {

    public static void main(String[] args){


        Car myCar = new Car(2014, "Chevorlet", "Silverado");

        myCar.printData();

        myCar.accelerate(25);

        myCar.printSpeed();

        myCar.brake(25);

        myCar.printSpeed();



    }

}