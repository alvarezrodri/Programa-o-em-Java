package Exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Diagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];		//chamar matriz
		
		for (int i=0; i<mat.length; i++) {			//primeiro for vai percorrer as linhas, de 0 até n
			for(int j=0; j<mat[i].length; j++) {		//o segundo for percorre as colunas
				mat[i][j] = sc.nextInt();	// i percorres as linha e j as colunas das matrizes
			}
		}
		System.out.println("Main diagonal:");
		for (int i=0; i<mat.length; i++ ) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		 int count = 0;
		 for(int i=0; i<mat.length; i++) {
			 for(int j=0; j<mat[i].length; j++) {
				 if(mat[i][j] < 0) {
					 count++;
				 }
				 
			 }
		 }
		 System.out.println("Negative numbers = " + count); 
		
		sc.close();

	}

}
