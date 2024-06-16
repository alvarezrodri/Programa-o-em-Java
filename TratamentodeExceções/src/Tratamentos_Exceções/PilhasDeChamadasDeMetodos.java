package Tratamentos_Exceções;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PilhasDeChamadasDeMetodos {

	public static void main(String[] args) {

		method1();
		
		System.out.println("End of program");
		
	}
	
	public static void method1() {	//metodos
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	
	public static void method2() {	//metodos
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		
		try {		//tentar
			String[] vect = sc.nextLine().split(" ");	
			int position = sc.nextInt();
		
		System.out.println(vect[position]);
		}
															//catch - pegar
		catch(ArrayIndexOutOfBoundsException e) {		//mostra o erro na tela e ainda pode digitar o erro
			System.out.println("Invalid position");
			e.printStackTrace();
			sc.next();
		}
		catch(InputMismatchException e) {		//pegar
			System.out.println("Input Error");
		}
		
		sc.close();
		System.out.println("***METHOD2 END***");
	}

}
