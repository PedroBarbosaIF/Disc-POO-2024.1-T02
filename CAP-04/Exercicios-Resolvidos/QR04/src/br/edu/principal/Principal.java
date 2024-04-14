
//04.Faça um programa que receba três números e mostre-os em ordem crescente. Suponha que o usuário digitará três números diferentes.

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
			float num1, num2, num3;
			
			System.out.println(" O primeiro numero é ");
			num1 = scanner.nextFloat();
			
			System.out.println(" O segundo numero é ");
			num2 = scanner.nextFloat();
			
			System.out.println(" O terceiro numero é ");
			num3 = scanner.nextFloat();
			
			if(num1<num2 && num1<num3) {
				if(num2<num3) {
					System.out.println(" A ordem crescente é: " +  num1 + "-" + num2 + "-" + num3);
				
				}
				else{
					System.out.println(" A ordem crescente é: " +  num1 + "-" + num3 + "-" + num2);	
				}
				
			}
			if(num2 < num1 && num2 < num3) {
				if(num1 < num3) {
					System.out.println(" A ordem crescente é: " +  num2 + "-" + num1 + "-" + num3);
				}
				else{
					System.out.println(" A ordem crescente é: " +  num2 + "-" + num3 + "-" + num1);	
				}
			}
			
			if(num3 < num1 && num3 <num2) {
				if(num1<num2) {
					System.out.println(" A ordem crescente é: " +  num3 + "-" + num1 + "-" + num2);
				}
				else {
					System.out.println(" A ordem crescente é: " +  num3 + "-" + num2 + "-" + num1);	
				}
			}
			

		}

	}

