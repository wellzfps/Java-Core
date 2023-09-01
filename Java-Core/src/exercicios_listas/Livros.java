package exercicios_listas;

import java.util.ArrayList;
import java.util.List;

public class Livros {
	
	//Parâmetro ou atributos da classe
	private List<String> titulos;
	
	public Livros() {
		this.titulos = new ArrayList<>();
	}
	
	//Método adicionar 
	public void adicionarLivros(String idLivro, String titulo, String nomeAutor, String ano, String genero, String editora, String paginas) {
		this.titulos.add(idLivro + " - " + titulo + " - " + nomeAutor + " - " + ano + " - " + genero + " - " + editora + " - " + paginas);
	}
	
	// Listar os elementos
	public List<String> getTitulos(){
		return titulos;
	}
	
	public void listarQuantidadeElementos() {
		System.out.println("A lista contém " + this.titulos.size() + " elementos ");
	}
	
	public void removerLivro(String titulo) {
		// Encontrar o indice do elemento a ser removido
		int index = this.titulos.indexOf(titulo);
		
		// Remover o elemento da lista
		this.titulos.remove(index);
	}
}
