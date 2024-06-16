package application;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Quanto numeros você vai digitar? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + vetor[i];
		}
		double media = soma / n;

		System.out.println("VALORES = ");

		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		System.out.printf("\n SOMA: %.2f\n", soma);
		System.out.printf(" MEDIA: %.2f\n", media);

		sc.close();

	}

}
