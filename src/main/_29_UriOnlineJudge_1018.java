  package main;

import java.util.Scanner;

public class _29_UriOnlineJudge_1018 {	
	
	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1018
		//Cédulas
		
		Scanner sc = new Scanner(System.in);
		
		int N,resto, cedula, calculo;
			
		
		N = sc.nextInt();
		System.out.println(N);
		resto = N;
		
		cedula =  100;
		
		calculo = resto / cedula;
		
		System.out.println(calculo + " nota(s) de R$ " + cedula + ",00");
		resto = resto % cedula;
		
		cedula = 50;
		
		calculo = resto / cedula;
		
		System.out.println(calculo + " nota(s) de R$ " + cedula + ",00");
		resto = resto % cedula;
		
		cedula = 20;
		
		calculo = resto / cedula;
		
		System.out.println(calculo + " nota(s) de R$ " + cedula + ",00");
		resto = resto % cedula;
		
		cedula = 10;
		
		calculo = resto / cedula;
		
		System.out.println(calculo + " nota(s) de R$ " + cedula + ",00");
		resto = resto % cedula;
		
		cedula = 5;
		
		calculo = resto / cedula;
		
		System.out.println(calculo + " nota(s) de R$ " + cedula + ",00");
		resto = resto % cedula;
		
		cedula = 2;
		
		calculo = resto / cedula;
		System.out.println(calculo + " nota(s) de R$ " + cedula + ",00");
		resto = resto % cedula;
		
		cedula = 1;
		calculo = resto / cedula;
		System.out.println(calculo + " nota(s) de R$ " + cedula + ",00");
		resto = resto % cedula;

		sc.close();

	}

}
