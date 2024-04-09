package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão proposta QP04: Faça um programa que receba três números e mostre o maior.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		float numero1 = sc.nextFloat();
		
		System.out.print("Digite o segundo número: ");
		float numero2 = sc.nextFloat();
		
		System.out.print("Digite o terceiro número: ");
		float numero3 = sc.nextFloat();
		
		if (numero1>numero2 & numero1>numero3) 
		{
			System.out.print(numero1+" é o maior número.");
		}
		
		else if (numero2>numero1 & numero2>numero3) 
		{
			System.out.print(numero2+" é o maior número.");
		}
		
		else System.out.print(numero3+" é o maior número.");
	}

}
