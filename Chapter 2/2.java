class Main {




  public static void main(String[] args) {
    
    int customersSurveyed = 12467;
    double percentWhoBuy1OrMoreAWeek = 0.14; 
    double percentPreferCitrusFlavor = 0.64;

    double apxWhoBuy1OrMoreAWeek = customersSurveyed * percentWhoBuy1OrMoreAWeek;
    double apxpercentPreferCitrusFlavor = customersSurveyed * percentPreferCitrusFlavor;

    System.out.println("Number of customers that buy 1 or more drinks per week: " + apxWhoBuy1OrMoreAWeek);
    System.out.println("Number of customers that prefer citrus flavor: " + apxpercentPreferCitrusFlavor);


  }
}