
//05. Faça um programa que receba três números obrigatoriamente em ordem crescente e um quarto núme-ro que não siga essa regra. Mostre, em seguida, os quatro números em ordem decrescente. Suponha
//que o usuário digitará quatro números diferentes.


package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		float num1, num2, num3, num4;
		
		System.out.println(" O primeiro numero é ");
		num1 = scanner.nextFloat();
		
		System.out.println(" O segundo numero é ");
		num2 = scanner.nextFloat();
		
		System.out.println(" O terceiro numero é ");
		num3 = scanner.nextFloat();
		
		System.out.println(" O quarto numero é ");
		num4 = scanner.nextFloat();
		
		
		
		if(num4 > num3) {
			System.out.println(" A ordem decrescente é: " + num4 + "-" + num3 + "-" + num2 + "-" + num1);
			
		}
		if(num4 > num2 && num4 < num3) {
			System.out.println(" A ordem decrescente é: " +  num3 + "-" + num4 + "-" + num2 + "-" + num1);
			
			
		}
		
		if(num4 > num1 && num4 < num2) {
			System.out.println(" A ordem decrescente é: " +  num3 + "-" + num2 + "-" + num4 + "-" + num1);
		}
		
		if(num4 < num1) {
			System.out.println(" A ordem decrescente é: " +  num3 + "-" + num2 + "-" + num1 + "-" + num4);	
		}
			
		
		

	}
