package main;

import java.util.Scanner;

public class _27_UriOnlineJudge_1019 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1019
		//Convers�o de Tempo

		Scanner sc = new Scanner(System.in);
		int N, horas, minutos, segundos, resto;
		
		N = sc.nextInt();
		
		horas = N / 3600;
		resto = N % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		//System.out.println(resto);
		//System.out.println(minutos);
		//System.out.println(resto);

		sc.close();
		
	}

}
/*
580.800 / 3600








*/