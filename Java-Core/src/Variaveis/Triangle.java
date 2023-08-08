package Variaveis;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		double a = 0, b = 0, c = 0;
		double d = 0, e = 0, f = 0;
		double pDeX;
		double pDeY;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a primeira medida do triangulo: ");
		a = sc.nextDouble();
		System.out.println("Insira a segunda medida do triangulo: ");
		b = sc.nextDouble();
		System.out.println("Insira a terceira medida do triangulo: ");
		c = sc.nextDouble();
		
		pDeX = (a + b + c) / 2;
		
		System.out.println(" A area do triangulo X é: " + pDeX);
		
		System.out.println("Insira a primeira medida do triangulo: ");
		d = sc.nextDouble();
		System.out.println("Insira a segunda medida do triangulo: ");
		e = sc.nextDouble();
		System.out.println("Insira a terceira medida do triangulo: ");
		f = sc.nextDouble();
		
		pDeY = (d + e + f) / 2;
		
		System.out.println(" A area do triangulo Y é: " + pDeY);
		
		sc.close();

	}

}
