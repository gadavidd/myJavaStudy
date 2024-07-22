package course.Model1to5;//Else-if
import java.util.Locale;
import java.util.Scanner;
public class exerc8{

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public static void main (String[]args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe sua renda R$ :");
		double salarioRombus = sc.nextDouble();
		double impostoLisarb = 0;
		
		if(salarioRombus >= 0.00 && salarioRombus <= 2000.00){
			impostoLisarb = 0;
		}
		else if(salarioRombus >= 2000.01 && salarioRombus <= 3000.00){
			impostoLisarb = (salarioRombus - 2000.00) * 0.08;
		}
		else if(salarioRombus >= 3000.01 && salarioRombus <= 4500.00){
			impostoLisarb = 1000.00 * 0.08;
			impostoLisarb += (salarioRombus - 3000.00) * 0.18;
		}
		else if(salarioRombus > 4500.00){
			impostoLisarb = 1000.00 * 0.08;
			impostoLisarb += 1500.00 * 0.18;
			impostoLisarb += (salarioRombus - 4500.00) * 0.28;
		}
		else {
			System.out.print("Valor informado errado");
		}
		if(impostoLisarb == 0) {
			System.out.print("Isento");
		}
		else {
		System.out.print("R$ " + impostoLisarb);
		}
		sc.close();
}
}