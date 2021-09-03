import java.util.*;
import java.io.*;

class Main {

  public static void main(String[] args) throws FileNotFoundException {

		PrintWriter pw = new PrintWriter("Number List.txt");

		int max = 100;
		int min = 0;

		for(int i = min; i <= max; i++){

			if(isPrime(i)){
				pw.println(i);
			}

		}

		pw.close();


  }

	public static boolean isPrime(int number){

		if(number == 1){

			return false;

		}else if((number%2) == 0){

			return false;

		}else{

			return true;

		}

	}

}