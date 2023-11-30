package main;

import java.util.Locale;
import java.util.Scanner;

public class _36_ExercicioResolvido7 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1036
		// Fórmula de Bhaskara
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double A = sc.nextDouble();
		Double B = sc.nextDouble();
		Double C = sc.nextDouble();
		
		Double calculo1 = Math.pow(B, 2) - 4.0 * A * C;
		
		
		if (calculo1 < 0.0 || A == 0) {
			System.out.println("Impossivel calcular");
		} 
		else {
			Double r1 = (-B + Math.sqrt(calculo1)) / (2.0 * A);
			Double r2 = (-B - Math.sqrt(calculo1)) / (2.0 * A);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		
		
		
		
		
		sc.close();
	}

}
