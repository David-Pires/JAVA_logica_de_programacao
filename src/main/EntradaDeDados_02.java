package main;

import java.util.Scanner;

public class EntradaDeDados_02 {

	public static void main(String[] args) {
		/*
		 * PARA LER UM TEXTO ATÉ A QUEBRA DE LINHA;
		 * 
		 * Scanner sc = new Scanner(System.in); String s1, s2, s3;
		 * 
		 * s1 = sc.nextLine(); s2 = sc.nextLine(); s3 = sc.nextLine();
		 * 
		 * System.out.println("DADOS DIGITADOS:"); System.out.println(s1);
		 * System.out.println(s2); System.out.println(s3);
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		int x;
		String a, b, c ,y;
		
		x = sc.nextInt();
		sc.nextLine();
		a = sc.nextLine();
		b = sc.nextLine();
		c = sc.nextLine();
		System.out.println("Dados digitados");
		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		sc.close();

	}

}
