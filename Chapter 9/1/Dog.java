import java.util.ArrayList;

public class Dog{

	private String _name;
	private double _weight;
	private String _gender;
	private ArrayList<String> _traits = new ArrayList<String>();
	private boolean HypoAllergenic;

	
	public void setName(String name){

		_name = name;

	}

	public void setWeight(double weight){

		_weight = weight;

	}

	public void setGender(String gender){

		_gender = gender;

	}

	public String getName(){

		return _name;

	}

	public double getWeight(){

		return _weight;

	}

	public String getGender(){

		return _gender;

	}

	public String getTrait(int index){

		return _traits.get(index);

	}

	public int getNumberOfTraits(){

		return _traits.size();

	}

	public void addTrait(String trait){

		_traits.add(trait);

	}

	public boolean isHypoAllergenic(){

		return HypoAllergenic;

	}

	public void setHypoAllergenic(boolean tf){

		HypoAllergenic = tf;

	}


}