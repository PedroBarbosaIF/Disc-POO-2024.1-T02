package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão proposta QP22: Faça um programa que receba a idade e o peso de uma pessoa. De acordo com a tabela a seguir, verifique
		e mostre em qual grupo de risco essa pessoa se encaixaa.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a sua idade?: ");
		int idade = sc.nextInt();
		
		System.out.print("Qual é o seu peso?: ");
		float peso = sc.nextFloat();
		
		if (idade<20 && peso<60) 
		{
			System.out.print("Seu grupo de risco é: 9° ");
		}
		
		else if (idade<20 && peso>=60 & peso<=90) 
		{
			System.out.print("Seu grupo de risco é: 8° ");
		}
		
		else if (idade<20 && peso>90) 
		{
			System.out.print("Seu grupo de risco é: 7° ");
		}
		
		else if (idade>=20 & idade<=50  && peso<60) 
		{
			System.out.print("Seu grupo de risco é: 6° ");
		}
		
		else if (idade>=20 & idade<=50  && peso>=60 & peso<=90) 
		{
			System.out.print("Seu grupo de risco é: 5° ");
		}
		
		else if (idade>=20 & idade<=50  && peso>90) 
		{
			System.out.print("Seu grupo de risco é: 4° ");
		}
		
		else if (idade>50 && peso<60) 
		{
			System.out.print("Seu grupo de risco é: 3° ");
		}
		
		else if (idade>50 && peso>=60 & peso<=90) 
		{
			System.out.print("Seu grupo de risco é: 2° ");
		}
		
		else if (idade>50 && peso>90) 
		{
			System.out.print("Seu grupo de risco é: 1° ");
		}
	}

}
