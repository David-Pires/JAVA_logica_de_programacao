package main;

import java.util.Locale;
import java.util.Scanner;

public class _04_ExercicioResolvido {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Double largura = sc.nextDouble();
		Double comprimento = sc.nextDouble();
		Double valorMetroQuadrado = sc.nextDouble();
		
		Double area = largura * comprimento;
		Double preco = valorMetroQuadrado * area;
		
		System.out.printf("AREA = %.2f%n" , area);
		System.out.printf("PRECO = %.2f%n" , preco);
	
		sc.close();

	}

}
/*FAZER UM PROGRAMA PARA LER AS MEDIDAS DA LARGURA E COMPRIMENTO DE UM TERRENO
 * RETANGULAR COM UMA CASA DECIMAL, BEM COMO O VALOR DO METRO QUADRADO DO TERRENO
 * COM DUAS CASAS DECIMAIS. EM SEGUIDA, O PROGRAMA DEVE MOSTRAR O VALOR DA ÁREA DO
 * TERRENO, BEM COMO O VALOR DO PREÇO DO TERRENO, AMBOS COM DUAS CASAS DECIMAIS
 * CONFORME O EXEMPLO
 * 
 * EXEMPLO
 * 
 * ENTRADA       |SAÍDA
 * 10.0           AREA = 300.00
 * 30.0           PRECO = 60000.00
 * 200.0
 */