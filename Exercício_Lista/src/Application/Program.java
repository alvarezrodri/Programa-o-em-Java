package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();
		
		
		System.out.println("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println("Employee # "+ (i + 1) + ":");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();		//lê até a quebra de linha
			System.out.println("Salary: ");
			Double salary  = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary); 
			
			list.add(emp);
			
		}
		
		
		
		sc.close();
		

	}

}
