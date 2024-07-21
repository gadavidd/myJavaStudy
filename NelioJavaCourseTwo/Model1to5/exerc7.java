package NelioJavaCourseTwo.Model1to5;//Else-if
import java.util.Locale;
import java.util.Scanner;
public class exerc7{

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public static void main (String[]args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor de X :");
		double x = sc.nextDouble();
		System.out.println("Insira o valor de Y :");
		double y = sc.nextDouble();
		
		if(x == 0 && y == 0){
			System.out.print("Origem");
		}
		else if(x == 0 && y != 0){
			System.out.print("Eixo X");
		}
		else if(x != 0 && y == 0){
			System.out.print("Eixo Y");
		}
		else if(x > 0) {
			if(y > 0) {
				System.out.print("Q1");
		}	else {
				System.out.print("Q4");
		}}
		else if(x < 0) {
			if(y > 0) {
				System.out.print("Q2");
		}	else {
				System.out.print("Q3");
		}}
			
		sc.close();
}
}