class Main {
  public static void main(String[] args) {
    

    for(int i = 0; i < 7; i++){


      for(int x = i; x < 6; x++){

        System.out.print("*");

      }
      for(int y = i; y > 0; y--){

        System.out.print(" ");

      }
      System.out.print(" ");

      for(int y = 0; y < 12-(i*2); y++){

        System.out.print("/");

      }

      for(int v = i*2; v > 0; v--){

        System.out.print("\\");

      }
      
      System.out.print(" ");

      for(int y = i; y > 0; y--){

        System.out.print(" ");

      }

      for(int x = i; x < 6; x++){

        System.out.print("*");

      }

      


      System.out.println();


    }


  }
}