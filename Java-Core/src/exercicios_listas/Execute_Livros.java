package exercicios_listas;

import java.util.List;
import java.util.Scanner;

public class Execute_Livros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o código do livro: ");
		String idLivro = sc.nextLine();
		System.out.println("Informe o título do livro: ");
		String obra = sc.nextLine();
		System.out.println("Informe o autor do livro: ");
		String autor = sc.nextLine();
		System.out.println("Informe o ano de publicação do livro: ");
		String ano = sc.nextLine();
		System.out.println("Informe o gênero do livro: ");
		String genero = sc.nextLine();
		System.out.println("Informe a editora do livro: ");
		String editora = sc.nextLine();
		System.out.println("Informe a quantidade de páginas que o livro contém: ");
		String paginas = sc.nextLine();
		
		// Instanciar um objeto livro
		
		Livros livros = new Livros();
		
		//Adicionar um livro
		livros.adicionarLivros(idLivro, obra, autor, ano, genero, editora, paginas);
		
		//Listar os elementos da lista Livros
		List<String> titulos = livros.getTitulos();
		
		for (String titulo : titulos) {
			System.out.println(titulos);
			
		}
		
		//listar a quantidade de elementos
		livros.listarQuantidadeElementos();
		
		
		// Remover elementos
		
		livros.removerLivro(idLivro);
		
		
		sc.close();

	}

}
