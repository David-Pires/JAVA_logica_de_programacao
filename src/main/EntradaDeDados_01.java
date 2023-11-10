package main;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados_01 {

	public static void main(String[] args) {
		// Ponto Flutuante;
		// Ler Dados na minha linha 

		Locale.setDefault(Locale.US);

		Scanner scy = new Scanner(System.in);
		char y;
		int b;
		double d;

		y = scy.next().charAt(1);
		b = scy.nextInt();
		d = scy.nextDouble();
		
		System.out.println("Você digitou: " + y);
		System.out.println("Você digitou o número inteiro: " + b);
		System.out.printf("Você digitou o número double: %.3f%n " , d);

		scy.close();

		// PARA LER UM CARACTERE
		// SUPONHA UMA VARIAVEL TIPO char DECLARADA
		// char x;
		// x = sc.next().charAt(0);

	}

}
