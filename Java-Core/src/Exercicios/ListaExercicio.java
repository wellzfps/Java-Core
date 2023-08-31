package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.BibliotecaPessoal;

public class ListaExercicio {

	public static void main(String[] args) {
	List<String> bibliotecaPessoal = new ArrayList<>();
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	BibliotecaPessoal biblioteca = new BibliotecaPessoal(null, null, null, null, null, null, null);
	
	System.out.println("Informe o id do livro: ");
	String idLivro = sc.next();
	biblioteca.addId(idLivro, sc);

	}

}
