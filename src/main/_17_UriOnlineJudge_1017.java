package main;

import java.util.Locale;
import java.util.Scanner;

public class _17_UriOnlineJudge_1017 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1017
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempoGastoNaViagem, velocidadeMedia;
		double gastoAutomovel;
		
		tempoGastoNaViagem = sc.nextInt();
		velocidadeMedia = sc.nextInt();
		gastoAutomovel = (double) (tempoGastoNaViagem * velocidadeMedia) / 12;
		
		System.out.printf("%.3f%n", gastoAutomovel );
		
		sc.close();

	}

}
