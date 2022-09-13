package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import notaaluno.Aluno;
import projetojar.Produto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Produto produto = new Produto();
		System.out.println("Coloque os dados do produto!");
		System.out.println("Nome: ");
		produto.nome = sc.nextLine();
		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();		
		
		produto.removeProdutos(5);
		System.out.println(produto.quantidade);
*/		
		Aluno aluno = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = sc.next();
		System.out.println("DIGITE O VALOR DA PRIMEIRA NOTA: ");
		aluno.grade1 = sc.nextDouble();
		System.out.println("VALOR DA SEGUNDA NOTAT: ");
		aluno.grade2 = sc.nextDouble();
		System.out.println("VALOR DA TERCEIRA NOTA: ");
		aluno.grade3 = sc.nextDouble();
		
		System.out.println(aluno.situacao());
		
		
		
		
		sc.close();
		
		
	}

}
