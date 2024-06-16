package application;

import java.util.Scanner;

public class numeros_Pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros Pares: ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("DIgite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("\nNUMEROS PARES: ");
		
		int qtdPares = 0;
		
		for(int i = 0; i < n; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
				
				qtdPares ++;
				
			}
		}
		
		System.out.printf("\nQuantidade pares = %d\n", qtdPares);
		
		
		sc.close();
	}

}
