package main;

import java.util.Scanner;

public class _40_UriOnlineJudge_1035 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1035
		// Teste de Seleção 1
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		if ( B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0 ) {
			System.out.println("Valores aceitos");
		} 
		
		else {
			System.out.println("Valores nao aceitos");
		}
		sc.close();

	}

}
