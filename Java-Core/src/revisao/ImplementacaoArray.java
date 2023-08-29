package revisao;

import java.util.Iterator;
import java.util.Scanner;

public class ImplementacaoArray {
	// Parâmetro ou atributos da classe
	double  notasAluno[] = new double [3];
	// Construtor padrão
	//public ImplementacaoArray(double notasAluno[]) {
		//this.notasAluno = notasAluno;
	//}
	
	// Método para inserir elementos ao array
	public void addElementosArray(Scanner sc) {
		System.out.println("Insira a 1º nota: ");
		notasAluno[0] = sc.nextDouble();
		System.out.println("Insira a 2º nota: ");
		notasAluno[1] = sc.nextDouble();
		System.out.println("Insira a 3º nota: ");
		notasAluno[2] = sc.nextDouble();
	}
	
	// Listar os elementos do array
	public void listarElementos() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "; " + notasAluno[i]);
			
		}
		System.out.println("-----------------------------");
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.println(i + "; " + notasAluno[i]);
		}
		
	}
	
	
	
	
}
