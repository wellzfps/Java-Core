package estruturaDecisao;

import java.util.Scanner;

public class Versao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int quantidade = 0;
		double valorInformado;
		double SomaValores = 0;
		
		System.out.println("Informe um valor: ");
		valorInformado = sc.nextDouble();
		if (quantidade == 5 || valorInformado != 0.00) {
			quantidade++;
			SomaValores += valorInformado;
			System.out.println("Quantidade de números digitados: " + quantidade);
		}
		else {
			System.out.println("Você informou o valor " + valorInformado + " Programa finalizado.");
			return;
		}
		System.out.println("Informe um novo valor: ");
		valorInformado = sc.nextDouble();
		if (quantidade == 5 || valorInformado != 0.00) {
			quantidade++;
			SomaValores += valorInformado;
			System.out.println("Quantidade de números digitados: " + quantidade);
		}
		else {
			System.out.println("Você informou o valor " + valorInformado + " Programa finalizado.");
			return;
		}
		
		System.out.println("Informe um novo valor: ");
		valorInformado = sc.nextDouble();
		if (quantidade == 5 || valorInformado != 0.00) {
			quantidade++;
			SomaValores += valorInformado;
			System.out.println("Quantidade de números digitados: " + quantidade);
		}
		else {
			System.out.println("Você informou o valor " + valorInformado + " Programa finalizado.");
			return;
		}
		
		System.out.println("Informe um novo valor: ");
		valorInformado = sc.nextDouble();
		if (quantidade == 5 || valorInformado != 0.00) {
			quantidade++;
			SomaValores += valorInformado;
			System.out.println("Quantidade de números digitados: " + quantidade);
		}
		else {
			System.out.println("Você informou o valor " + valorInformado + " Programa finalizado.");
			return;
		}
		
		System.out.println("Informe um novo valor: ");
		valorInformado = sc.nextDouble();
		if (quantidade == 5 || valorInformado != 0.00) {
			quantidade++;
			SomaValores += valorInformado;
			System.out.println("Quantidade de números digitados: " + quantidade);
		}
		else {
			System.out.println("Você informou o valor " + valorInformado + " Programa finalizado.");
			return;
		}
		
		
		
		System.out.printf("A soma dos valores que você digitou é: %.2f ", SomaValores);
		
		

	}

}
