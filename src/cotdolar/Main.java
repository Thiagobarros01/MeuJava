package cotdolar;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		DolarC.valor = sc.nextDouble();
		System.out.println("How many dollars wll be bough? ");
		DolarC.comprar = sc.nextDouble();
		System.out.println("Amount to be paid in reais =");
		
		
		
		sc.close();
	}

}
