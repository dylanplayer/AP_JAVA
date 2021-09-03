import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
      Scanner scan = new Scanner(System.in);

      String temp;

      System.out.print("Enter number of names: ");
      Integer numberOfStrings = Integer.parseInt(scan.next());
      String[] names = new String[numberOfStrings];

      for(int i = 0; i < numberOfStrings; i++){

        System.out.print("Enter name" + (i + 1) + ": ");
        names[i] = scan.next();

      }

      for(int i = 0; i < numberOfStrings; i++){

        for(int j = i + 1; j < numberOfStrings; j++){

          if(names[j].compareToIgnoreCase(names[i]) <= 0){

            temp = names[i];
            names[i] = names[j];
            names[j] = temp;
            
          }



        }


      }

      for(int x = 0; x < numberOfStrings; x++){

          System.out.println(names[x]);

        }



      




  }
}