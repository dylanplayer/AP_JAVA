

public class Poodle extends Dog{

	private String _type;
	private int _adaptability;
	private int _allAroundFriendliness;


	public Poodle(String name, double weight, String gender, String type){

		setName(name);
		setWeight(weight);
		setGender(gender);
		_type = type;

		addTrait("Elegant");
		addTrait("Proud");
		addTrait("Clever");

		setHypoAllergenic(true);

		_adaptability = 4;
		_allAroundFriendliness = 5;

	}

	public String getType(){

		return _type;

	}

	public int getAdaptability(){

		return _adaptability;

	}

	public int getFriendliness(){
	
		return _allAroundFriendliness;

	}

	public static void printPoodle(Poodle poodle1){

		System.out.printf("Name: %s\n", poodle1.getName());
		System.out.printf("Weight: %.1flbs\n", poodle1.getWeight());
		System.out.printf("Gender: %s\n", poodle1.getGender());
		System.out.printf("Breed: %s\n", poodle1.getType());
		System.out.printf("Hypoallergenic: %b\n", poodle1.isHypoAllergenic());

		System.out.print("Traits:");
		for(int i = 0; i < poodle1.getNumberOfTraits(); i++){

			System.out.printf(" |%s|", poodle1.getTrait(i));

		}
		System.out.println();

		System.out.printf("Adaptability: %d/5\n", poodle1.getAdaptability());
		System.out.printf("Friendliness: %d/5\n", poodle1.getFriendliness());

	}


}