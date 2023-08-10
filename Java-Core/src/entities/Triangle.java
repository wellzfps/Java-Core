package entities;

public class Triangle {
	
	// Atributos da classe
	
	public double ladoA;
	public double ladoB;
	public double ladoC;
	public String name;
	
	public Triangle(String name){
		this.name = name;
	}
	
	// MÉTODO ÁREA
	public double area() {
		double pDeX = (ladoA + ladoB + ladoC) / 2 ;
		return Math.sqrt(pDeX *(pDeX - ladoA) * (pDeX - ladoB) * (pDeX - ladoC));
	}

	public void typeTriangle() {
		if (ladoA == ladoB && ladoB == ladoC) {
		System.out.println("O Triângulo" + name + " é equilátero");
	}
	else if(ladoA == ladoB || ladoA == ladoC || ladoC == ladoB) {
		System.out.println("O Triângulo" + name + " é isóceles");
	}
	else {
		System.out.println("O Triângulo" + name + " é escaleno");
	}
	
	}
}
