package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão resolvida QR10: Em um campeonato de futebol existem cinco times e cada um possui onze jogadores. Faça um progra-
		ma que receba a idade, o peso e a altura de cada um dos jogadores, calcule e mostre:
		
		- a quantidade de jogadores com idade inferior a 18 anos;
		- a média das idades dos jogadores de cada time;
		- a média das alturas de todos os jogadores do campeonato; e
		- a porcentagem de jogadores com mais de 80 kg entre todos os jogadores do campeonato.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		byte idade, soma_novos = 0;
		float peso, altura, soma_gordos = 0, média_idades = 0, média_alturas = 0;
		
		for(int x = 1; x<= 2; x++) 
		{
			soma_novos = 0;
			média_idades = 0;
			for(int y = 1; y<=2; y++) 
			{
				
				System.out.println("Qual é a idade do " + y + "° jogador?: ");
				idade = sc.nextByte();
				
				System.out.println("Qual é o peso do " + y + "° jogador?: ");
				peso = sc.nextFloat();
				
				System.out.println("Qual é a altura do " + y + "° jogador?: ");
				altura = sc.nextFloat();
				
				if (peso > 80) 
				{
					soma_gordos++;
				}
				
				if (idade < 18) soma_novos++;
				
				média_idades = média_idades + idade;
				média_alturas = média_alturas + altura;
				
			}//REPETIÇÃO DOS JOGADORES
			System.out.println("Esta é a quantidade de jogadores menores de 18 do "+ x + "° time: " + soma_novos);
			
			média_idades = média_idades/2;
			System.out.println("Esta é a média das idades do "+ x + "° time: "+ média_idades);
			
			
			
		}//REPETIÇÃO DOS TIMES
		média_alturas = média_alturas/4;
		System.out.println("Esta é a média das alturas dos jogadores de todos os times: "+ média_alturas);
		
		soma_gordos = (soma_gordos * 100)/4;
		System.out.println("Esta é a porcentagem de jogadores acima de 80kg de todos os times: "+ soma_gordos + "%");
		
	}

}
