import java.util.Scanner;

public class Ch03_prj1_TemperatureConverter {
	public static void main(String[] args) {
					
		///Welcome
		System.out.println("Welcome to the Temperature Converter");
			
		Scanner sc = new Scanner(System.in);
			
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {	

			//Prompt
			System.out.print("Enter degrees in Farenheit: ");
			double degF = sc.nextDouble();
			
			//Bus Logic
			double degC1 = 5.0 / 9;
			double degC2 = degC1 * (degF - 32);
			degC2 = (double)Math.round(degC2 * 100)/100;
			
			//Display Results
			System.out.println("Degrees in Celsius: " + degC2);			
			System.out.println("Continue? (y/n):");
			choice = sc.next();

		}
	//Bye
			System.out.println("Bye" );

												
	}
}


