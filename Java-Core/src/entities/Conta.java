package entities;

public class Conta {
	private int numeroConta;
	private String donoConta;
	private double	saldoConta;
	
	// Construtores
	
	public Conta(int numeroConta, String donoConta) {
		this.numeroConta = numeroConta;
		this.donoConta = donoConta;
	}

	public Conta(int numeroConta, String donoConta, double saldoConta) {
		this.numeroConta = numeroConta;
		this.donoConta = donoConta;
		this.saldoConta = saldoConta;
	}
	
	//------------------------------------------------------------------------------
	// Métodos gets e sets
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getDonoConta() {
		return donoConta;
	}
	public void setDonoConta(String donoConta) {
		this.donoConta = donoConta;
	}
	
	public double getSaldoConta() {
		return saldoConta;
	}
	
	//------------------------------------------------------------------------------------
	// Método depósito 
		
	public void deposito(double valorDeposito) {
		saldoConta += valorDeposito;
	}
	// Método saque
	public void saque(double valorDeposito) {
		saldoConta -= valorDeposito + 5.00;
	}
	
	// Método toString sobrecarregado.

	@Override
	public String toString() {
		
		return "Conta: " + numeroConta + "\nProprietário: " + donoConta + 
				String.format("\nSaldo da conta: R$ %.2f", saldoConta);
	}
	
	
	
	
	
	
}
