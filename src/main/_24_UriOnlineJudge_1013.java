package main;

import java.util.Locale;
import java.util.Scanner;

public class _24_UriOnlineJudge_1013 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1013
		//O MAIOR 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, f;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		d =  (a + b + Math.abs(a - b ))/2;
		
		f = (d + c + Math.abs(d - c))/2;
		
		System.out.println(f + " eh o maior");
		sc.close();

	}

}
