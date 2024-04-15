package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão proposta QP14: Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e sua opinião
		em relação ao filme: ótimo — 3; bom — 2; regular — 1. Faça um programa que receba a idade e a opi-
		nião de quinze espectadores, calcule e mostre: 
		
		- a média das idades das pessoas que responderam ótimo;
		- a quantidade de pessoas que responderam regular; e
		- a percentagem de pessoas que responderam bom, entre todos os espectadores analisados.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		byte qntd = 1, idade = 0, reação = 0, qntd_regular = 0, qntd_bom = 0, qntd_ótimo = 0;
		float média = 0, porcentagem = 0, soma_idades = 0;
		
		
		while(qntd <= 15) 
		{
			System.out.print("Qual é a idade do " + qntd + "° espectador: ");
			idade = sc.nextByte();
			System.out.println("");
			
			System.out.println("Qual é a reação do " + qntd + "°espectador?: ");
			System.out.println("1 - para regular");
			System.out.println("2 - Bom");
			System.out.println("3 - Ótimo");
			reação = sc.nextByte();
			System.out.println("");
			
			if (reação == 3) 
			{
				soma_idades = soma_idades + idade;
				qntd_ótimo++;
			}
			if (reação == 1) qntd_regular++;
			if (reação == 2) qntd_bom++;
			qntd++;
		}
		média = soma_idades / qntd_ótimo;
		porcentagem = (qntd_bom * 100) / 15;
		System.out.println("Esta é a média das idades das pessoas que responderam ótimo: "+ média);
		System.out.println("Esta é a a quantidade de pessoas que responderam regular: " + qntd_regular);
		System.out.println("a porcentagem de pessoas que responderam bom, entre todos os espectadores analisados: " + porcentagem + "%");


	}

}
