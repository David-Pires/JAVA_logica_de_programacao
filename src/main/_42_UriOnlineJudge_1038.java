package main;

import java.util.Locale;
import java.util.Scanner;

public class _42_UriOnlineJudge_1038 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1038
		// Lanche

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPedido, qtd;
		
		codigoPedido = sc.nextInt();
		qtd = sc.nextInt();
		
		double total;
		
		if (codigoPedido == 1) {
			total = qtd * 4.0;
		} else if ( codigoPedido == 2) {
			total = qtd * 4.5;
			
		} else if ( codigoPedido == 3) {
			total = qtd * 5.0;
			
		} else if ( codigoPedido == 4) {
			total = qtd * 2.0;
			
		} else  {
			total = qtd * 1.5;
		} 
			System.out.printf("Total: R$ %.2f%n", total);
		

		sc.close();
	}

}
