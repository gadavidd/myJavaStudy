package materials.src.main.java.org.example.course.Model1to5;//Else-if
import java.util.Scanner;
public class exerc1{

//Make a program to read an integer, and then say whether this number is negative or not.

public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Is the number negative?");
		n = sc.nextInt();
		
		if(n < 0) {
			System.out.print("Negative");
		}
		
		else {
			System.out.print("Non-Negative");
		}
		
		
		sc.close();
}
	
}