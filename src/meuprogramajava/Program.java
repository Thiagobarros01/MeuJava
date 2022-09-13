package meuprogramajava;

import java.util.Locale;
import java.util.Scanner;
import entidade.Triangulo;
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Triangulo  x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite os tres valores do triangulo ");
		x.a = sc.nextDouble();		
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		int soma =  (int) (x.a + x.b + x.c);
		System.out.println("a soma desses numeros é : "+ soma);
		

	}

}
