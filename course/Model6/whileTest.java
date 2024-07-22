package course.Model6;

import java.util.Locale;
import java.util.Scanner;

public class whileTest {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char response;
		
		do  {
			System.out.println("Digite a temperatura em Celsius: ");
			
			double temperatureCelsius = sc.nextDouble();
			double temperatureFahrenheit = 9.0 * temperatureCelsius / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit:  %.1f%n", temperatureFahrenheit);
			System.out.println("Deseja repetir (S/N)? ");
			response = sc.next().charAt(0);
		}
		while (response != 'n');
		sc.close();
	}
}


