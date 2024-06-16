package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();
		
		System.out.print("Entre com a quantidade de produtos: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i ++) {
			System.out.print("Produto " + i + " dados: ");
			System.out.print("comum, usado ou importado (c/u/i): ");
			char caractere = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preço: ");
			Double price = sc.nextDouble();
			
			if(caractere == 'c') {
				list.add(new Product(name, price));
			}
			else if(caractere == 'u') {
				System.out.print("Data de fabricação(dd/MM/yyyy): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			}
			else {
				System.out.print("Taxa de importação: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}	
			
		}
		
		System.out.println();	
		System.out.println("ETIQUETAS DE PREÇO: ");
		
		for(Product product: list) {
			System.out.println(product.priceTag());
		}
		
		
		sc.close();

	}

}
