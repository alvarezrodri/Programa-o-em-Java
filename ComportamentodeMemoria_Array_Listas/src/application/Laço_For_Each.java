package application;

import java.util.Locale;
import java.util.Scanner;

public class Laço_For_Each {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("------------------------------");
		for(String obj : vect) {	//For Each
			System.out.println(obj);
		}
		
		sc.close();

	}

}
