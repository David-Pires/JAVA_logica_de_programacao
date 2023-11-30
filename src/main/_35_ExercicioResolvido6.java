package main;

import java.util.Locale;
import java.util.Scanner;

public class _35_ExercicioResolvido6 {

	public static void main(String[] args) {
		// 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double nota1, nota2;
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		Double somaNotas = nota1 + nota2;
		
		if (somaNotas > 60.00) {
			System.out.printf("NOTA FINAL = %.1f%n", somaNotas);
		} else {
			
			System.out.printf("NOTA FINAL = %.1f%nREPROVADO", somaNotas);
		}
			
		
		sc.close();
	}

}
