import java.util.Scanner;
import java.util.Locale;

public class forExercise3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double soma = 0;
		
		for(int i = 0; i < x; i++) {
			double N = sc.nextDouble();
			switch (i){
				case 0:
					soma += (2.0*N);
					break;
				case 1:
					soma += (3.0*N);
					break;
				case 2:
					soma += (5.0*N);
					break;
				default:
					break;

			}
		}
		soma = soma/10.0;
		System.out.printf("%.1f%n",soma);
		sc.close();
	}
}


