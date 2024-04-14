package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão resolvida QR24: Faça um programa que apresente o menu de opções a seguir, permita ao usuário escolher a opção
		desejada, receba os dados necessários para executar a operação e mostre o resultado. Verifique a pos-
		sibilidade de opção inválida e não se preocupe com restrições do tipo salário inválido.
		
		Menu de opções:
		1. Imposto
		2. Novo salário
		3. Classificação
		4. Finalizar o programa
		Digite a opção desejada.
		
		- Na opção 1: receber o salário de um funcionário, calcular e mostrar o valor do imposto usando as regras
		a seguir.
		
		- Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor do novo salário usando as
		regras a seguir.
		
		- Na opção 3: receber o salário de um funcionário e mostrar sua classificação usando esta tabela:
		*/
		
		Scanner sc = new Scanner(System.in);
		
		byte opção = 0, aumento;
		float imposto, salário = 0;
		
		do {
			System.out.println("");
			System.out.println("Escolha uma opção");
			System.out.println("");
			System.out.println("Menu de opções");
			System.out.println("1 - para Imposto");
			System.out.println("2 - 2 para Novo salário");
			System.out.println("3 - para Classificação");
			System.out.println("4 - para Finalizar programa");
			opção = sc.nextByte();
			
			if (opção == 1) 
			{
				imposto = 0;
				salário = 0;
				
				System.out.print("Digite o salário: ");
				salário = sc.nextFloat();
				
				if (salário < 500) imposto = 0.05f * salário;
				else if (salário >= 500 & salário <= 850) imposto = 0.1f * salário;
				else imposto = salário * 0.15f;
				
				System.out.print("Este é o valor do imposto: R$" + imposto);
			}//OPÇÃO 1
			
			else if (opção == 2) 
			{
				System.out.print("Digite o salário: ");
				salário = sc.nextFloat();
				
				if (salário > 1500) aumento = 25;
				else if (salário <= 1500 & salário >= 750) aumento = 50;
				else if (salário <= 750 & salário >= 450) aumento = 75;
				else aumento = 100;
				
				salário = salário + aumento;
				System.out.println("Este é o novo salário: R$" + salário);
			}
			
			else if (opção == 3) 
			{
				System.out.print("Digite o salário: ");
				salário = sc.nextFloat();
				
				if (salário <= 700) System.out.println("O salário é MAL REMUNERADO");
				else System.out.println("O salário é BEM REMUNERADO");
			}
			
			else if (opção < 1 || opção > 4) System.out.println("Digite uma opção válida.");
		} while (opção != 4);

	}

}
