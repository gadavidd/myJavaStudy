package NelioJavaCourseTwo.Model1to5;//Else-if
import java.util.Scanner;
public class exerc3{

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Insira o valor de A?");
		n = sc.nextInt();
		
		int l;
		System.out.println("Insira o valor de B?");
		l = sc.nextInt();
		
		if(n % l == 0 || n % l == 0) {
			System.out.print("São Multiplos");
		}	
		else {
			System.out.print("Não São multiplos");
		}
		
		
		sc.close();
}
	
}