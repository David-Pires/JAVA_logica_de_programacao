package main;

import java.util.Scanner;

public class _30_UriOnlineJuddge_1020 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1020
		//Idade em Dias

		Scanner sc = new Scanner(System.in);
		
		int N, dia, mes, ano, calculo, resto;
		
		N = sc.nextInt();
		
		resto = N;
		ano = 365;
		calculo = resto / ano;
		System.out.println(calculo + " ano(s)");
		resto = resto % ano;

		
		mes = 30;
		calculo = resto / mes;
		System.out.println(calculo + " mes(es)");
		resto = resto % mes;
		

		dia = 1;
		calculo = resto / dia;
		System.out.println(calculo + " dia(s)");
		
		
		sc.close();
	}

}
