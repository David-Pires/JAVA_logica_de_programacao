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
		
		media = (double) (idade1 + idade2) /2;
		
		System.out.printf("A idade média de %s e %s é de %.1f", nome1, nome2, media);
		
		sc.close();
	}

}

/*
 * Fazer um programa para ler o nome (apenas uma palavra) e idade de duas pessoas.
 * Ao final mostrar uma mensagem com os nomes e a idade média entre essas pessoas,
 * com uma casa decimal, conforme exemplo
 * 
 * Exemplo:
 * 
 * Entrada:          |Saída
 * 
 *  Maria 29          A idade média de Maria e joaquim é de 19.5 anos
 *  */