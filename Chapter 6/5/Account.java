//name, address, age, and phone number

public class Account{

	private String NAME;
	private String ADDRESS;
	private int AGE;
	private String PHONE_NUMBER;


	public Account(String name, String address, int age, String phoneNumber){

		NAME = name;
		ADDRESS = address;
		AGE = age;
		PHONE_NUMBER = phoneNumber;

	}


	//Setters

	/**
	*@param name
	*Sets the name on the account
	*@returns void
	*/

	public void setName(String name){

		NAME = name;

	}

	/**
	*@param address
	*Sets the address on the account
	*@returns void
	*/
	
	public void setAddress(String address){

		ADDRESS = address;

	}

	/**
	*@param age
	*Sets the age on the account
	*@returns void
	*/
	
	public void setAge(int age){

		AGE = age;

	}

	/**
	*@param phone number
	*Sets the phone number on the account
	*@returns void
	*/
	
	public void setPhoneNumber(String phoneNumber){

		PHONE_NUMBER = phoneNumber;

	}

	//Getters

	/**
	*
	*Gets the name on the account
	*@returns name
	*/
	
	public String getName(){

		return NAME;

	}

	/**
	*
	*Gets the address on the account
	*@returns address
	*/
	
	public String getAddress(){

		return ADDRESS;

	}

	/**
	*
	*Gets the age on the account
	*@returns age
	*/
	
	public int getAge(){

		return AGE;

	}

	/**
	*
	*Gets the phone number on the account
	*@returns phone number
	*/
	
	public String getPhoneNumber(){

		return PHONE_NUMBER;

	}




}