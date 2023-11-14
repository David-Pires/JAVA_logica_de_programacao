package main;

import java.util.Locale;
import java.util.Scanner;

public class _14_UriOnlineJudge_1010 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1010
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, qtdPeca1;
		double valorUnitario1,valorTotal1 ;
		
		codigoPeca1 = sc.nextInt();
		qtdPeca1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
	
		valorTotal1 = (double) qtdPeca1 * valorUnitario1;
		
		
		
		int codigoPeca2, qtdPeca2;
		double valorUnitario2, valorTotal2;
		
		codigoPeca2 = sc.nextInt();
		qtdPeca2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();

		valorTotal2 = (double) qtdPeca2 * valorUnitario2;	
		
		Double somaDasDuasLinhas = valorTotal1 + valorTotal2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n" , somaDasDuasLinhas );
		
		sc.close();

	}

}
