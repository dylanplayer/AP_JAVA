import java.util.ArrayList;

class Main {

  public static void main(String[] args) {

		ArrayList<String> arrList = new ArrayList();

		String frogs = "Frogs";
		String lizards = "Lizards";

		arrList.add(frogs);
		arrList.add(lizards);


		for(int i = 0; i < arrList.size(); i++){

			System.out.println(arrList.get(i));

		}

  }
}