package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.ServicoMilitar;

public class Start_ServicoMilitar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ServicoMilitar militar = new ServicoMilitar(null, 0, null, null, 0, null, 0, 0);
		
		militar.execApp(sc);
		
		

	}

}
