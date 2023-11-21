package main;

import java.util.Locale;
import java.util.Scanner;

public class _31_UriOnlineJudge_1021 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1021
		//Notas e Moedas

		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		Double N;
		int quociente, resto, nota, moeda;
		N = sc.nextDouble();
		
		resto = (int) (N * 100.0 + 0.5);
		
		System.out.println();
		
		nota = 100;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		nota = 50;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		nota = 20;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		
		
		//System.out.printf("%.0f nota(s) de R$ %d.00 %n", resto, cedula100);
		
		//testeResto = (int) testeResto;
		//System.out.println(resto + " nota(s) de R$ " + cedula100 + ".00");
		

		
		
		sc.close();
	}

}
