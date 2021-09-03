import java.util.Scanner;
class Main {
  
  public static void main(String[] args) {

    Integer numberOfScores = 0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of test scores: ");

    numberOfScores = Integer.parseInt(scan.next());
    double[] scores = new double[numberOfScores];

    System.out.println("------------------");

    for(int i = 0; i < numberOfScores; i++){

      System.out.print("Enter score " + (i+1) + ": ");

      Double tempScore = Double.parseDouble(scan.next());

      scores[i] = tempScore;

    }

    System.out.println("------------------");

    for(int i = 0; i < numberOfScores; i++){

      if(scores[i] >= 89.45){

        System.out.println("Score " + (i+1) + " = " + scores[i] + " A ");

      }else if(scores[i] < 89.45 && scores[i] >= 79.45 ){

        System.out.println("Score " + (i+1) + " = " + scores[i] + " B ");

      }else if(scores[i] < 79.45 && scores[i] >= 69.45 ){

        System.out.println("Score " + (i+1) + " = " + scores[i] + " C ");

      }else if(scores[i] < 69.45 && scores[i] >= 59.45 ){

        System.out.println("Score " + (i+1) + " = " + scores[i] + " D ");

      }else if(scores[i] < 59.45){

        System.out.println("Score " + (i+1) + " = " + scores[i] + " F ");

      }


    }


  }
}