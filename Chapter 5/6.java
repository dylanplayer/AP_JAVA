class Main {
  public static void main(String[] args) {

		int number = 25;
    
		System.out.printf("Sum of %d is %d",number, sumInt(number));


  }

	/** 
	@param number to sum
	@return sum
	*/
	public static int sumInt(int number){

		int sum = 0;
		String temp = String.valueOf(number);
		String[] numArr = new String[temp.length()];
		for(int i = 0; i < temp.length(); i++){

			numArr[i] = "" + temp.charAt(i) + "";

			sum += Integer.parseInt(numArr[i]);

		}

		return sum;

	}
}