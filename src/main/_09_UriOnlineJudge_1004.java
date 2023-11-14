package main;

import java.util.Scanner;

public class _09_UriOnlineJudge_1004 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1004
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, PROD;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		PROD = a * b;
		
		System.out.println("PROD = " + PROD);
		sc.close();
	}

}

/*

Leia dois valores inteiros. A seguir, calcule o produto entre estes dois 
valores e atribua esta operação à variável PROD. A seguir mostre a 
variável PROD com mensagem correspondente.   

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, 
com um espaço em branco antes e depois da igualdade. Não esqueça de 
imprimir o fim de linha após o produto, caso contrário seu programa 
apresentará a mensagem: “Presentation Error”.

Exemplos de Entrada	 |  Exemplos de Saída
3						PROD = 27
9

-30						PROD = -300
10

0						PROD = 0		
9



*/