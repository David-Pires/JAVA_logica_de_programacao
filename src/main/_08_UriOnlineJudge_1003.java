package main;

import java.util.Scanner;

public class _08_UriOnlineJudge_1003 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1003
		Scanner sc = new Scanner(System.in);
		int A, B, SOMA;
		
		A = sc.nextInt();
		B = sc.nextInt();
		SOMA = A + B;
		
		System.out.println("SOMA = " + SOMA);
		
		sc.close();
	}

}
