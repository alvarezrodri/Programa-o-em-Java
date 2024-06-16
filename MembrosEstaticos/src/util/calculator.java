package util;

public class calculator {
	public static final double PI = 3.14159;	//final diz que esse valor é constante
	
	public static double circumference(double radius) {		//FUNÇÃO
		return 2.0 * PI * radius;
	}
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;	//FUNÇÃO
	}

}
