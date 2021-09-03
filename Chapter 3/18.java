class Main {
  public static void main(String[] args) {
  /*3.16 The following truth table shows various combinations of the values true and false
connected by a logical operator. Complete the table by circling T or F to indicate
whether the result of such a combination is true or false.
Logical Expression Result (true or false)
true && false F
true && true T
false && true F
false && false F
true || false T
true || true T
false || true T
false || false F
!true F
!false T*/


/*3.17 Assume the variables a = 2, b = 4, and c = 6. Circle the T or F for each of the following
conditions to indicate whether it is true or false.
a == 4 || b > 2 T
6 <= c && a > 3 F
1 != b && c != 3 T
a >= -1 || a <= b T
!(a > 2) T*/


/*3.18 Write an if statement that displays the message "The number is valid" if the variable
speed is within the range 0 through 200.*/

int speed = 150;
System.out.println((speed > 0) ? (speed < 200) ? "The number is valid" : " " : " ");


/*3.19 Write an if statement that displays the message "The number is not valid" if the
variable speed is outside the range 0 through 200.*/

System.out.println((speed > 0) ? (speed < 200) ? "The number is valid" : "The number is not valid" : "The number is not valid");


  }
}