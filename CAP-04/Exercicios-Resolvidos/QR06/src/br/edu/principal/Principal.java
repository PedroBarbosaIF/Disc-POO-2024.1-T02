/*6. Faça um programa que receba um número inteiro e verifique se é par ou ímpar.*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Double num, r;
		System.out.print ("Digite um número: ");
		num = sc.nextDouble();
		System.out.println ("O número digitado foi: " + num);
		
		r = num%2;
		System.out.println ("O resto é: " + r);
		if (r==0) {
		
			System.out.print ("O número é par");
			
		} else {
			System.out.print ("O número é ímpar");
		}
	}

}
