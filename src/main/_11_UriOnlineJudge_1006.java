package main;

import java.util.Locale;
import java.util.Scanner;

public class _11_UriOnlineJudge_1006 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1006
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double A, B, C, MEDIA;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;
		
		System.out.printf("MEDIA = %.1f%n " , MEDIA);
		sc.close();

	}

}
