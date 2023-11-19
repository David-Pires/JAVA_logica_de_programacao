package main;

import java.util.Scanner;

public class _26_ExercicioResolvido4 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1019
		// Conversão de Tempo

		Scanner sc = new Scanner(System.in);
		
		int N, horas, minutos, segundos, resto;
		
		N = sc.nextInt();
		
		horas = N /3600;
		resto = N % 3600;		

		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		//resto = horas % 60;
		
		//resto = segundos /60;
		
		//System.out.println(resto);
		
		
		sc.close();

	}

}
