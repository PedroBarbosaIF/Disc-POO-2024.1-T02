package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão proposta QP13: Faça um programa que receba a idade e o peso de quinze pessoas, e que calcule e mostre as médias dos
		pesos das pessoas da mesma faixa etária. As faixas etárias são: de 1 a 10 anos, de 11 a 20 anos, de 21 a
		30 anos e de 31 anos para cima.*/
		
		Scanner sc = new Scanner(System.in);
		
		byte qntd = 1, idade = 0, qntd_f1= 0,qntd_f2= 0,qntd_f3= 0,qntd_f4= 0
		;
		float peso = 0, peso1 = 0, peso2 = 0, peso3 = 0, peso4 = 0, média1, média2, média3, média4;
		
		while(qntd <= 15) 
		{
			System.out.print("Qual é a idade da " + qntd + "°pessoa: ");
			idade = sc.nextByte();
			System.out.println("");
			
			System.out.print("Qual é o peso da " + qntd + "°pessoa?: ");
			peso = sc.nextFloat();
			System.out.println("");
			
			if (idade>=1 & idade <=10) 
			{
				qntd_f1++;
				peso1 = peso1+peso;
			}
			else if (idade>=11 & idade <=20) 
			{
				qntd_f2++;
				peso2 = peso2+peso;
			}
			else if (idade>=21 & idade <=30) {
				qntd_f3++;
				peso3 = peso3+peso;
			}
			else if (idade > 30) {
				qntd_f4++;
				peso4 = peso4+peso;
			}
			
			qntd++;
		}
		média1 = peso1/qntd_f1;
		média2 = peso1/qntd_f2;
		média3 = peso1/qntd_f3;
		média4 = peso1/qntd_f4;
		
		System.out.println("Esta é a média do peso das pessoas da 1° faixa etária: " + média1);
		System.out.println("Esta é a média do peso das pessoas da 2° faixa etária: " + média2);
		System.out.println("Esta é a média do peso das pessoas da 3° faixa etária: " + média3);
		System.out.println("Esta é a média do peso das pessoas da 4° faixa etária: " + média4);
	}

}
