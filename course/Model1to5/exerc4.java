package course.Model1to5;//Else-if
import java.util.Scanner;
public class exerc4{

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Hora de Início:");
		n = sc.nextInt();
		
		int l;
		System.out.println("Hora Final:");
		l = sc.nextInt();
		
		if(l > n) {
			int h = l - n;
			System.out.print("O JOGO DUROU " + h + " HORAS");
		}	
		else if(n == l) {
			System.out.print("O JOGO DUROU 24 HORAS");
		}
		else {
			int h = l + (24 - n);
			System.out.print("O JOGO DUROU " + h + " HORAS");
		}
		
		
		sc.close();
}
	
}