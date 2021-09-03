

public class EmployeeStuff {

    public int[] _numberOfEmployees;
    public double[] _numberOfPayRates;
    public float[] _numberOfMiles;
    public char[] _numberOfLetters;


    public EmployeeStuff(int numberOfEmplyees, int numberOfPayRates, int numberOfMiles, int numberOfLetters){

        _numberOfEmployees = new int[numberOfEmplyees];
        _numberOfPayRates = new double[numberOfPayRates];
        _numberOfMiles = new float [numberOfMiles];
        _numberOfLetters = new char[numberOfPayRates];

    }
    
}
