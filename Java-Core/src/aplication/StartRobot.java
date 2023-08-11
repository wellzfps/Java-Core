package aplication;

import entities.ExploradorRobo;

public class StartRobot {

	public static void main(String[] args) {
		
		ExploradorRobo alpha = new ExploradorRobo();
		
		alpha.status = "Explorando";
		alpha.velocidade = 7;
		alpha.temperatura = 20;
		alpha.exibirAtributos();
		System.out.println("-------------------------------------");
		
		System.out.println("Aumentando a velocidade para 8");
		alpha.velocidade = 8;
		alpha.exibirAtributos();
		System.out.println("Alterar a temperatura para 47");
		alpha.temperatura = 47;
		alpha.verificarTemperatura();
		alpha.exibirAtributos();

	}
}
