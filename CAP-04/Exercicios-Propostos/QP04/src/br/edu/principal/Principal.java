package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Quest�o proposta QP04: Fa�a um programa que receba tr�s n�meros e mostre o maior.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		float numero1 = sc.nextFloat();
		
		System.out.print("Digite o segundo n�mero: ");
		float numero2 = sc.nextFloat();
		
		System.out.print("Digite o terceiro n�mero: ");
		float numero3 = sc.nextFloat();
		
		if (numero1>numero2 & numero1>numero3) 
		{
			System.out.print(numero1+" � o maior n�mero.");
		}
		
		else if (numero2>numero1 & numero2>numero3) 
		{
			System.out.print(numero2+" � o maior n�mero.");
		}
		
		else System.out.print(numero3+" � o maior n�mero.");
	}

}
