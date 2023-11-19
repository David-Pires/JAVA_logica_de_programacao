package main;

import java.util.Locale;
import java.util.Scanner;

public class _25_UriOnlineJudge_1015 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1015
		// Distância Entre Dois Pontos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double x1, y1, x2, y2,distancia ;
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		distancia = Math.sqrt(Math.pow(x2 - x1, 2 ) + Math.pow(y2 - y1, 2));
		System.out.printf("%.4f%n", distancia);
		
		sc.close();
	}

}
