package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<TaxPayer> lista = new ArrayList<>();
		
		System.out.print("Insira o numero dos contribuente: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Contribuente #" + i + " Dados: ");
			System.out.print("Pessoas fisica ou juridica: (f/j)");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			
			if(ch == 'f') {
				System.out.print("Gastos de saúde: ");
				double gastoSaude = sc.nextDouble();
				lista.add(new Individual(nome, renda, gastoSaude));
			}
			else {
				System.out.print("Numero de funcionarios: ");
				int Nfuncionario = sc.nextInt();
				lista.add(new Company(nome, renda, Nfuncionario));
			}
			
		}
		
		double sum = 0.0;
		System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");
		
		for(TaxPayer tp : lista) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax())); //chamada polimorfica
			sum += tp.tax();
		}
		
		System.out.println();
		System.out.println("Taxa total: " + sum);
		
		
		sc.close();

	}

}
