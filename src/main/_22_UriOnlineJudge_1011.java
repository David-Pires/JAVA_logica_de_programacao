package main;

import java.util.Locale;
import java.util.Scanner;

public class _22_UriOnlineJudge_1011 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1011
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double valorRaio = sc.nextDouble();
		
		Double resultadoFormula = (4.0/3) * 3.14159 * Math.pow(valorRaio, 3);
		
		System.out.printf("VOLUME = %.3f%n", resultadoFormula);
		sc.close();
	
	}

}
