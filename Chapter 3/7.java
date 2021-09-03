import java.util.Scanner;

class Main {


  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    Integer seconds = 0;
    int minutes = 0;
    int secondsLeft = 0;
    int hours = 0;
    int days = 0;

    int secondsInMinute = 60;
    int minutesInHour = 60;
    int hoursInDay = 24;

    System.out.print("Enter Seconds: ");
    seconds = Integer.parseInt(scan.next());

    if(seconds >= secondsInMinute & seconds < 3600){

        minutes = (int) (seconds/secondsInMinute);
        secondsLeft = seconds % secondsInMinute;

    }else if(seconds >= 3600 && seconds < 86400){

      minutes = (int) (seconds/secondsInMinute);
      secondsLeft = seconds % secondsInMinute;
      hours = (int) (minutes/minutesInHour);
      minutes = seconds % 3600;

    }else if(seconds >= 86400){

      minutes = (int) (seconds/secondsInMinute);      secondsLeft = seconds % secondsInMinute;
      hours = (int) (minutes/minutesInHour);
      days = (int) (hours/hoursInDay);
      minutes -= (hours * minutesInHour);
      hours -= (days * hoursInDay);
      

    }else{

      secondsLeft = seconds;

    }

    System.out.println(seconds + " Seconds:\n" + days + " days " + hours + " hours " + minutes + " minutes " + secondsLeft + " seconds");





  }


}