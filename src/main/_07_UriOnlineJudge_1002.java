package main;

import java.util.Locale;
import java.util.Scanner;

public class _07_UriOnlineJudge_1002 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1002

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double area, n, raio;
		n = 3.14159;
		raio = sc.nextDouble();
		area = n * (raio * raio);
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}

}
