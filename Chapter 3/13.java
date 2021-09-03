import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double airSpeed = 1100;
		double waterSpeed = 4900;
		double steelSpeed = 16400;
		double totalTime;

		System.out.print("Enter the medium: ");
		String userInput = scan.next();

		System.out.print("Enter the distance: ");
		double distance = scan.nextDouble();

		if (userInput.equals("air")) {

			totalTime = distance / airSpeed;
			System.out.printf("The speed is: %,.2fft/s & the total time is: %,.2fs", airSpeed, totalTime);

		} else if (userInput.equals("water")) {

			totalTime = distance / waterSpeed;
			System.out.printf("The speed is: %,.2fft/s & the total time is: %,.2fs", waterSpeed, totalTime);

		} else if (userInput.equals("steel")) {

			totalTime = distance / steelSpeed;
			System.out.printf("The speed is: %,.2fft/s & the total time is: %,.2fs", steelSpeed, totalTime);

		}

	}
}