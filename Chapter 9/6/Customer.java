

public class Customer extends Person{

	private String customerNumber;
	private boolean mailingList;

	public Customer(){

		super();
		customerNumber = "";
		mailingList = false;

	}

	public Customer(String name, String address, String phoneNumber, String customerNumber, boolean mailingList){

		super(name, address, phoneNumber);
		this.customerNumber = customerNumber;
		this.mailingList = mailingList;

	}

	public void setCustomerNumber(String customerNumber){

		this.customerNumber = customerNumber;

	}

	public void setMailingList(boolean mailingList){

		this.mailingList = mailingList;

	}

	public String getCustomerNumber(){

		return customerNumber;

	}

	public boolean isCustomerOnMailingList(){

		return mailingList;

	}

}