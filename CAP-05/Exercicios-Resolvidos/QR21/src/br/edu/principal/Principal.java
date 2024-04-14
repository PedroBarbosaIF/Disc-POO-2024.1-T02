package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão resolvida QR21:Faça um programa que receba vários números, calcule e mostre:
		
		- a soma dos números digitados;
		- a quantidade de números digitados;
		- a média dos números digitados;
		- o maior número digitado;
		- o menor número digitado;
		- a média dos números pares;
		- a porcentagem dos números ímpares entre todos os números digitados.
		Finalize a entrada de dados com a digitação do número 30.000.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		float número = 0, soma = 0, média, maior_número = 0, menor_número = 0, média_pares = 0, porcentagem, soma_pares = 0,
		qntd_pares = 0, qntd_ímpares = 0;
		
		int qntd = 0;
		
		System.out.print("Digite um valor para o primeiro número: ");
		número = sc.nextFloat();
		
		while(número!= 30000) 
		{
			if(qntd == 0) 
			{
				maior_número = número;
				menor_número = número;
			}
			else 
			{
				if (número > maior_número) maior_número = número;
				if (número < menor_número) menor_número = número;
			}
			soma = soma + número;
			qntd++;
			
			if (número%2 == 0) 
			{
				soma_pares = soma_pares + número;
				qntd_pares++;
			}
			else qntd_ímpares++;
			
			System.out.println("Digite um valor para outro número: ");
			System.out.println("Digite 30000(trinta mil) para finalizar o programa");
			número = sc.nextFloat();
		}
		
		if (qntd == 0) System.out.println("Nenhum número digitado");
		else 
		{
			System.out.println("Este é o valor da soma dos números: " + soma);
			System.out.println("Esta é a quantidade dos números: " + qntd);
			média = soma/ qntd;
			System.out.println("Esta é a média dos números digitados: " + média);
			System.out.println("Este é o valor do maior número: " + maior_número);
			System.out.println("Este é o valor do menor número: " + menor_número);
			
			if (qntd_pares == 0) System.out.println("Nenhum par");
			else 
			{
				média_pares = soma_pares / qntd_pares;
				System.out.println("Esta é a média dos números pares: " + média_pares);
			}
			
			if (qntd_ímpares == 0) System.out.println("Não há números ímpares");
			else 
			{
				porcentagem = qntd_ímpares * 100/ qntd;
				System.out.println("Esta é a porcentagem dos números ímpares do total: " + porcentagem + "%");
			}

			
		}
	}

}
