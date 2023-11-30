package main;

import java.util.Scanner;

public class _37_ExercicioResolvido8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if (n1 <= n2 && n1 <= n3) {
			System.out.println("MENOR = " + n1);
		} else if (n2 <= n1 && n2 <= n3) {
			System.out.println("MENOR = " + n2);			
		} else if (n3 <= n1 && n3 <= n2) {
			System.out.println("Menor = " + n3);
		} else if (n1 == n2 && n1 == n3){
			System.out.println("Menor = " + n1);
		}
		
		sc.close();
	}

}
