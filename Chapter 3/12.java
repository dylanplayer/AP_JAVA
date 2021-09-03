import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    //System.out.print("Enter the number of names: ");
    //Integer numberOfNames = Integer.parseInt(scan.next());
    int numberOfNames = 3;
    String[] names = new String[numberOfNames];
    double[] times = new double[numberOfNames];

    for(int i = 0; i < numberOfNames; i++){

      System.out.printf("Enter name %d:", (i+1));
      names[i] = scan.nextLine();

    }

    for(int i = 0; i < numberOfNames; i++){

      System.out.printf("\nEnter the time for %s (in minutes):", names[i]);

      times[i] = scan.nextDouble();


    }

    double tempD = 0.0;
    String tempS = "";

      if(times[0] < times[1] && times[0] < times[2]){

        
        if(times[1] > times[2]){

        tempD = times[1];
        times[1] = times[2];
        times[2] = tempD;

        tempS = names[1];
        names[1] = names[2];
        names[2] = tempS;

        }


      }else if(times[0] > times[1] && times[0] < times[2]){

        tempD = times[1];
        times[1] = times[0];
        times[0] = tempD;

        tempS = names[1];
        names[1] = names[0];
        names[0] = tempS;

        if(times[0] > times[2]){

        tempD = times[2];
        times[2] = times[0];
        times[0] = tempD;

        tempS = names[2];
        names[2] = names[0];
        names[0] = tempS;

        }
        
        
      }else if(times[0] > times[1] && times[0] > times[2]){

        tempD = times[2];
        times[2] = times[0];
        times[0] = tempD;

        tempS = names[2];
        names[2] = names[0];
        names[0] = tempS;

        if(times[1] < times[0]){

        tempD = times[0];
        times[0] = times[1];
        times[1] = tempD;

        tempS = names[0];
        names[0] = names[1];
        names[1] = tempS;

        }

      }

      for(int i = 0; i < numberOfNames; i++){

        System.out.println(names[i]);

      }

    


  }
}