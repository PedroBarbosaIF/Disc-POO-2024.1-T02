package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão resolvida QR23: Faça um programa que receba o valor do salário mínimo, uma lista contendo a quantidade de quilo-
		watts gasta por consumidor e o tipo de consumidor (1 — residencial; 2 — comercial; ou 3 — indus-
		trial) e que calcule e mostre:
		
		- o valor de cada quilowatt, sabendo que o quilowatt custa um oitavo do salário mínimo;
		- o valor a ser pago por consumidor (conta final mais acréscimo). O acréscimo encontra-se na tabela
		a seguir:
		- o faturamento geral da empresa;
		- a quantidade de consumidores que pagam entre R$ 500,00 e R$ 1.000,00.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		float salário, valor_kw, gasto, acréscimo = 0, total = 0, total_geral = 0;
		int qntd_kw_consumidor, qntd_consumidor = 0;
		byte tipo = 0;
		
		System.out.print("Qual o valor do salário mínimo?: ");
		salário = sc.nextFloat();
		
		System.out.print("Qual a quantidade de KW gasta por consumidor?: ");
		qntd_kw_consumidor = sc.nextInt();
		
		valor_kw = salário/8;
		
		while (qntd_kw_consumidor > 0) {
			gasto = qntd_kw_consumidor * valor_kw;
			
			System.out.print("Qual o tipo de consumidor?: ");
			System.out.print("1 - para residencial");
			System.out.print("2 - para comercial");
			System.out.print("3 - para industrial");
			tipo = sc.nextByte();
			System.out.println("");
			
			if (tipo == 1) acréscimo = gasto * 0.05f;
			else if (tipo == 2) acréscimo = gasto * 0.1f;
			else if (tipo == 3) acréscimo = gasto * 0.15f;
			else System.out.println("Digite um valor válido.");
			
			total = gasto + acréscimo;
			total_geral = total_geral + total;
			
			if (total >= 500 & total <= 1000) qntd_consumidor++;
			
			System.out.println("Este é o valor gasto: R$" + gasto);
			System.out.println("Este é o valor do acréscimo: R$" + acréscimo);
			System.out.println("Este é o valor total por consumidor: R$" + total);
			System.out.println("");
			System.out.println("Digite uma nova quantidade de KW por consumidor:");
			System.out.println("Digite um valor menor ou igual a 0 para finalizar");
			qntd_kw_consumidor = sc.nextInt();
		}
		
		System.out.println("Este é o total geral a ser pago: R$" + total_geral);
		System.out.println("Esta é a quantidade de consumidores que pagam entre 500 e 1000: " + qntd_consumidor);
		
		
		
		
	}

}
