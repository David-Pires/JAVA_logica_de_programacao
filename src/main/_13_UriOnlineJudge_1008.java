package main;

import java.util.Locale;
import java.util.Scanner;

public class _13_UriOnlineJudge_1008 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1008
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario, horasDeTrabalho;
		Double valorHoraDeTrabalho ,salarioDoFuncionario;
		
		numeroFuncionario = sc.nextInt();
		horasDeTrabalho = sc.nextInt();
		valorHoraDeTrabalho = sc.nextDouble();
		salarioDoFuncionario = (double) horasDeTrabalho * valorHoraDeTrabalho;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%" , salarioDoFuncionario);
		
		sc.close();

	}

}
