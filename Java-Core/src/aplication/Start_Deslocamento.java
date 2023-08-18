package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Deslocamento;

public class Start_Deslocamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Deslocamento desloca = new Deslocamento(0, 0, 0, 0, 0);
		
		System.out.println("Olá bem vindo ao programa de deslocamento.");
		
		System.out.println("Insira o valor de x1: ");
		double x1 = sc.nextDouble();
		desloca.setX1(x1);
		
		System.out.println("Insira o valor de y1: ");
		double y1 = sc.nextDouble();
		desloca.setY1(y1);
		
		System.out.println("Insira o valor de x2: ");
		double x2 = sc.nextDouble();
		desloca.setX2(x2);
		
		System.out.println("Insira o valor de y2: ");
		double y2 = sc.nextDouble();
		desloca.setY2(y2);
		
		System.out.println("Insira o valor da velocidade: ");
		double velocidade = sc.nextDouble();
		desloca.setVelocidade(velocidade);
		
		double distancia = desloca.calcularDistancia();
		
		double tempo = desloca.calcularTempoDeslocamento();
		
		System.out.println(distancia);
		System.out.println(tempo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
