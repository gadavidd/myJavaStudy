//Else-if
import java.util.Scanner;
public class exerc2{

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("O número é ímpar ou par?");
		n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.print("Par");
		}
		
		else {
			System.out.print("Ímpar");
		}
		
		
		sc.close();
}
	
}