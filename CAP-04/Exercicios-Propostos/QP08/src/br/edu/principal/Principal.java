package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão proposta QP08: Faça um programa para calcular e mostrar o salário reajustado de um funcionário. O percentual de aumento
		encontra-se na tabela a seguir.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual foi seu salário?: ");
		float salario = sc.nextFloat();
		
		if (salario <= 300) 
		{
			float salario_reajustado = 1.35f * salario;
			System.out.print("Este é o seu salário reajustado(+35%): R$" + salario_reajustado);
		}
		else 
		{
			float salario_reajustado = 1.15f * salario;
			System.out.print("Este é o seu salário reajustado(+15%): R$" + salario_reajustado);
		}
	}

}
