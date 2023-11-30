package main;

import java.util.Locale;
import java.util.Scanner;

public class _32_UriOnlineJudge_1021_newResolution {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1021
		// Notas e Moedas
		//100, 50, 20, 10, 5, 2
		//1, 0.50, 0.25, 0.10, 0.05 e 0.01
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double N;
		int quociente, resto, nota, moeda;
		
		N = sc.nextDouble();
		
		resto = (int) (N *100.0 + 0.5);
				
		System.out.println("NOTAS:");
		
		nota = 100;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % ( nota * 100);
		
		nota = 50;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);

		nota = 20;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);

		nota = 10;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		nota = 5;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		nota = 2;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		System.out.println("MOEDAS:");
		
		moeda = 100;		
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 1.00");
		resto = resto % moeda;
		
		moeda = 50;		
		quociente = resto / moeda ;
		System.out.println(quociente + " moeda(s) de R$ 0.50");
		resto = resto % moeda;

		moeda = 25;		
		quociente = resto / moeda ;
		System.out.println(quociente + " moeda(s) de R$ 0.25");
		resto = resto % moeda;
		
		moeda = 10;		
		quociente = resto / moeda ;
		System.out.println(quociente + " moeda(s) de R$ 0.10");
		resto = resto % moeda;
		
		moeda = 5;		
		quociente = resto / moeda ;
		System.out.println(quociente + " moeda(s) de R$ 0.05");
		resto = resto % moeda;
		
		System.out.println(resto + " moeda(s) de R$ 0.01");
		sc.close();
	}

}
