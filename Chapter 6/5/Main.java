class Main {

  public static void main(String[] args) {
    

		Account dave = new Account("Dave", "123 address ln city state 12345", 20, "(123)456-7890");
		Account bill = new Account("Bill", "456 address ln city state 12345", 30, "(456)456-7890");
		Account bob = new Account("Bob", "789 address ln city state 12345", 40, "(789)456-7890");

		System.out.printf("|%s|%s|%d|%s|\n", dave.getName(), dave.getAddress(), dave.getAge(), dave.getPhoneNumber());
		System.out.printf("|%s|%s|%d|%s|\n", bill.getName(), bill.getAddress(), bill.getAge(), bill.getPhoneNumber());
		System.out.printf("|%s|%s|%d|%s|\n", bob.getName(), bob.getAddress(), bob.getAge(), bob.getPhoneNumber());

		

  }

}