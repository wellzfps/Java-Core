package entities.heranca;

public class Start_Contas {

	public static void main(String[] args) {
		Conta contaPF1 = new Conta(5560, "Ricardo", 0.0);
		ContaEmpresa contaPJ1 = new ContaEmpresa(6588, "Senai", 0.0, 1000.0);
		ContaPoupanca contaPP1 = new ContaPoupanca(4070, "Maria Aparecida", 20.0, 2.2);
		
		//UPCASTING -> Converter um objeto da subclasse para superclasse.
		
		Conta contaPF2 = contaPJ1;
		Conta contaPF3 = new ContaEmpresa(2626, "Baseus", 0.0, 200.0);
		Conta contaPF4 = new ContaPoupanca(1256, "Beatriz", 0.0, 0.10);
		
		
		//DOWNCASTIG
		ContaEmpresa contaPF5 = (ContaEmpresa)contaPF3;
		ContaEmpresa contaPF6 = (ContaEmpresa)contaPF3;
		contaPF6.emprestimo(100.0);
		
		

	}

}
