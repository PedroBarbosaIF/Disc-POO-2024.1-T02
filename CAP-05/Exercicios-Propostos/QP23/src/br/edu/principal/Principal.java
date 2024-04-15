package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão proposta QP23: Faça um programa que apresente o menu de opções a seguir, que permita ao usuário escolher a opção
		desejada, receba os dados necessários para executar a operação e mostre o resultado. Verifique a possibi-
		lidade de opção inválida e não se preocupe com as restrições como salário inválido.
		
		Menu de opções:
		1. Novo salário
		2. Férias
		3. Décimo terceiro
		4. Sair
		Digite a opção desejada.
		
		- Na opção 1: receber o salário de um funcionário, calcular e mostrar o novo salário usando as regras a se-
		guir:
		
		- Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor de suas férias. Sabe-se que as
		férias equivalem a seu salário acrescido de um terço do salário.
		
		- Na opção 3: receber o salário de um funcionário e o número de meses de trabalho na empresa, no máximo
		doze, calcular e mostrar o valor do décimo terceiro. Sabe-se que o décimo terceiro equivale a seu salário
		multiplicado pelo número de meses de trabalho dividido por 12.
		
		- Na opção 4: sair do programa.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		byte opção = 5, meses;
		float salário, novo_salário, férias;
		
		do 
		{
			System.out.println("Escolha uma opção: ");
			System.out.println("1. Novo salário");
			System.out.println("2. Férias");
			System.out.println("3. Décimo terceiro");
			System.out.println("4. Sair");
			opção = sc.nextByte();
			System.out.println("");
			
			if (opção<1 || opção > 4) 
			{
				System.out.println("- Escolha uma opção válida: ");
				System.out.println("");
			}
			else if (opção == 1) 
			{
				System.out.print("Digite um salário: ");
				salário = sc.nextFloat();
				System.out.println("");
				
				if (salário < 210) novo_salário = 1.15f * salário;
				else if (salário >= 210 & salário <= 600) novo_salário = 1.1f * salário;
				else novo_salário = 1.05f * salário;
				System.out.println("- Este é o novo salário: R$" + novo_salário);
				System.out.println("");
			}//OPÇÃO 1
			
			else if (opção == 2) 
			{
				System.out.print("Digite um salário: ");
				salário = sc.nextFloat();
				System.out.println("");
				
				salário = 0.33f * salário;
				System.out.println("Este é o valor de sua férias: R$" + salário);
			}//OPÇÃO 2
			
			else if (opção==3) 
			{
				System.out.print("Digite um salário: ");
				salário = sc.nextFloat();
				
				System.out.print("Digite o números de meses trabalhados(máx. 12 meses): ");
				meses = sc.nextByte();
				System.out.println("");
				
				if(meses > 12 || meses < 1) 
				{
					System.out.println("Digite um número de meses menor que 12:");
					System.out.println(" ");
				}
				else 
				{
					salário = (salário * meses)/12;
					System.out.println("Este é o valor do seu décimo terceiro: R$" + salário);
				}//OPÇÃO 3
			}
			
		} while(opção !=4);
	}

}
