package Variaveis;

import java.util.Scanner;

public class Contatos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		String email;
		long telefone;
		
		System.out.println("Insira o seu nome: ");
		name = sc.next();
		System.out.println("Insira o seu email: ");
		email = sc.next();
		System.out.println("Insira o seu número de telefone: ");
		telefone = sc.nextLong();
		
		
		System.out.printf("Dados: %s %s%n %d%n", name, email, telefone);
		sc.close();
		
		
	}

}
