package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão proposta QP24: Faça um programa que receba um conjunto de valores inteiros e positivos, calcule e mostre o maior e o
		menor valor do conjunto. Considere que:
		
		- para encerrar a entrada de dados, deve ser digitado o valor zero;
		- para valores negativos, deve ser enviada uma mensagem;
		- os valores negativos ou iguais a zero não entrarão nos cálculos.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int maior_número = 0, menor_número = 0, qntd = 0;
		
		System.out.print("Digite um valor inteiro e positivo: ");
		int número = sc.nextInt();
		System.out.println("");
		
		while(número != 0) 
		{
			if (número <0) 
			{
				System.out.println("Digite um valor inteiro e positivo.");
				número = sc.nextInt();
			}
			else {
				if (qntd == 0) 
				{
					maior_número = número;
					menor_número = número;
					qntd++;
				}
				if (número > maior_número) maior_número = número;
				if (número < menor_número) menor_número = número;
				
				System.out.println("Digite outro número inteiro e positivo: ");
				System.out.println(" - Digite 0 para encerrar o programa - ");
				número = sc.nextInt();
				System.out.print("");
			}
		}
		System.out.println("Este é o maior número: " + maior_número);
		System.out.println("Este é o menor número: " + menor_número);


		
	}

}
