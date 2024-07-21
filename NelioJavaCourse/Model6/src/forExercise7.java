import java.util.Scanner;
import java.util.Locale;

public class forExercise7 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fatorial = n;
		
		if(n != 0) {
			for(int i = n-1; i >= 1; i--) {
				fatorial = fatorial * (i);
			}
		}
		System.out.println(fatorial);
		sc.close();
	}
}


