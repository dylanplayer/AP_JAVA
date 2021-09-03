class Main {
  public static void main(String[] args) {
    

/*3.29 Assume the following variable declaration exists in a program:
double number = 1234567.456;
Write a statement that uses System.out.printf to display the value of the number
variable formatted as:
1,234,567.46*/

    double number = 1234567.456;
    System.out.printf("%,.2f", number);



/*3.30 Assume the following variable declaration exists in a program:
double number = 123.456;
Write a statement that uses System.out.printf to display the value of the number
variable rounded to one decimal place, in a field that is 10 spaces wide. (Do not use
comma separators.)*/


    number = 123.456;
    System.out.printf("\n%10.1f", number);



/*3.31 Assume the following variable declaration exists in a program:
double number = 123.456;
Write a statement that uses System.out.printf to display the value of the number
variable padded with leading zeros, in a field that is eight spaces wide, rounded to
one decimal place. (Do not use comma separators.)
*/

    System.out.printf("\n%08.1f", number);


/*3.32 Assume the following variable declaration exists in a program:
int number = 123456;
Write a statement that uses System.out.printf to display the value of the number
variable in a field that is 10 spaces wide, with comma separators.*/

    int number1 = 123456;
    System.out.printf("\n%,10d", number1);


/*3.33 Assume the following variable declaration exists in a program:
double number = 123456.789;
Write a statement that uses System.out.printf to display the value of the number
variable left-justified, with comma separators, in a field that is 20 spaces wide,
rounded to two decimal places.*/

    number = 123456.789;
    System.out.printf("\n%-,20.2f", number);


/*3.34 Assume the following declaration exists in a program:
String name = "James";
Write a statement that uses System.out.printf to display the value of name in a
field that is 20 spaces wide.*/

    String name = "James";
    System.out.printf("\n%20s", name);

  }
}