package main;

import java.util.Scanner;

public class _33_UriOnlineJudge_1061 {

	public static void main(String[] args) {
		//https://www.beecrowd.com.br/judge/pt/problems/view/1061
		//Tempo de um Evento
		
		//CARACAS ESSE LASCOU TUDO MESMO-----------------------------------
		
		
		Scanner sc = new Scanner(System.in);
		
		String  diaInicial, diaFinal, horaInicial, horaFinal;
		int calcular, dia, hora, minutos, segundos;
		
		
		diaInicial = sc.next();
		horaInicial = sc.next();
		diaFinal = sc.next();
		horaFinal = sc.next();
		
		//calcular = horaInicial / 3600;; 
		
		System.out.println(diaInicial + " dia(s)");
		System.out.println(horaInicial + " hora(s)");
		
		sc.close();
	}

}
