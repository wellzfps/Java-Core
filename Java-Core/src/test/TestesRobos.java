package test;

import java.util.Locale;
import java.util.Scanner;

import entities.ExploradorRobo;

public class TestesRobos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		ExploradorRobo Beta = new ExploradorRobo();
		ExploradorRobo Omega = new ExploradorRobo();
		
		System.out.println("Qual o nome do robô? ");
		Beta.Name = sc.next();
		System.out.println("Qual a velocidade do robô? ");
		Beta.velocidade = sc.nextInt();
		System.out.println("Qual a temperatura do robô? ");
		Beta.temperatura = sc.nextDouble();
		System.out.println("Qual o status do robô? ");
		Beta.status = sc.next();
		
		Beta.verificarTemperatura();
		Beta.exibirAtributos();
		
		
		System.out.println("Qual o nome do robô? ");
		Omega.Name = sc.next();
		System.out.println("Qual a velocidade do robô? ");
		Omega.velocidade = sc.nextInt();
		System.out.println("Qual a temperatura do robô? ");
		Omega.temperatura = sc.nextDouble();
		System.out.println("Qual o status do robô? ");
		Omega.status = sc.next();
		
		Omega.verificarTemperatura();
		Omega.exibirAtributos();
		
		
		sc.close();
	}

}
