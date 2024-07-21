import java.util.Locale;
import java.util.Scanner;

public class whileExercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o código do combustível:");
		int combustivel = sc.nextInt();
		int alcool = 0 , gasolina = 0 , diesel = 0;
		
		while (combustivel != 4 ) {
			if (combustivel == 1) {
				alcool += 1;
			}
			else if (combustivel == 2) {
				gasolina += 1;
			}
			else if (combustivel == 3) {
				diesel += 1;
			}
			combustivel = sc.nextInt();
		}
			
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}
}


