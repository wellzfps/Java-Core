package util;

public class Calculadora {
	public final double PI = 3.14159;
	
	public double circunferencia(double raio) {
		return 2.0 * PI * raio;
		
}
	
	public double volume(double raio) {
		 return 4.0 * PI * (Math.pow(raio, 3)/3.0);
	}
}