package NelioJavaCourseTwo.Model6;

import java.util.Scanner;

public class whileExercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor de X :");
		double x = sc.nextDouble();
		System.out.println("Insira o valor de Y :");
		double y = sc.nextDouble();
		
		while (x != 0 && y != 0 ) {
			if(x > 0) {
				if(y > 0) {
					System.out.println("primeiro");
			}	else if (y < 0){
					System.out.println("quarto");
			}}
			else if(x < 0) {
				if(y > 0) {
					System.out.println("segundo");
			}	else if (y < 0) {
					System.out.println("terceiro");
			}}
			
			System.out.println("Insira o valor de X :");
			x = sc.nextDouble();
			System.out.println("Insira o valor de Y :");
			y = sc.nextDouble();
		}

		sc.close();
	}
}


