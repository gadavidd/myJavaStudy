package course.Model1to5;//Else-if
import java.util.Locale;
import java.util.Scanner;
public class exerc6{

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public static void main (String[]args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor:");
		double n = sc.nextDouble();
		
		System.out.println(n);
		
		if(0 <= n && n <= 25.00) {
			System.out.printf("Intervalo [0,25]");
		}	
		else if(25.01 <= n && n <= 50.00) {
			System.out.printf("Intervalo [25,50]");
		}
		else if(50.00 <= n && n <= 75.00) {
			System.out.printf("Intervalo [50,75]");
		}
		else if(75.00 <= n && n <= 100.00) {
			System.out.printf("Intervalo [75,100]");
		}
		else {
			System.out.print("Fora de Intervalo");
		}		
		
		sc.close();
}
	
}