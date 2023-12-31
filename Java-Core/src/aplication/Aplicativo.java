package aplication;

import java.util.Scanner;

import entities.Triangle;

public class Aplicativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle X = new Triangle(" X");
		Triangle Y = new Triangle(" Y");
		
		//Interação com o triângulo X
		System.out.print("Informe o lado A do triângulo X: ");
		X.ladoA = sc.nextDouble();
		System.out.print("Informe o lado A do triângulo X: ");
		X.ladoB = sc.nextDouble();
		System.out.print("Informe o lado A do triângulo X: ");
		X.ladoC = sc.nextDouble();
		double areaDeX = X.area();
		
		//Interação com o triângulo Y
		System.out.print("Informe o lado A do triângulo Y: ");
		Y.ladoA = sc.nextDouble();
		System.out.print("Informe o lado B do triângulo Y: ");
		Y.ladoB = sc.nextDouble();
		System.out.print("Informe o lado C do triângulo Y: ");
		Y.ladoC = sc.nextDouble();
		double areaDeY = Y.area();
		
		//Implementação do tipo do triangulo
		System.out.printf("Área de X: %.2f%n", areaDeX);
		X.typeTriangle();
		System.out.printf("Área de Y: %.2f ", areaDeY);
		Y.typeTriangle();
		
		
		sc.close();

	}

}
