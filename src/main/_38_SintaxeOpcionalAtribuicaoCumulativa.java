package main;

import java.util.Locale;
import java.util.Scanner;

public class _38_SintaxeOpcionalAtribuicaoCumulativa {

	public static void main(String[] args) {
		// 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutosUtilizados = sc.nextInt();
		double valorPacoteBasico = 50.0;
		
		if (minutosUtilizados > 100) {
			valorPacoteBasico += (minutosUtilizados - 100) * 2;
			System.out.println("Valor a pagar: R$ " + valorPacoteBasico);
		} else {
			System.out.println("Valor a pagar: R$ " + valorPacoteBasico);
		}
			
		
		sc.close();

	}

}
/* 

UMA OPERADORA DE TELEFONIA COBRA R$ 50.00 POR UM PLANO B�SICO QUE D� DIREITO A 100 MINUTOS DE TELEFONE. 
CADA MINUTO QUE EXCEDER A FRANQUIA DE 100 MINUTOS CUSTA R$ 2.00. FAZER UM PROGRAMA PARA LER A QUANTIDADE
DE MINUTOS QUE UAM PESSOA CONSUMIU, DA� MOSTRAR O VALOR A SER PAGO.abstract

ENTRADA      |   SA�DA
22            Valor a pagar: R$ 50.00

ENTRADA      |   SA�DA
103           Valor a pagar: 56.00

*/