package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;
import entities.Triangle;

public class ProgramRectanguleClass {

public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter width and height: ");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		
		System.out.println(rec);
		
		sc.close();
	}
}
 