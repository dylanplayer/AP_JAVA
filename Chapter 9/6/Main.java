

class Main {

  public static void main(String[] args) {

		Customer myCustomer = new Customer("Dave", "123 abc ln", "(123)456-7890", "163-12", true);

		System.out.printf("|%s|%s|%s|%s|%b|", myCustomer.getName(), myCustomer.getAddress(), myCustomer.getPhoneNumber(), myCustomer.getCustomerNumber(), myCustomer.isCustomerOnMailingList());

  }

}