


public class Thing {

	private int x;
	private int y;
	private static int z = 0;

	public Thing() {

		x = z;
		y = z;

	}
	static void putThing(int a) {

		z = a; 

	}
}