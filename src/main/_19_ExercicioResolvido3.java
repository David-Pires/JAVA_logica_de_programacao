package main;

import java.util.Locale;
import java.util.Scanner;

public class _19_ExercicioResolvido3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1, nome2;
		int idade1, idade2;
		Double media;
		
		nome1 = sc.next();
		nome2 = sc.next();
		
		idade1 = sc.nextInt();
		idade2 = sc.nextInt();
		
		media = (double) (idade1 + idade2) /2;// pode colocar 2.0 no final e n�o casting dessa
		//forma for�a o compilador a converter para double
		
		System.out.printf("A idade m�dia de %s e %s � de %.1f", nome1, nome2, media);
		
		sc.close();
	}

}

/*
 * Fazer um programa para ler o nome (apenas uma palavra) e idade de duas pessoas.
 * Ao final mostrar uma mensagem com os nomes e a idade m�dia entre essas pessoas,
 * com uma casa decimal, conforme exemplo
 * 
 * Exemplo:
 * 
 * Entrada:          |Sa�da
 * 
 *  Maria 29          A idade m�dia de Maria e joaquim � de 19.5 anos
 *  */