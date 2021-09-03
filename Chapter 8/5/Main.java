import java.util.*;

class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double w;
        double l;
        System.out.print("Enter tract 1 width: ");
        w = Double.parseDouble(scan.next());
        System.out.print("Enter tract 1 length: ");
        l = Double.parseDouble(scan.next());
        LandTract t1 = new LandTract(l,w);

        System.out.print("Enter tract 2 width: ");
        w = Double.parseDouble(scan.next());
        System.out.print("Enter tract 2 length: ");
        l = Double.parseDouble(scan.next());
        LandTract t2 = new LandTract(l,w);

        System.out.printf("Tract 1 area: %.2f\n", t1.getArea());
        System.out.printf("Tract 2 area: %.2f\n", t2.getArea());

        if(t1.equals(t2)){

            System.out.println("Tracts are equal");

        }else{

            System.out.println("Tracts are not equal");

        }

        scan.close();
    }
}