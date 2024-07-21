import java.util.Scanner;
import java.util.Locale;

public class forExercise4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Insira o valor de x");
			int x = sc.nextInt();
			System.out.println("Insira o valor de x");
			int y = sc.nextInt();
			
			if(y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double z = (double)x/y;
				System.out.printf("%.1f%n",z);	
			}
		}

		sc.close();
	}
}


