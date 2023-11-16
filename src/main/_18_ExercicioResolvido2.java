package main;

import java.util.Locale;
import java.util.Scanner;

public class _18_ExercicioResolvido2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double base, altura, diagonal, area, perimetro;
		
		base = sc.nextDouble();
		altura = sc.nextDouble();
		
		area = base * altura;
		perimetro = 2.0 * (base + altura); // soma de todos os lados
		diagonal = Math.sqrt((base * base) + (altura * altura));
		System.out.printf("AREA = %.4f%n",area);
		System.out.printf("PERIMETRO = %.4f%n",perimetro);
		System.out.printf("DIAGONAL = %.4f%n",diagonal);
		
		
				
		sc.close();
	}

}
/*
�rea = base x altura
perimetro = 2 x base + 2 x altura
diagonal = raiz base� + altura�

Fazer um programa para ler as medidas da base e altura de um retangulo.
Em seguida, mostrar o valor da �rea e diagonal deste ret�ngulo, com 
quatro casas decimais, conforme exemplo.

Exemplo:
	
Entrada:                   Sa�da:
	5.0                    AREA = 20.0000
	4.0                    PERIMETRO = 18.0000 
	                       DIAGONAL = 6.4031
	                       
	                       */