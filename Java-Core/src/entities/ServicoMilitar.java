package entities;

import java.util.Scanner;

public class ServicoMilitar {
	private String nome;
	private int anoNascimento;
	private String nomeMae;
	private String nomePai;
	private long telefone;
	private String email;
	private double altura;
	private double peso;
	
	private double dadosMilitar[] = new double [7];
	
	// Construtor personalizado com 8 parametros.
	
	public ServicoMilitar(String nome, int anoNascimento, String nomeMae, String nomePai, long telefone, String email,
			double altura, double peso) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.telefone = telefone;
		this.email = email;
		this.altura = altura;
		this.peso = peso;
	}
	// Gets e Sets
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	// Métodos de inserção de dados.


	
	public void execApp(Scanner sc) {
		System.out.println("Qual o ano do seu nascimento?: ");
		int anoNascimento = sc.nextInt();
		
		if(anoNascimento >= 2006) {
			System.out.println("Você não pode se alistar ainda, espere até completar 18 anos.");
		}
		else {
			System.out.println("Qual o seu nome?: ");
			this.nome = sc.next();
			
			System.out.println("Qual o nome da sua mãe?: ");
			this.nomeMae = sc.next();
			
			System.out.println("Qual o nome do seu pai?: ");
			this.nomePai = sc.next();
			
			System.out.println("Qual o seu telefone?: ");
			this.telefone = sc.nextLong();
			
			System.out.println("Qual o seu e-mail?: ");
			this.email = sc.next();
			
			System.out.println("Qual a sua altura?: ");
			this.altura = sc.nextDouble();
			
			System.out.println("Qual o seu peso?: ");
			this.peso = sc.nextDouble();
			
		}
		
	}
	
	
	
}
