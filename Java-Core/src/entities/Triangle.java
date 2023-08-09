package entities;

public class Triangle {
	
	// Atributos da classe
	
	public double ladoA;
	public double ladoC;
	public double ladoB;
	
	// MÉTODO ÁREA
	public double area() {
		double pDeX = (ladoA + ladoB + ladoC) / 2 ;
		return Math.sqrt(pDeX *(pDeX - ladoA) * (pDeX - ladoB) * (pDeX - ladoC));
	}


	
	

}
