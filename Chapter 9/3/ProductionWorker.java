/**
   The ProductionWorker class stores data about 
   an employee who is a production worker for the 
   TeamLeader Class programming challenge.
*/

public class ProductionWorker extends Employee
{
   // Constants for the day and night shifts.
   public static final int DAY_SHIFT = 1;
   public static final int NIGHT_SHIFT = 2;

   private int shift;         // The employee's shift
   private double payRate;    // The employee's pay rate

   /**
      This constructor initializes an object with a name,
      employee number, hire date, shift, and pay rate
      @param n The employee's name.
      @param num The employee's number.
      @param date The employee's hire date.
      @param sh The employee's shift.
      @param rate The employee's pay rate.
   */
   
   public ProductionWorker(String n, String num, String date,int sh, double rate)
   {
      super(n, num, date);
      shift = sh;
      payRate = rate;
   }

   /**
      The no-arg constructor initializes an object with
      null strings for name, employee number, and hire
      date. The day shift is selected, and the pay rate
      is set to 0.0.
   */
   
   public ProductionWorker()
   {
      super();
      shift = DAY_SHIFT;
      payRate = 0.0;
   }
   
   /**
      The setShift method sets the employee's shift.
      @param s The employee's shift.
   */

   public void setShift(int s)
   {
      shift = s;
   }

   /**
      The setPayRate method sets the employee's pay rate.
      @param p The employee's pay rate.
   */
   
   public void setPayRate(double p)
   {
      payRate = p;
   }

   /**
      The getShift method returns the employee's shift.
      @return The employee's shift.
   */
   
   public int getShift()
   {
      return shift;
   }

   /**
      The getPayRate method returns the employee's pay rate.
      @return The employee's pay rate.
   */
   
   public double getPayRate()
   {
      return payRate;
   }
   
   /**
      toString method
      @return A reference to a String representation of
              the object.
   */
   
   @Override
   public String toString()
   {  
      String str = super.toString();
      
      str += "\nShift: ";
      if (shift == DAY_SHIFT)
         str += "Day";
      else if (shift == NIGHT_SHIFT)
         str += "Night";
      else
         str += "INVALID SHIFT NUMBER";
      
      str += String.format("\nHourly Pay Rate: $%,.2f", payRate);
             
      return str;
   }
}
