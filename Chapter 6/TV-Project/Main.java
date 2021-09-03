import java.util.Scanner;

class Main {

    public static void main(String[] args){

        Television tv = new Television("Toshiba", 55);
        
        tv.increaseVolume();
        tv.power();
        System.out.printf("A %d inch %s has been turned on\n", tv.getScreenSize(), tv.getManufacturer());
        System.out.print("What channel do you want? ");

        Scanner scan = new Scanner(System.in);
        tv.setChannel(scan.nextInt());

        System.out.printf("Channel: %d Volume: %d\n", tv.getChannel(), tv.getVolume());

        System.out.println("Too loud! Lowering the volume.");
        for(int i = 0; i < 6; i++){

            tv.decreaseVolume();

        }
        
        System.out.printf("Channel: %d Volume: %d\n", tv.getChannel(), tv.getVolume());

    }


}