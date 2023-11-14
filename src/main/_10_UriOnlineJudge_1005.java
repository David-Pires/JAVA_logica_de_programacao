package main;

import java.util.Locale;
import java.util.Scanner;

public class _10_UriOnlineJudge_1005 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1005

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double A, B, MEDIA;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		
		MEDIA = ((A * 3.5) + (B * 7.5)) / 11;
		System.out.printf("MEDIA = %.5f%n", MEDIA);
		sc.close();
	}

}
