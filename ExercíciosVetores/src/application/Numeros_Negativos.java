package application;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_Negativos {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	
	System.out.println("Quantos numeros voce vai digitar? ");
	int n = sc.nextInt();
	int[] vetor = new int[n];
	
	for(int i = 0; i < n; i++) {
		System.out.println("Digite um numero: ");
		vetor[i] = sc.nextInt();
	}
	
	System.out.println("NUMEROS NEGATIVOS: ");
	
	for(int i = 0; i < n; i++) {
		if(vetor[i] < 0) {
			System.out.println(vetor[i]);
		}
	}
	sc.close();

	}

}
