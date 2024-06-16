package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Index {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();

		
		System.out.print("Entre com a quantidade de funcionarios: ");
		int n = sc.nextInt();
		
		for (int i= 1 ; i <= n ; i ++) {
			System.out.println("Funcionário #" + i + " dados: ");
			System.out.print("Terceirizado (y/N)? ");  // Outsourced
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine(); 
			String name = sc.nextLine();
			System.out.print("Horas: ");
			int hours = sc.nextInt();
			System.out.print("Valor por horas: ");  //value per hour
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'y') {
				System.out.print("Taxa Adicional: "); //Aditional Charge
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS:");
		for(Employee emp: list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.1f",emp.payment()));
		}
		
		
		sc.close();

	}

}
