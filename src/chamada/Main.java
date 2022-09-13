package chamada;

import java.util.Locale;
import java.util.Scanner;

import exercicioii.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		Employee Employee = new Employee();
		
		System.out.print("Nome: ");
		Employee.Name = sc.nextLine();
		System.out.print("Gross salary: ");
		Employee.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		Employee.Taxi = sc.nextDouble();
		
		System.out.println("Employee: " + Employee.Name + ", " +"$"+ Employee.NetSalary());
		//System.out.printf("Employee: %d , %.2f ",Employee.Name,Employee.NetSalary() );		
		
		
		
		sc.close();
	}

}
