package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class Start_Produto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produtos produto = new Produtos();
		
		System.out.println("Informe as informações do produto");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();
		System.out.println();
		
		System.out.println("Informações do produto: " + produto);
		System.out.println();
		
		System.out.print("Insira o número de produtos a serem adicionados ao estoque: ");
		int quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		System.out.println();
		
		System.out.print("Insira o número de produtos a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		System.out.println();
		
		System.out.println("Dados atualizados: " + produto);
		
		sc.close();

	}

}
