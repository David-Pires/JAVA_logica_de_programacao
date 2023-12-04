package main;

import java.util.Locale;
import java.util.Scanner;

public class _41_UriOnlineJudge_1037 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1037
		// Intervalo
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextDouble();
		
		if (numero >= 0 && numero <= 25.0000) {
			System.out.println("Intervalo [0,25]");
		} else if (numero > 25.00001 && numero <= 50.0000000) {
			System.out.println("Intervalo (25,50]");			
		} else if (numero > 50.00001 && numero <= 75.0000000) {
			System.out.println("Intervalo (50,75]");			
		} else if (numero > 75.00001 && numero <= 100.0000000) {
			System.out.println("Intervalo (75,100]");			
		} else if (numero <0.0 || numero > 100.0 ){
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
	}

}
