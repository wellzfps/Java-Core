package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaPessoal {
	public String idLivro;
	public String titulo;
	public String autor;
	public String ano;
	public String genero;
	public String editora;
	public String paginas;
	
	List<String> livros = new ArrayList<>();

	
	public BibliotecaPessoal(String idLivro, String titulo, String autor, String ano, String genero, String editora, String paginas) {
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.genero = genero;
		this.editora = editora;
		this.paginas = paginas;
	}
	// Métodos para adicionar conteudo a lista
	public void addId(String idLivro, Scanner sc) {
		this.idLivro = idLivro;
	}
	public void addTitulo(String titulo, Scanner sc) {
		this.titulo = titulo;
	}
	public void addAutor(String autor, Scanner sc) {
		this.autor = autor;
	}
	public void addAno(String ano, Scanner sc) {
		this.ano = ano;
	}
	public void addGenero(String genero, Scanner sc) {
		this.genero = genero;
	}
	public void addEditora(String editora, Scanner sc) {
		this.genero = editora;
	}
	public void addPaginas(String paginas, Scanner sc) {
		this.paginas = paginas;
	}
	
	
	
	
	
	
}
