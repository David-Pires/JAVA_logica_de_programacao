package main;

import java.util.Locale;
import java.util.Scanner;

public class _15_UriOnlineJudge_1014 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1014
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X;
		Double Y, consumoMedio;
		
		X = sc.nextInt();
		Y = sc.nextDouble();
		
		consumoMedio = X / Y;
		
		System.out.printf("%.3f% km/l" ,consumoMedio);
		sc.close();

	}

}
