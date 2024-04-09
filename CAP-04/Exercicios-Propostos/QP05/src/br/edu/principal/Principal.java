package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão proposta QP05: Faça um programa que receba dois números e execute as operações listadas a seguir, de acordo com a escolha
		do usuário.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		float numero1 = sc.nextFloat();
		
		System.out.print("Digite o segundo número: ");
		float numero2 = sc.nextFloat();
		
		System.out.println("Digite '1' para a média dos números digitados: ");
		System.out.println("Digite '2' para a diferença do maior pelo menor: ");
		System.out.println("Digite '3' para o produto entre números digitados: ");
		System.out.println("Digite '4' para a divisão do primeiro pelo segundo: ");
		
		int escolha = sc.nextInt();
		
		if (escolha == 1) 
		{
			float media = (numero1+numero2)/2;
			System.out.print("Esta é a média dos números digitados: "+media);
		}
		
		if (escolha== 2) 
		{
			float diferenca = numero1 - numero2;
			
			if (diferenca<0) 
			{
				diferenca = diferenca * (-1);
				System.out.print("Esta é a diferença dos números digitados: "+ diferenca);
			}
			
			else System.out.print("Esta é a diferença dos números digitados: "+ diferenca);
			
		}
		
		if (escolha ==3) 
		{
			float produto = numero1 * numero2;
			System.out.print("Este é o produto dos números digitados: "+ produto);
		}
		
		if (escolha == 4) 
		{
			float divisao = numero1/numero2;
			System.out.print("Esta é a divisão dos números digitados: "+ divisao);
		}
	}

}
