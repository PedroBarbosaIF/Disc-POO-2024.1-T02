package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão proposta QP04: Faça um programa que receba um número, calcule e mostre a tabuada desse número.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		float número = sc.nextFloat();
		
		float calculo;
		int x = 1;
		
		while(x<=10)
		{
			calculo = número * x;
			System.out.println(calculo+" = "+número +" * "+x );
			x++;
		}

	}

}
