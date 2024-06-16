package Exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Matrix2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[m][n];
		
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		
		
		
		sc.close();

	}

}
