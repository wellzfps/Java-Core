package estruturaDecisao;

import java.util.Scanner;

public class Se {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	 double Num1, Num2 = 0, Num3, Num4, Num5;
		
		System.out.println("Digite 5 números!!!!!");
		
		System.out.println("Digite o primeiro número: ");
		Num1 = sc.nextDouble();
		
		if(Num1 != 0) {
			System.out.println("Digite o segundo número: ");
			Num2 = sc.nextDouble();
		}
		
		if(Num2 != 0){
			System.out.println("Digite o terceiro número: ");
			Num3 = sc.nextDouble();
		}
		
		
		//System.out.println("Digite o terceiro número: ");
		//Num3 = sc.nextDouble();
		
		//System.out.println("Digite o quarto número: ");
		//Num4 = sc.nextDouble();
		
		//System.out.println("Digite o quinto número: ");
		//Num5 = sc.nextDouble();
		
		//System.out.printf("Segue aqui os seus números:%n %.0f%n %.0f%n %.0f%n %.0f%n %.0f%n", Num1, Num2, Num3, Num4, Num5);
		}

}
