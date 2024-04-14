//03.Faça um programa que receba dois números e mostre o maior.

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float num1,num2;
		
		System.out.println("Digite o primeiro numero.");
		num1 = scanner.nextFloat();
		
		System.out.println("Digite o segundo numero.");
		num2 = scanner.nextFloat();
		
		
		
		if(num1 > num2) {
			System.out.println( " O " + num1  + " é maior ");
			
		}
		
		else if(num2 > num1) {
			System.out.println(" O " +  num2 +  " é maior ");
				
			
		}
		
		
		else {
			System.out.println(" Os dois são iguais ");
		}
	}
	
	
	

}