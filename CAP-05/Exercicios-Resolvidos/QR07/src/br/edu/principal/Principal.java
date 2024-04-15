/*7. Faça um programa que monte os oito primeiros termos da sequência de Fibonacci.

0-1-1-2-3-5-8-13-21-34-55...*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double cont, num1, num2, res;
		num1 = 0;
		num2 = 1;
		
		System.out.println(num1);
		System.out.println(num2);

		for (cont=3; cont<=8; cont++)
		{
			res = num1+num2;
			System.out.println(res);
			num1=num2;
			num2=res;
		}
	}
}