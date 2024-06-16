package application;

import java.util.Locale;
import java.util.Scanner;

import util.calculator;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calculator.circumference(radius);	//Por causa do mesmro estatico, eu posso colocar direto na classe
		
		double v = calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calculator.PI); 	
		
		
		sc.close();
		
	}
	
}












