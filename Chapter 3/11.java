import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    Double calories = 0.0;
    Double fat = 0.0;
    double percentageFat = 0.0;

    System.out.print("Enter Calories: ");
    calories = Double.parseDouble(scan.next());

    System.out.print("Enter Fat(grams): ");
    fat = Double.parseDouble(scan.next());

    percentageFat = fat/calories;

    System.out.printf("Percentage fat: %%%.2f\n", (percentageFat * 100));

    if(percentageFat < .3){

      System.out.println("This item is Low-Fat");

    }

  }
}