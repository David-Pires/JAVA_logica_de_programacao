package main;

import java.util.Locale;
import java.util.Scanner;

public class _01_EntradaDeDados {

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
		
		System.out.println("Voc� digitou: " + y);
		System.out.println("Voc� digitou o n�mero inteiro: " + b);
		System.out.printf("Voc� digitou o n�mero double: %.3f%n " , d);

		scy.close();

		// PARA LER UM CARACTERE
		// SUPONHA UMA VARIAVEL TIPO char DECLARADA
		// char x;
		// x = sc.next().charAt(0);

	}

}
