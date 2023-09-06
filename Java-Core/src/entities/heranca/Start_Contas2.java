package entities.heranca;

import java.util.Locale;
import java.util.Scanner;

public class Start_Contas2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número da conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.println("Informe o nome do titular da conta: ");
		String nomeTitular = sc.nextLine();
		sc.next();
		
		System.out.println("Informe o limite para saque: ");
		double limiteSaque = sc.nextDouble();
		
		ContaEmpresa xpto = new ContaEmpresa(numeroConta, nomeTitular, null, limiteSaque);
		System.out.println(xpto.getNumeroConta());
		System.out.println(xpto.getTitularConta());
		System.out.println(xpto.getSaldoConta());
		System.out.println(xpto.getLimiteEmprestimo());
		
		
		
		sc.close();

	}

}
