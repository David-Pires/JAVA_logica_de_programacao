package main;

import java.util.Scanner;

public class _34_ExercicioResolvido5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora:");
		
		int hora =  sc.nextInt();
		
		if (hora >= 5 && hora <= 12) {
			System.out.println("Bom dia");
		} else if ( hora >= 12 && hora <= 18) {
			System.out.println("Boa tarde");
		} else if (hora >= 19 && hora <= 24) {
			System.out.println("Boa noite");
		} else if (hora >= 1 && hora <= 4) {
			System.out.println("Boa noite");			
		}
			
		sc.close();

	}

}
