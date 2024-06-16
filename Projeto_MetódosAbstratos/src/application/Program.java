package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.Circle;
import entities.Rectangle;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number os shapes: ");		//shape forma
		int n =  sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle(r/c)");
			char ch = sc.next().charAt(0);
			System.out.print("color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());		//o que o usuario digitar aqui vai se converter do meu time enumerado Color
			
			if(ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape: list) {
			System.out.println(String.format( "%.2f", shape.area()));
		}
		
		sc.close();
		

	}

}
