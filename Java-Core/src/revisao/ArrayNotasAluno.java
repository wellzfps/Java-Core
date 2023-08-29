package revisao;

import java.util.Locale;
import java.util.Scanner;

public class ArrayNotasAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Declarar array notas de um aluno.
		
		//double  notasAlunoA[] = new double [3];
		
		// Atribuir elementos ao array
		//notasAlunoA[0] = 5.5;
		//notasAlunoA[1] = 7.5;
		//notasAlunoA[2] = 8.5;
		
		
		ImplementacaoArray notasAlunoA = new ImplementacaoArray();
		notasAlunoA.addElementosArray(sc);
		notasAlunoA.listarElementos();
		
		ImplementacaoArray notasAlunoB = new ImplementacaoArray();
		notasAlunoB.addElementosArray(sc);
		notasAlunoA.listarElementos();
		
		
		sc.close();
		
		

	}

}
