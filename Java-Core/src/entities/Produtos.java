package entities;

public class Produtos {
	public double preco;
	public String nome;
	public int quantidade;
	
	/**
	 *  Gets e Sets
	 * **/
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getAmount(){
		return quantidade;
	}
	public void setAmount(int quantidade){
		this.quantidade = quantidade;
	}
	
	
	/**
	 *  Construtor padrão
	 * **/
	public Produtos () {
		
	}
	/**
	 *  Construtor personalizado
	 * **/
	public Produtos(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	
	/**
	 *  Métodos
	 * **/
	
	public double valorTotalEmEstoque( ) {
		return preco * quantidade;
	}
	
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProduto(int quantidade ) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome + ", R$ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: R$ "
				+ String.format("%.2f", valorTotalEmEstoque());
	}
	
	
	
	
	
}
