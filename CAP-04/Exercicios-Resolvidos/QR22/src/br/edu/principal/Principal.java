package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão resolvida QR22: Faça um programa que receba o salário base e o tempo de serviço de um funcionário. Calcule e mostre:
		
		- O imposto, conforme a tabela a seguir.
		- A gratificação, de acordo com a tabela a seguir.
		- O salário líquido, ou seja, salário base menos imposto mais gratificação.
		- A categoria, que está na tabela a seguir.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o salário base?: ");
		float salario_base = sc.nextFloat();
		
		System.out.print("Qual é o tempo de serviço?(anos): ");
		int tempo = sc.nextInt();
		
		float imposto;
		if (salario_base < 200) imposto = 0;
		else if (salario_base >= 200 & salario_base <= 450) imposto = 0.03f * salario_base;
		else if (salario_base > 450 & salario_base < 700) imposto = 0.08f * salario_base;
		else imposto = 0.12f * salario_base;
		System.out.println("Este é o valor do imposto: R$ " + imposto);
		//CALCULANDO ACIMA O IMPOSTO 
		
		
		int gratificação;
		if (salario_base > 500) 
		{
			if (tempo <= 3) gratificação = 20;
			else gratificação = 30;
		}
		else 
		{
			if (tempo <= 3) gratificação = 23;
			else if (tempo > 3 & tempo < 6) gratificação = 35;
			else gratificação = 33;
		}
		System.out.println("Este é o valor da gratificação: R$ " + gratificação);
		//CALCULANDO A GRATIFICAÇÃO
		
		
		float salario_liquido = salario_base - imposto + gratificação;
		System.out.println(salario_liquido + "(salário líquido) = " + salario_base + "(salário_base) - " + imposto + "(imposto) + " + gratificação + "(gratificação)" );
		if (salario_liquido < 350) System.out.print("O salário líquido está na classificação A");
		else if (salario_liquido >= 350 & salario_liquido <= 600) System.out.print("O salário líquido está na classificação B");
		else System.out.print("O salário líquido está na classificação C");
		
		
		
	}

}
