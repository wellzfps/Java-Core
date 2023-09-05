package entities.heranca;

/**
 * Representa uma conta bancária.
 * 
 * @author aluno Wellington Nunes
 * @since 04/09/2023
 * 
 */

public class Conta {
	/**
	 * O número da conta
	 * */
	private Integer numeroConta;
	
	/**
	 * O titular da conta
	 * */
	private String titularConta;
	
	/**
	 * o Saldo da conta 
	 * */
	private Double saldoConta;
	
	public Conta() {
		/**
		 * Cria uma conta com os valores padrões para  os atributos 'numeroConta' e 'titularConta'
		 * */
		this.numeroConta = null;
		this.titularConta = null;
		this.saldoConta = 0.0;
	}

	/**
	 * Construtor da classe que recebe os valores para os atributos personalizados:
	 * 'numeroConta', 'titularConta' e 'saldoConta'.
	 * 
	 * @param numeroConta   Representa o número de uma conta.
	 * @param titularConta  Representa o nome do titular da conta.
	 * @param saldoConta    Representa o atual saldo da conta.
	 * */
	
	public Conta(Integer numeroConta, String titularConta, Double saldoConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldoConta = saldoConta;
	}
	/**
	 * Obter o número da conta
	 * @return O número da conta
	 * */

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}
	/**
	 * Define o titular da conta.
	 * 
	 * @param titularConta o novo titular da conta.
	 * */

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
	
	/**
	 * Obtém o saldo da conta.
	 * 
	 * return o saldo da conta.
	 * */

	public Double getSaldoConta() {
		return saldoConta;
	}
	
	/**
	 * Realiza um saque na conta
	 * @param quantidade Representa o valor para o saque.
	 * */
	public void saque(double quantidade) {
		/**
		 * Um saque representa uma retirada de saldo na conta.
		 * */
		saldoConta -= quantidade;
	}
	
	/**
	 * Realiza um depósito na conta.
	 * 
	 * @param quantidade Representa o valor para depósito na conta.
	 * */
	
	public void deposito(double quantidade) {
		/**
		 * Um deposito representa uma entrada na conta.
		 * */
		saldoConta += quantidade;
	}
	
	
}
