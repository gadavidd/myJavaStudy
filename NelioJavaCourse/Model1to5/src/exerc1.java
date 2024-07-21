//Else-if
import java.util.Scanner;
public class exerc1{

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("O número é negativo?");
		n = sc.nextInt();
		
		if(n < 0) {
			System.out.print("Negativo");
		}
		
		else {
			System.out.print("Não Negativo");
		}
		
		
		sc.close();
}
	
}