package oop;

import java.util.Scanner;

public class Triangle {
	
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle X = new Triangle();
		X.ladoA = 3.0;
		X.ladoB = 4.0;
		X.ladoC = 2.0;
		System.out.println(X.ladoA + X.ladoB + X.ladoC);
	
		
		Triangle Y = new Triangle();
		System.out.println("Informe o lado A: ");
		Y.ladoA = sc.nextDouble();
		System.out.println("Informe o lado B: ");
		Y.ladoB = sc.nextDouble();
		System.out.println("Informe o lado C: ");
		Y.ladoC = sc.nextDouble();
		
		System.out.println(Y.ladoA + Y.ladoB + Y.ladoC);
		
		sc.close();
		
	}

}
