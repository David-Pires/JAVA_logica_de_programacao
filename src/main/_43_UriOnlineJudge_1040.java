package main;

import java.util.Locale;
import java.util.Scanner;

public class _43_UriOnlineJudge_1040 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1040
		// Média 3

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media, notaExame;
		
		nota1 = sc.nextFloat();
		nota2 = sc.nextFloat();
		nota3 = sc.nextFloat();
		nota4 = sc.nextFloat();
		
		media = (nota1 * 2f + nota2 * 3f + nota3 * 4f + nota4 * 1f) / 10f;
		
		if (media >= 7f) {
			System.out.printf("Media: %.1f%n", media);
			System.out.printf("Aluno aprovado.");
			
		} else if (media < 5f) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno reprovado.");
			
		} else {
			System.out.println("Aluno em exame.");
			
			
			notaExame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			float novoCalculo = (notaExame + media) / 2f;
			
				if (novoCalculo >= 5f) {
					System.out.println("Aluno aprovado.");
					System.out.printf("Media final: %.1f%n", novoCalculo);
					
				} else if (novoCalculo < 5.0 ) {
					System.out.println("Aluno reprovado.");
					System.out.printf("Media final: %.1f", novoCalculo);
					
				}			
			
		}		
		
		sc.close();

	}

}


/*

Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media, notaExame;
		
		nota1 = sc.nextFloat();
		nota2 = sc.nextFloat();
		nota3 = sc.nextFloat();
		nota4 = sc.nextFloat();
		
		media = (nota1 * 2f + nota2 * 3f + nota3 * 4f + nota4 * 1f) / 10f;
		
		if (media >= 7f) {
			System.out.printf("Media: %.1f%n", media);
			System.out.printf("Aluno aprovado.");
			
		} else if (media < 5f) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno reprovado.");
			
		} else if (media >= 5f && media <= 6.9f) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno em exame.");
			
			notaExame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			float novoCalculo = (notaExame + media) / 2f;
			
				if (novoCalculo > 5f) {
					System.out.println("Aluno aprovado.");
					System.out.printf("Media final: %.1f%n", novoCalculo);
					
				} else if (novoCalculo < 5.0 ) {
					System.out.println("Aluno reprovado.");
					System.out.printf("Media final: %.1f%n", novoCalculo);
					
				}			
			
		}		
		
		sc.close();

*/