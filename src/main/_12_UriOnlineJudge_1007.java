package main;

import java.util.Scanner;

public class _12_UriOnlineJudge_1007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, DIFERENCA;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		DIFERENCA = ((A * B) - (C * D));
		
		System.out.println("DIFERENCA = " + DIFERENCA);
		sc.close();
	}

}
