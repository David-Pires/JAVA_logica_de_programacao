package main;

import java.util.Locale;
import java.util.Scanner;

public class _21_UriOnlineJudge_1009 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1009
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeVendedor;
		Double salarioFixo, totalDeVendas, salarioFinal;
		
		nomeVendedor = sc.nextLine();
		salarioFixo = sc.nextDouble();
		totalDeVendas = sc.nextDouble();
		
		salarioFinal = (Double) salarioFixo + ((totalDeVendas / 100) * 15);
		
		
		System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);		
		sc.close();
	}

}
