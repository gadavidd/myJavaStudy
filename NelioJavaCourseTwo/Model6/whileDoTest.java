package NelioJavaCourseTwo.Model6;

import java.util.Scanner;

public class whileDoTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha:");
		
		int password = sc.nextInt();
		
		while (password != 2002) {
			System.out.println("Senha invalida");
			password = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		sc.close();
	}
}


