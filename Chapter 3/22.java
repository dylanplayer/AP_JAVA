class Main {
  public static void main(String[] args) {

      /*3.20 Assume the variable name references a String object. Write an if statement that displays “Do I know you?” if the String object contains “Timothy”.*/

    String name = "Timothy";

    if(name.equals("Timothy")){
      
      System.out.println("Do I know you?");

    }

    System.out.println("------------------");
    
      /*3.21 Assume the variables name1 and name2 reference two different String objects, containing different strings. Write code that displays the strings referenced by these
      variables in alphabetical order. */

    String name1 = "Bds";
    String name2 = "ads";

    

    if(name1.compareTo(name2) <= 0){

      System.out.println(name1);
      System.out.println(name2);


    }else{

      System.out.println(name2);
      System.out.println(name1);

    }

    System.out.println("------------------");
    /*3.22 Modify the statement you wrote in response to Checkpoint 3.20 so it performs a
    case-insensitive comparison.;*/

    if(name1.compareToIgnoreCase(name2) <= 0){

      System.out.println(name1);
      System.out.println(name2);


    }else{

      System.out.println(name2);
      System.out.println(name1);

    }



  }
}